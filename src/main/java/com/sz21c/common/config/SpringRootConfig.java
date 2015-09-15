package com.sz21c.common.config;

import com.sz21c.common.config.mybatis.MyBatisConfig;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan(
        basePackages = "com.sz21c", useDefaultFilters=false,
        includeFilters={@ComponentScan.Filter(Controller.class)
                , @ComponentScan.Filter(Service.class)
                , @ComponentScan.Filter(Repository.class)}
)
@Import({MyBatisConfig.class})
public class SpringRootConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }

}
