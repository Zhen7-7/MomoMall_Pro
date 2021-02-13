package cn.zhen77.momo.portal.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : zhen77
 * @date: 2021/2/13 - 02 - 13 - 11:42
 * @Description: cn.zhen77.momo.portal.web.controller.cn.zhen77.momo.portal.web
 * @version: 1.0
 */
@SpringBootApplication(scanBasePackages = {"cn.zhen77"})
@MapperScan("cn.zhen77.momo.ums")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
