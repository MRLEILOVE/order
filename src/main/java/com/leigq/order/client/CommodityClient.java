package com.leigq.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 需要调用商品服务的接口定义
 * <p>
 * 创建人：LeiGQ <br>
 * 创建时间：2019-03-07 15:24 <br>
 * <p>
 * 修改人： <br>
 * 修改时间： <br>
 * 修改备注： <br>
 * </p>
 */
@FeignClient("commodity")
public interface CommodityClient {

    @GetMapping("/messages")
    String getCommodityMessages();

}
