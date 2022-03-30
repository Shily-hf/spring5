package edu.shily.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Shily-zhang
 * @Description
 */

@Configuration//作为配置类，替代xml文件
@ComponentScan(basePackages = {"edu.shily"})
public class SpringConfig {

}
