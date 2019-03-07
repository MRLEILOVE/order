package com.leigq.order.controller;

import com.leigq.order.bean.Response;
import com.leigq.order.domain.entity.OrderMaster;
import com.leigq.order.service.OrderMasterService;
import com.leigq.order.vo.OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * 订单
 * <p>
 * 创建人：LeiGQ <br>
 * 创建时间：2019-03-07 09:58 <br>
 * <p>
 * 修改人： <br>
 * 修改时间： <br>
 * 修改备注： <br>
 * </p>
 */
@RestController
public class OrderMasterController {

    @Autowired
    private OrderMasterService orderMasterService;

    @Autowired
    private Response response;

    /**
     * 添加订单
     * <br>创建人： leiGQ
     * <br>创建时间： 2019-03-07 10:16
     * <p>
     * 修改人： <br>
     * 修改时间： <br>
     * 修改备注： <br>
     * </p>
     * <br>
     * @param orderMaster 订单实体
     * @return
     */
    @PostMapping("/orders")
    public Response saveOrders(OrderVO orderVO) {

//        Long orderId = orderMasterService.saveOrders(orderVO);
//        if (orderId > 0) {
//            orderMaster = orderMasterService.getOrders(orderId);
//            if (Objects.nonNull(orderMaster)) {
//                return response.success("添加订单成功！", orderMaster);
//            }
//        }
        return response.failure("添加订单失败！", null);
    }


}
