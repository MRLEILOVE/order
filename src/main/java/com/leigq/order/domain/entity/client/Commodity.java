package com.leigq.order.domain.entity.client;

import com.leigq.order.bean.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * 商品实体
 * <p>
 * 创建人：LeiGQ <br>
 * 创建时间：2019-03-06 20:40 <br>
 * <p>
 * 修改人： <br>
 * 修改时间： <br>
 * 修改备注： <br>
 * </p>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Commodity extends BaseEntity {

    /**
	* 商品名称
	*/
    private String name;

    /**
	* 单价
	*/
    private BigDecimal price;

    /**
	* 类型Id
	*/
    private Long ctId;

}