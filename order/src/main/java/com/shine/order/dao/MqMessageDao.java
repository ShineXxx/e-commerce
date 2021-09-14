package com.shine.order.dao;

import com.shine.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author zhaoyao
 * @email zhaoyaoya@gmail.com
 * @date 2021-09-14 21:38:56
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
