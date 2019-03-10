package com.leigq.order.test;

import com.leigq.order.config.GirlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试获取指定前缀的属性配置，使用Bus自动刷新
 * <p>
 * 创建人：LeiGQ <br>
 * 创建时间：2019/3/10 20:35 <br>
 * <p>
 * 修改人： <br>
 * 修改时间： <br>
 * 修改备注： <br>
 * </p>
 */
@RestController
public class GirlController {

    @Autowired
    private GirlConfig girlConfig;

    @GetMapping("/girls")
    public String getGirls() {
        return String.format("姓名：%s, 年龄：%s", girlConfig.getName(), girlConfig.getAge());
    }
}
