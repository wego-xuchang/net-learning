package com.netlearning.user.mapper;

import com.netlearning.framework.domain.userAuth.Role;
import com.netlearning.framework.domain.userAuth.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Long roleId);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Long roleId);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}
