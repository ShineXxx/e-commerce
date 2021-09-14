package com.shine.product.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.shine.product.feign.OrderRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.shine.product.entity.PmsAttrEntity;
import com.shine.product.service.PmsAttrService;
import com.shine.common.utils.PageUtils;
import com.shine.common.utils.R;


/**
 * 商品属性
 *
 * @author zhaoyao
 * @email zhaoyaoya@gmail.com
 * @date 2021-09-13 22:04:14
 */
@RestController
@RequestMapping("coupon/pmsattr")
public class PmsAttrController {
    @Autowired
    private PmsAttrService pmsAttrService;
    @Autowired
    private OrderRemoteService orderRemoteService;

    /**
     * 列表
     */
    @GetMapping("/list")
    public R list() {
        Map<String, Object> params = new HashMap<>();
        params.put("limit", 1);
        params.put("page", 1);
        PageUtils page = pmsAttrService.queryPage(params);
        return R.ok().put("page", page).put("order-list", orderRemoteService.list(params));
    }


    /**
     * 信息
     */
    @GetMapping("/info/{attrId}")
    public R info(@PathVariable("attrId") Long attrId) {
        PmsAttrEntity pmsAttr = pmsAttrService.getById(attrId);
        return R.ok().put("pmsAttr", pmsAttr);
    }

    /**
     * 保存
     */
    @PostMapping("/save")
    public R save(@RequestBody PmsAttrEntity pmsAttr) {
        pmsAttrService.save(pmsAttr);

        return R.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    public R update(@RequestBody PmsAttrEntity pmsAttr) {
        pmsAttrService.updateById(pmsAttr);

        return R.ok();
    }

    /**
     * 删除
     */
    @GetMapping("/delete")
    public R delete(@RequestBody Long[] attrIds) {
        pmsAttrService.removeByIds(Arrays.asList(attrIds));

        return R.ok();
    }

}
