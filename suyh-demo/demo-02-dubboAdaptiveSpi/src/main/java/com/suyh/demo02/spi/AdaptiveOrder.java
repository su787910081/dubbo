package com.suyh.demo02.spi;

import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Adaptive
public class AdaptiveOrder implements Order{
    @Setter
    private String defaultName;

    @Override
    public String way() {
        ExtensionLoader<Order> loader = ExtensionLoader.getExtensionLoader(Order.class);
        Order order;
        if (StringUtils.isEmpty(defaultName)) {
            // 获取注解@SPI() 上面的默认的name
            order = loader.getDefaultExtension();
        } else {
            order = loader.getExtension(defaultName);
        }

        return order.way();
    }
}
