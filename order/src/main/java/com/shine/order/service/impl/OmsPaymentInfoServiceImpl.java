package com.shine.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shine.common.utils.PageUtils;
import com.shine.common.utils.Query;

import com.shine.order.dao.OmsPaymentInfoDao;
import com.shine.order.entity.OmsPaymentInfoEntity;
import com.shine.order.service.OmsPaymentInfoService;


@Service("omsPaymentInfoService")
public class OmsPaymentInfoServiceImpl extends ServiceImpl<OmsPaymentInfoDao, OmsPaymentInfoEntity> implements OmsPaymentInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OmsPaymentInfoEntity> page = this.page(
                new Query<OmsPaymentInfoEntity>(params).getPage(),
                new QueryWrapper<OmsPaymentInfoEntity>()
        );

        return new PageUtils(page);
    }

}