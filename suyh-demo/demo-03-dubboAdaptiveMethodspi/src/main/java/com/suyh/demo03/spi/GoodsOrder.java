package com.suyh.demo03.spi;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

@SPI("wechat")
public interface GoodsOrder {
    String way();

    @Adaptive
    String pay(URL url);
}
