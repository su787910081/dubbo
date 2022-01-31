package com.suyh.demo03.spi;

import com.alibaba.dubbo.common.URL;

public class AlipayGoodsOrder implements GoodsOrder {
    @Override
    public String way() {
        System.out.println("---  使用支付宝支付  ---");
        return "支付宝支付";
    }

    @Override
    public String pay(URL url) {
        System.out.println("---  使用支付宝支付  ---");
        return "支付宝支付";
    }
}
