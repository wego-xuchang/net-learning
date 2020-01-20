package com.netlearning.auth.client;

import com.netlearning.framework.base.CommonResult;
import com.netlearning.framework.client.NetLearningServiceList;
import com.netlearning.framework.domain.userAuth.Teacher;
import com.netlearning.framework.domain.userAuth.TeacherAddRequest;
import com.netlearning.framework.domain.userAuth.result.TeacherResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @program: net-learning
 * @description:
 * @author: XUCHANG
 * @time: 2020/1/11 15:59
 */
@Component
@FeignClient(value = NetLearningServiceList.NET_LEARNING_USER_AUTH)
public interface TeacherControllerClientApi {
    @GetMapping("/teacher/query")
    public CommonResult<List<TeacherResult>> queryByEmail(@RequestParam(value = "email",required = false) String email,
                                                          @RequestParam(value = "password",required = false) String password);

    @GetMapping("/teacher/query")
    public CommonResult<List<TeacherResult>> queryTeacherByEmail(@RequestParam(value = "email",required = false) String email);

    @GetMapping("/teacher/query")
    public CommonResult<List<TeacherResult>> queryByMobile(@RequestParam(value = "mobile",required = false) String mobile,
                                                           @RequestParam(value = "password",required = false) String password);
    @GetMapping("/teacher/query")
    public CommonResult<List<TeacherResult>> queryTeacherByMobile(@RequestParam(value = "mobile",required = false) String mobile);


    @PostMapping("/teacher/add")
    public CommonResult<Boolean> add(@RequestBody TeacherAddRequest teacher);

    @PostMapping("/teacher/edit")
    public CommonResult<Boolean> edit(@RequestBody Teacher teacher);

}
