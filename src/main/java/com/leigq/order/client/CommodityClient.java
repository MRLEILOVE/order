package com.leigq.order.client;

import com.leigq.order.domain.entity.client.Commodity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

    /**
     * Feign 远程调用服务端简单测试
     * <br>创建人： leiGQ
     * <br>创建时间： 2019-03-07 16:50
     * <p>
     * 修改人： <br>
     * 修改时间： <br>
     * 修改备注： <br>
     * </p>
     * <br>
     */
    @GetMapping("/messages")
    String getCommodityMessages();

    /**
     * 根据商品id查询商品
     * <br>创建人： leiGQ
     * <br>创建时间： 2019-03-07 16:48
     * <p>
     * 修改人： <br>
     * 修改时间： <br>
     * 修改备注： <br>
     * </p>
     * <br>
     * @param cId 商品id
     * @return 对应id的商品
     */
    @GetMapping("/commodities/{id}")
    Commodity getCommodities(@PathVariable("id") Long cId);

}
