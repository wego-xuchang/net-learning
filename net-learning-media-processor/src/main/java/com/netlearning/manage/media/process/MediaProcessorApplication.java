package com.netlearning.manage.media.process;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: net-learning
 * @description:
 * @author: XUCHANG
 * @time: 2019/12/12 10:51
 */
@SpringBootApplication
@EntityScan("com.netlearning.framework.domain.media")//扫描实体类
@ComponentScan(basePackages={"com.netlearning.api"})//扫描api接口
@ComponentScan(basePackages={"com.netlearning.manage.media.process"})//扫描本项目下的所有类
@ComponentScan(basePackages={"com.netlearning.framework"})
@EnableEurekaClient
public class MediaProcessorApplication {
    public static void main(String[] args) {
        SpringApplication.run(MediaProcessorApplication.class, args);
    }
}
