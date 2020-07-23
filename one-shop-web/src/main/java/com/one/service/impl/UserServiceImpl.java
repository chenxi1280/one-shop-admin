package com.one.service.impl;

import com.one.pojo.vo.UserVO;
import com.one.service.UserService;
import com.onequery.UserQuery;
import org.springframework.stereotype.Service;

/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Date 2020/7/20 14:39
 * @CreateComputer by PC
 * @Created by cxd
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserVO selectDbUserByPhone(UserQuery query) {
        return null;
    }
}
