/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.dev.emmanuel.cmsweb.config;

import org.springframework.context.annotation.Import;

/**
 *
 * @author Emmanuel
 */
@Import({WebMvcConfig.class,FreemarkerConfig.class})
public class AppConfig {
}
