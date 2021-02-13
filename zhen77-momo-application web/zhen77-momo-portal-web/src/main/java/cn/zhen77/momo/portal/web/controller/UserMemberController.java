package cn.zhen77.momo.portal.web.controller;

import cn.zhen77.momo.ums.entity.UmsMember;
import cn.zhen77.momo.ums.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zhen77
 * @date: 2021/2/13 - 02 - 13 - 11:32
 * @Description: cn.zhen77.momo.portal.web.controller
 * @version: 1.0
 */
@RestController
@RequestMapping("/user-member")
public class UserMemberController {
    @Autowired
    UmsMemberService umsMemberService;

    @GetMapping("/hello")
    public String hello(){
        return  "hello";
    }

    @GetMapping("/register")
    public String register(){

        umsMemberService.register();
        return "register";
    }
}
