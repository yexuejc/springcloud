package com.yexuejc.springcloud.simple.api.web;

import com.yexuejc.base.http.Resps;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务提供者
 *
 * @PackageName: com.yexuejc.springcloud.simple.api
 * @Description:
 * @author: maxf
 * @date: 2018/5/15 16:09
 */
@RestController
public class IndexCtrl {

    @RequestMapping("/")
    public Resps index() {
        return Resps.success().setSucc("simple-api");
    }
}
