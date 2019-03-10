package com.leigq.order.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * 测试获取指定前缀的属性配置，使用Bus自动刷新
 * <p>
 * 创建人：LeiGQ <br>
 * 创建时间：2019/3/10 20:29 <br>
 * <p>
 * 修改人： <br>
 * 修改时间： <br>
 * 修改备注： <br>
 * </p>
 */
@Component
@ConfigurationProperties(prefix = "girl")
@RefreshScope
@Data
public class GirlConfig {
    private String name;
    private Integer age;
}
