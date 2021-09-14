package com.shine.product.feign;

import com.shine.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient("order")
public interface OrderRemoteService {

    @RequestMapping("order/omsorder/list")
    R list(@RequestParam Map<String, Object> params);
}
