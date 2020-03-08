package com.netlearning.framework.domain.course.param;

import lombok.Data;

@Data
public class TeachPlanMediaEditParam {
    private Long teachplanMediaId;

    private Long mediaId;

    private String mediaFileoriginalName;

    private String mediaUrl;

    private Long courseId;

    private Long teachplanId;

    private Long recordId;

}