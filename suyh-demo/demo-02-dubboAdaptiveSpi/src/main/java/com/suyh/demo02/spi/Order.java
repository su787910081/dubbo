package com.suyh.demo02.spi;

import com.alibaba.dubbo.common.extension.SPI;

@SPI("alipay")
public interface Order {
    String way();
}
