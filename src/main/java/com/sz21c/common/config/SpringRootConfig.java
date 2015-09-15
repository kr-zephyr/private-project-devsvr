package com.sz21c.common.config;

import com.sz21c.common.config.mybatis.MyBatisConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by zephyr on 15. 8. 18..
 */
@Configuration
@ComponentScan(
        basePackages = "com.sz21c", useDefaultFilters=false,
        includeFilters={@ComponentScan.Filter(Controller.class)
                , @ComponentScan.Filter(Service.class)
                , @ComponentScan.Filter(Repository.class)}
)
@Import({MyBatisConfig.class})
public class SpringRootConfig {
}
