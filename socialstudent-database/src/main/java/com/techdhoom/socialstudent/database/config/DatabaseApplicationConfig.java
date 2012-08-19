/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author mpritmani
 */
@Configuration
@ComponentScan(basePackages={"com.techdhoom.universitynetworking.database"})
//@ComponentScan.Filter(type= FilterType.ANNOTATION, value=DatabaseApplicationConfig.class)
@EnableTransactionManagement
@PropertySource({"jdbc.properties"})
public class DatabaseApplicationConfig {

    @Autowired
    Environment env;
    
    @Bean
    public DataSource dataSourcePBalance() {
        DataSource dataSrc = new DriverManagerDataSource(env.getProperty("jdbc.driverClassName"), env.getProperty("jdbc.url"), env.getProperty("jdbc.username"), env.getProperty("jdbc.password"));
        System.out.println("ds created.........................");
        return dataSrc;
    }
    
    @Bean
    public AnnotationSessionFactoryBean sessionFactoryPBalance() {
        AnnotationSessionFactoryBean annotationBean = new AnnotationSessionFactoryBean();
        annotationBean.setDataSource(dataSourcePBalance());
        annotationBean.setSchemaUpdate(true);
        annotationBean.setPackagesToScan(new String[] {"com.techdhoom.universitynetworking.model"});
        Properties props = new Properties();
        InputStream in = getClass().getResourceAsStream("/hibernate.properties");
        try {
            props.load(in);
        } catch (IOException ex) {
            System.out.println("got error......................");
            Logger.getLogger(DatabaseApplicationConfig.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        annotationBean.setHibernateProperties(props);
        System.out.println("sf created........................");
        return annotationBean;
    }
    
    @Bean
    public HibernateTemplate hibernateTemplate() {
        HibernateTemplate ht = new HibernateTemplate(sessionFactoryPBalance().getObject());
        System.out.println("ht created..........................");
        return ht;
    }
    
    @Bean
    public HibernateTransactionManager transactionManager() {
        HibernateTransactionManager htm = new HibernateTransactionManager(sessionFactoryPBalance().getObject());
        System.out.println("htm created...........................");
        return htm;
    }
    
}
