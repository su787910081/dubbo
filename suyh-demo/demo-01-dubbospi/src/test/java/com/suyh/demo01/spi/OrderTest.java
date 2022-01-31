package com.suyh.demo01.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import org.junit.jupiter.api.Test;

class OrderTest {

    @Test
    public void test01() {
        ExtensionLoader<Order> loader = ExtensionLoader.getExtensionLoader(Order.class);
        Order alipay = loader.getExtension("alipay");
        System.out.println(alipay.way());
        Order wechat = loader.getExtension("wechat");
        System.out.println(wechat.way());
        Order defaultOrder = loader.getExtension("default");
        System.out.println(defaultOrder.way());
    }
}