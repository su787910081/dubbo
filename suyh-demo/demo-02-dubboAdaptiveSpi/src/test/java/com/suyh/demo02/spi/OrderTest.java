package com.suyh.demo02.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import org.junit.jupiter.api.Test;

class OrderTest {

    @Test
    public void test01() {
        ExtensionLoader<Order> loader = ExtensionLoader.getExtensionLoader(Order.class);
        Order order = loader.getAdaptiveExtension();
        System.out.println(order.way());
    }
    @Test
    public void test02() {
        ExtensionLoader<Order> loader = ExtensionLoader.getExtensionLoader(Order.class);
        Order order = loader.getAdaptiveExtension();
        ((AdaptiveOrder)order).setDefaultName("wechat");
        System.out.println(order.way());
    }
}