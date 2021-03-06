package cn.zhen77.momo.ums.service.impl;

import cn.zhen77.momo.ums.entity.UmsMember;
import cn.zhen77.momo.ums.mapper.UmsMemberMapper;
import cn.zhen77.momo.ums.service.UmsMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author 孙朕
 * @since 2021-02-12
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {
    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Override
    public String register() {
        UmsMember u = new UmsMember();
        u.setNickName("c");
        umsMemberMapper.insert(u);

        return "success";
    }
}

