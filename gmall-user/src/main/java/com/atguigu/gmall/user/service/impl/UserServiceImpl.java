package com.atguigu.gmall.user.service.impl;


import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.atguigu.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述：
 *
 * @ClassName UserServiceImpl
 * @Author Administrator
 * @Date 2019/8/30 0030 17:34
 * @Version 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers=userMapper.selectAll();
        return umsMembers;

    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress=new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> select = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return select;
    }
}
