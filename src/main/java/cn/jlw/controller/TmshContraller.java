package cn.jlw.controller;

import cn.jlw.dao.MerchandiseMapper;
import cn.jlw.entity.Merchandise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Description:
 * @Author: 杨轩
 * @CreateDate: 2019/4/18 11:17
 */
@Controller
@RequestMapping("tmsh")
public class TmshContraller {

    @Autowired
    MerchandiseMapper merchandiseMapper;
    @RequestMapping(value = "research",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String research(String condition, HttpSession session) {
        if (condition == null) {
            condition = "日常用品";
        }
        List<Merchandise> list = merchandiseMapper.findMerchandise(condition);
        if (list != null) {
            session.setAttribute("list",list);
        }
        return "userfindmerchandise";
    }
}
