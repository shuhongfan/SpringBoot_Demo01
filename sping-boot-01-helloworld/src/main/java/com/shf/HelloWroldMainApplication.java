package com.shf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 主程序类，主入口类
 */
//@ImportResource(locations = {"classpath:bean.xml"})
@SpringBootApplication // 标注一个主程序类，说明这是一个Spring-boot应用
public class HelloWroldMainApplication {
    public static void main(String[] args) {
//        spring启动
        SpringApplication.run(HelloWroldMainApplication.class,args);
    }
}


/**
 * @Target({ElementType.TYPE})
 * @Retention(RetentionPolicy.RUNTIME)
 * @Documented
 * @Inherited
 * @SpringBootConfiguration  sping-boot配置类，配置类也是容器中的一个组件 @Component
 * @EnableAutoConfiguration  开启自动配置功能
 * @ComponentScan(
 *     excludeFilters = {@Filter(
 *     type = FilterType.CUSTOM,
 *     classes = {TypeExcludeFilter.class}
 * ), @Filter(
 *     type = FilterType.CUSTOM,
 *     classes = {AutoConfigurationExcludeFilter.class}
 * )}
 * )
 * public @interface SpringBootApplication {
 */

/**  @EnableAutoConfiguration
 * @Target(ElementType.TYPE)
 * @Retention(RetentionPolicy.RUNTIME)
 * @Documented
 * @Inherited
 * @AutoConfigurationPackage  //  自动配置包
 * @Import(EnableAutoConfigurationImportSelector.class)  // 将主配置类的所在包及下面所有子包里面的所有组件扫描到spring容器
 * public @interface EnableAutoConfiguration {
 */