package com.lusaover.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lusaover.common.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author lusao
 * @date 2022/7/12 15:22
 * @version 1.0
 */
@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {
}
