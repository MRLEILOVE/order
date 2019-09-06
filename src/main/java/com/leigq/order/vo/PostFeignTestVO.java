package com.leigq.order.vo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * Feign 远程调用 POST 请求测试 VO
 */
@Data
@Builder
public class PostFeignTestVO implements Serializable {

	private static final long serialVersionUID = -3913111427273324367L;

	private Long id;

	private String name;

}
