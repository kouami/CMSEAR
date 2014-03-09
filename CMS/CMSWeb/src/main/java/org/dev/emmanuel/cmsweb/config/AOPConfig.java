/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dev.emmanuel.cmsweb.config;

import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Emmanuel
 */
@Configuration
public class AOPConfig {
    
    @Bean
    public AnnotationAwareAspectJAutoProxyCreator autoProxy(){
        AnnotationAwareAspectJAutoProxyCreator aop = new AnnotationAwareAspectJAutoProxyCreator();
        aop.setProxyTargetClass(true);
        return aop;
    }
}
