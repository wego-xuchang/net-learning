package com.netlearning.user.service;

import com.netlearning.framework.base.CommonPageInfo;
import com.netlearning.framework.base.CommonPageResult;
import com.netlearning.framework.base.CommonResult;
import com.netlearning.framework.domain.userAuth.UserConfig;
import com.netlearning.framework.domain.userAuth.UserConfigParam;
import com.netlearning.framework.domain.userAuth.param.UserConfigAddParam;
import com.netlearning.framework.domain.userAuth.param.UserConfigDeleteParam;
import com.netlearning.framework.domain.userAuth.param.UserConfigEditParam;

import java.util.List;

/**
 * @program: net-learning
 * @description:
 * @author: XUCHANG
 * @time: 2019/12/20 17:26
 */
public interface UserConfigService {
    CommonResult<List<UserConfig>> query(UserConfigParam userConfigParam);

    CommonResult<CommonPageResult<UserConfig>> page(UserConfigParam userConfigParam, CommonPageInfo commonPageInfo);

    CommonResult<Boolean> add(UserConfigAddParam userConfig);

    CommonResult<Boolean> edit(UserConfigEditParam userConfig);

    CommonResult<Boolean> delete(UserConfigDeleteParam param);
}
