package com.shine.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shine.common.utils.PageUtils;
import com.shine.common.utils.Query;

import com.shine.product.dao.PmsBrandDao;
import com.shine.product.entity.PmsBrandEntity;
import com.shine.product.service.PmsBrandService;


@Service("pmsBrandService")
public class PmsBrandServiceImpl extends ServiceImpl<PmsBrandDao, PmsBrandEntity> implements PmsBrandService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsBrandEntity> page = this.page(
                new Query<PmsBrandEntity>(params).getPage(),
                new QueryWrapper<PmsBrandEntity>()
        );

        return new PageUtils(page);
    }

}