package com.netlearning.user.service;

import com.netlearning.framework.base.CommonPageInfo;
import com.netlearning.framework.base.CommonPageResult;
import com.netlearning.framework.base.CommonResult;
import com.netlearning.framework.domain.userAuth.User;
import com.netlearning.framework.domain.userAuth.UserParam;

import java.util.List;

/**
 * @program: net-learning
 * @description:
 * @author: XUCHANG
 * @time: 2019/12/20 16:11
 */
public interface UserService {
    CommonResult<List<User>> query(UserParam userParam);

    CommonResult<CommonPageResult<User>> page(UserParam userParam, CommonPageInfo commonPageInfo);

    CommonResult<Boolean> add(User user);

    CommonResult<Boolean> edit(User user);

    CommonResult<Boolean> delete(Long userId);
}
