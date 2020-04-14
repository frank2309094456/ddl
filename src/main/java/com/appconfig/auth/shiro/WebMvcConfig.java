/**
 * All rights Reserved, Designed By www.xcompany.com  
 * @Package com.funcbean.shiro   
 * @Description:    TODO 描述   
 * @author: Frankjiu
 * @date:   2020年4月7日上午11:46:47
 * @version V1.0
 */

package com.appconfig.auth.shiro;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * no permission required configuration
 * 
 * @author: Frankjiu
 * @date: 2020年4月7日 上午11:46:47
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/login").setViewName("login");
		registry.addViewController("/index").setViewName("index");
		registry.addViewController("/unauthorized").setViewName("unauthorized");

	}

}
