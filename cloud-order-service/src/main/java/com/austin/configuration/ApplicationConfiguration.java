package com.austin.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * Created by denghao0706 on 2017/12/14.
 */
@Configuration
public class ApplicationConfiguration {

    @Bean
    public MappingJackson2JsonView mappingJackson2JsonView() {
        return new MappingJackson2JsonView();
    }
}
