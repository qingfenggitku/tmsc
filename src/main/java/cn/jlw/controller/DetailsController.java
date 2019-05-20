package cn.jlw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @Description:
 * @Author: 杨轩
 * @CreateDate: 2019/4/3 17:55
 */
@Controller
@RequestMapping("shopcart")
public class DetailsController {
    @RequestMapping(value = "detail", method = RequestMethod.POST/*,
            produces = "application/json;charset=UTF-8"*/)
    public String turnDetails(String merchandiseId, HttpSession session, Model model) {
        session.setAttribute("usr",1);
        model.addAttribute("merchadiseId", merchandiseId);
        System.out.println(merchandiseId);
        return "details";
    }
   @RequestMapping("jiliwangs")
    public String turnjuliwang() {
        return "jiuliwang";
    }



}
