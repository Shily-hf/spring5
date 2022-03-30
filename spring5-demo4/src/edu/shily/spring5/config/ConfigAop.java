package edu.shily.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Shily-zhang
 * @Description 完全注解开发，不需要使用配置文件
 */

@Configuration
@ComponentScan(basePackages = "edu.shily")//开启组件扫描
@EnableAspectJAutoProxy(proxyTargetClass = true)//替代Aspect生成代理对象
public class ConfigAop {
}
