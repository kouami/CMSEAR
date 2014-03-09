/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dev.emmanuel.cmsweb.config;

import freemarker.cache.FileTemplateLoader;
import java.io.File;
import java.io.IOException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

/**
 *
 * @author Emmanuel
 */
@Configuration
public class FreemarkerConfig {
    
    @Bean(name = "freeMarkerviewResolver")
    public FreeMarkerViewResolver freeMarkerviewResolver() {
        FreeMarkerViewResolver f = new FreeMarkerViewResolver();
        f.setPrefix("");
        f.setSuffix(".ftl");
        f.setExposeSpringMacroHelpers(true);
        f.setAllowSessionOverride(true);
        f.setExposeSessionAttributes(true);
        f.setAllowRequestOverride(true);
        f.setExposeRequestAttributes(true);
        f.setCache(true);
        return f;
    }

    @Bean(name = "freemarkerBaseDir")
    public File freemarkerBaseDir(String templateDir) {
        File f = new File(templateDir);
        return f;
    }
    
    @Bean(name="freemarkerTemplateLoader")
    public FileTemplateLoader freemarkerTemplateLoader() throws IOException {
        FileTemplateLoader ftl = new FileTemplateLoader(freemarkerBaseDir(""));
        return ftl;
    }
    
    @Bean(name="freemarkerTemplateConfig")
    public freemarker.template.Configuration freemarkerTemplateConfig() throws IOException{
        freemarker.template.Configuration c = new freemarker.template.Configuration();
        c.setDirectoryForTemplateLoading(freemarkerBaseDir(""));
        c.setDefaultEncoding("UTF-8");
        c.setLocalizedLookup(false);
        c.setTemplateLoader(freemarkerTemplateLoader());
        return c;
    }
    
    @Bean(name="freemarkerConfig")
    public FreeMarkerConfigurer freemarkerConfig() throws IOException {
        FreeMarkerConfigurer fc = new FreeMarkerConfigurer();
        fc.setConfiguration(freemarkerTemplateConfig());
        return fc;
    }
}
