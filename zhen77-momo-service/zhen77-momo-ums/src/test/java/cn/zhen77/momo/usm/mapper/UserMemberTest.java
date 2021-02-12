package cn.zhen77.momo.usm.mapper;

import cn.zhen77.momo.ums.entity.UmsMember;
import cn.zhen77.momo.ums.mapper.UmsMemberMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

/**
 * @author : zhen77
 * @date: 2021/2/12 - 02 - 12 - 14:44
 * @Description: cn.zhen77.momo.usm
 * @version: 1.0
 */
@SpringBootTest
public class UserMemberTest {

    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Test
    void testInset(){
        UmsMember t = new UmsMember();
        t.setUsername("皮卡丘");
        t.setStatus(1);
        t.setPassword("2");
        t.setNote("note");
        t.setNickName("nick");
        t.setEmail("email");
        int i = umsMemberMapper.insert(t);
        System.out.println(i==1?"添加成功":"添加失败");
    }
    @Test
    void testUpdate(){
        UmsMember t = new UmsMember();
        t.setId(15L);

        umsMemberMapper.updateById(t);
    }
 }
