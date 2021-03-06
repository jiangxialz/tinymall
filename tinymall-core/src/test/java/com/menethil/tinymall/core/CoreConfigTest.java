package com.menethil.tinymall.core;

import com.menethil.tinymall.core.express.config.ExpressConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CoreConfigTest {
    @Autowired
    ExpressConfig config;
    @Autowired
    Environment environment;

    @Test
    public void test() {
        System.out.println(config.getAppId());
        System.out.println(config.getAppKey());
        // 测试获取application-core.yml配置信息
        System.out.println(environment.getProperty("tinymall.core.express.appId"));
    }
}