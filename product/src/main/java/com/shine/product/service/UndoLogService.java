package com.shine.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shine.common.utils.PageUtils;
import com.shine.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author zhaoyao
 * @email zhaoyaoya@gmail.com
 * @date 2021-09-13 22:04:14
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

