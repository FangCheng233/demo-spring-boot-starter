package com.example.demo;

import com.demo.starter.extract.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName Controller
 * @Description TODO
 * @Author fangcheng
 * @Date 2020/10/30 8:52 下午
 * @Version 1.0
 */
@RestController
public class Controller {

    @Resource(name = "demo")
    private DemoService demoService1111;

    @GetMapping("/say")
    public String sayWhat() {
        return demoService1111.say();
    }
}
