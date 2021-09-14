package com.shine.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shine.common.utils.PageUtils;
import com.shine.order.entity.OmsOrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author zhaoyao
 * @email zhaoyaoya@gmail.com
 * @date 2021-09-14 21:38:56
 */
public interface OmsOrderReturnApplyService extends IService<OmsOrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

