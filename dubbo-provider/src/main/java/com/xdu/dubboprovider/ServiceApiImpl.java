package com.xdu.dubboprovider;

import com.alibaba.dubbo.config.annotation.Service;
import com.xdu.dubbointerface.service.ServiceApi;

/**
 * @author hujiaqi
 * @create 2020/5/7
 */

@Service(version = "1.0.0")
public class ServiceApiImpl implements ServiceApi {
    @Override
    public String sayHello(String message) {
        return "hello " + message;
    }
}
