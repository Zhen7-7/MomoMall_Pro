package cn.zhen77.momo.ums.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author : zhen77
 * @date: 2021/2/12 - 02 - 12 - 21:21
 * @Description: cn.zhen77.momo.ums.config
 * @version: 1.0
 */
@Component
public class MyConfig implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        System.out.println("添加插入时间");
        this.setFieldValByName("gmtCreate",new Date(),metaObject);
        this.setFieldValByName("gmtModified",new Date(),metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        System.out.println("添加更新时间");

        this.setFieldValByName("gmtModified",new Date(),metaObject);
    }
}
