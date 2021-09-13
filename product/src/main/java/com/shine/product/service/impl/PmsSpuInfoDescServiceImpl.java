package com.shine.product.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shine.common.utils.PageUtils;
import com.shine.common.utils.Query;

import com.shine.product.dao.PmsSpuInfoDescDao;
import com.shine.product.entity.PmsSpuInfoDescEntity;
import com.shine.product.service.PmsSpuInfoDescService;


@Service("pmsSpuInfoDescService")
public class PmsSpuInfoDescServiceImpl extends ServiceImpl<PmsSpuInfoDescDao, PmsSpuInfoDescEntity> implements PmsSpuInfoDescService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsSpuInfoDescEntity> page = this.page(
                new Query<PmsSpuInfoDescEntity>(params).getPage(),
                new QueryWrapper<PmsSpuInfoDescEntity>()
        );

        return new PageUtils(page);
    }

}