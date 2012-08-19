/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.core.config;

import com.techdhoom.socialstudent.database.config.DatabaseApplicationConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 *
 * @author mpritmani
 */
@Configuration
@ComponentScan(basePackages={"com.techdhoom.universitynetworking.core"})
//@ComponentScan.Filter(type= FilterType.ANNOTATION, value=CoreApplicationConfig.class)
@Import(DatabaseApplicationConfig.class)
@ImportResource("classpath:cache-context.xml")
public class CoreApplicationConfig {
    
}
