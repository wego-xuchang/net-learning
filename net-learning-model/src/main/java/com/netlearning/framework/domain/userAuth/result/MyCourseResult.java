package com.netlearning.framework.domain.userAuth.result;

import com.netlearning.framework.base.CommonPageResult;
import lombok.Data;

/**
 * @program: net-learning
 * @description:
 * @author: XUCHANG
 * @time: 2020/1/8 9:59
 */
@Data
public class MyCourseResult {
    private UserRecentlyLearningCourseResult userRecentlyLearningCourse;

    private CommonPageResult<UserAllCourseResult> userAllCourse;
}