package com.netlearning.framework.domain.course.ext;

import com.netlearning.framework.domain.course.CourseBase;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CourseInfo extends CourseBase {

    //课程图片
    private String pic;

}
