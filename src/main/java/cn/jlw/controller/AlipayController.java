package cn.jlw.controller;

import cn.jlw.entity.Merchandise;
import cn.jlw.entity.ShopOrder;
import cn.jlw.service.MerchandiseService;
import cn.jlw.service.ShopOrderService;
import cn.jlw.utils.AlipayConfig;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description:
 * @Author: 杨轩
 * @CreateDate: 2019/4/10 14:01
 */

@RequestMapping("alipay")
public class AlipayController {
    @Autowired
    ShopOrderService shopOrderService;
    @Autowired
    MerchandiseService merchandiseService;
    @RequestMapping(value = "goAlipay", produces = "text/html; charset=UTF-8")
    @ResponseBody
    public String goAlipay(String orderId, HttpServletRequest request, HttpServletRequest response) throws Exception {
        ShopOrder order = shopOrderService.getShopOrder(orderId);

        Merchandise merchandise = merchandiseService.getMerchandise(order.getMerchandiseId());

        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl,
                AlipayConfig.app_id,
                AlipayConfig.merchant_private_key,
                "json",
                AlipayConfig.charset,
                AlipayConfig.alipay_public_key,
                AlipayConfig.sign_type);

        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

        //商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no = "20190410";
        //付款金额，必填
        String total_amount = "0.01";
        //订单名称，必填
        String subject = "1";
        //商品描述，可空
        String body = "用户订购商品个数：" + 1;

        // 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
        String timeout_express = "1c";

        alipayRequest.setBizContent("{" +
                        "    \"out_trade_no\":\""+ out_trade_no +"\"," +
                        "    \"product_code\":\"FAST_INSTANT_TRADE_PAY\"," +
                        "    \"total_amount\":"+ total_amount +"," +
                        "    \"subject\":\""+ subject +"\"," +
                        "    \"body\":\""+ body +"\"" +
                        "    }"+
                        "  }"
                  );

        //请求
        String result = alipayClient.pageExecute(alipayRequest).getBody();

        return result;
    }
    @RequestMapping(value = "gopay")
    public ModelAndView goPay(String orderId) {
        ShopOrder orders = shopOrderService.getShopOrder(orderId);
        Merchandise product = merchandiseService.getMerchandise(orders.getMerchandiseId());
        ModelAndView mv = new ModelAndView();
        mv.addObject("order", orders);
        mv.addObject("p", product);
        return mv;
    }
}
