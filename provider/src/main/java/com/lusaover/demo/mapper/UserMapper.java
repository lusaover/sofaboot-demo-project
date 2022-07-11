package com.lusaover.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lusaover.common.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
