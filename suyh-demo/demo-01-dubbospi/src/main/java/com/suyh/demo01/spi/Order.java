package com.suyh.demo01.spi;

import com.alibaba.dubbo.common.extension.SPI;

@SPI("alipay")
public interface Order {
    String way();
}
