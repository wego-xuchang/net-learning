package com.netlearning.fss.mapper;

import org.springframework.stereotype.Repository;

/**
 * @program: net-learning
 * @description:
 * @author: XUCHANG
 * @time: 2019/12/4 19:07
 */
@Repository
public interface FileTypeMapper {
    void insert();

    void delete();

    void update();
}
