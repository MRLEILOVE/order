package com.leigq.order.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 配置中心测试
 * <br>
 * 测试是否真的读取到了远程配置中心里面的订单配置文件
 * <p>
 * 创建人：LeiGQ <br>
 * 创建时间：2019/3/9 23:18 <br>
 * <p>
 * 修改人： <br>
 * 修改时间： <br>
 * 修改备注： <br>
 * </p>
 */
@RestController
@RequestMapping("/test")
public class EnvController {

    @Value("${env}")
    private String env;

    @GetMapping("/envs")
    public String getEnv() {
        return env;
    }

}
