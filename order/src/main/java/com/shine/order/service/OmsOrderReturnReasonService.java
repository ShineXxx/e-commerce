package com.shine.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shine.common.utils.PageUtils;
import com.shine.order.entity.OmsOrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author zhaoyao
 * @email zhaoyaoya@gmail.com
 * @date 2021-09-14 21:38:56
 */
public interface OmsOrderReturnReasonService extends IService<OmsOrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

