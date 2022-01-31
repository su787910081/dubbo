package com.suyh.demo03.spi;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import org.junit.jupiter.api.Test;

class OrderTest {

    @Test
    public void test01() {
        ExtensionLoader<GoodsOrder> loader = ExtensionLoader.getExtensionLoader(GoodsOrder.class);
        GoodsOrder goodsOrder = loader.getAdaptiveExtension();
        // 未指定，使用默认的wechat
        URL url = URL.valueOf("xxx://localhost:8080/ooo/jjj");
        System.out.println(goodsOrder.pay(url));
    }

    @Test
    public void test02() {
        ExtensionLoader<GoodsOrder> loader = ExtensionLoader.getExtensionLoader(GoodsOrder.class);
        GoodsOrder goodsOrder = loader.getAdaptiveExtension();
        // 指定alipay: (goods.order=alipay)
        URL url = URL.valueOf("xxx://localhost:8080/ooo/jjj?goods.order=alipay");
        System.out.println(goodsOrder.pay(url));
    }
}