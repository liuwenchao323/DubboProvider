package net.wecash.dubbo.provider.impl;

import net.wecash.dubbo.provider.inter.IDemoService;

/**
 * Created by liu on 2016/7/12.
 */
public class DemoServiceImpl implements IDemoService {
    private int count;
    public String sayHello(String name) {
        System.out.println("method invoke:" + (++count));
        return "hello: "+ name + "count:" + count;
    }
}
