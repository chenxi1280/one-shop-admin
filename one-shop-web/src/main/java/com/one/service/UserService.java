package com.one.service;

import com.one.pojo.vo.UserVO;
import com.onequery.UserQuery;

/**
 * @Classname UserService
 * @Description TODO
 * @Date 2020/7/20 14:39
 * @CreateComputer by PC
 * @Created by cxd
 */
public interface UserService {
   UserVO selectDbUserByPhone(UserQuery query);
}
