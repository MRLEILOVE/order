package com.leigq.order.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 订单VO
 * <p>
 * 创建人：LeiGQ <br>
 * 创建时间：2019-03-07 11:23 <br>
 * <p>
 * 修改人： <br>
 * 修改时间： <br>
 * 修改备注： <br>
 * </p>
 */
@Data
public class OrderVO {

    /**
     * 编号
     */
    private String code;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 0:未支付;1:已支付
     */
    private Boolean status;

}
