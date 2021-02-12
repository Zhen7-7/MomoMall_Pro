package cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

/**
 * @author : zhen77
 * @date: 2021/2/12 - 02 - 12 - 14:16
 * @Description: cn
 * @version: 1.0
 */
@SpringBootApplication
@MapperScan("cn.zhen77.momo.ums.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
