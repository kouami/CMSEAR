/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dev.emmanuel.cmsweb.config;

import java.util.Properties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerExceptionResolver;

/**
 *
 * @author Emmanuel
 */
@Configuration
public class ExceptionResolverConfig {
    
    @Bean
    public AnnotationMethodHandlerExceptionResolver annotationMethodHandlerExceptionReolver(){
        AnnotationMethodHandlerExceptionResolver ann = new AnnotationMethodHandlerExceptionResolver();
        ann.setOrder(1);
        return ann;
    }
    
    @Bean
    public SimpleMappingExceptionResolver simpleMappingExceptionResolver(){
        SimpleMappingExceptionResolver smer = new SimpleMappingExceptionResolver();
        smer.setOrder(2);
        smer.setDefaultErrorView("errorPage");
        Properties props = new Properties();
        props.setProperty("javax.servlet.ServletException", "errorPage404");
        smer.setExceptionMappings(props);
        return smer;
    }
}
