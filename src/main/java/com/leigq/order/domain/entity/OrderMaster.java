package com.leigq.order.domain.entity;

import com.leigq.order.bean.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.List;

/**
 * 订单实体
 * <p>
 * 创建人：LeiGQ <br>
 * 创建时间：2019-03-06 20:45 <br>
 * <p>
 * 修改人： <br>
 * 修改时间： <br>
 * 修改备注： <br>
 * </p>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class OrderMaster extends BaseEntity {
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

    /**
     * 订单Id
     */
    private Long omId;

    /**
     * 商品Id
     */
    private Long cId;

    /**
     * 数量
     */
    private Short number;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 订单明细
     */
    private List<OrderDetail> orderDetails;
}