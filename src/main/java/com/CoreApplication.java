package com;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.controller.InitController;
import com.utils.SpringUtil;

/**
 * Starter
 * 
 * @author: Frankjiu
 * @date: 2020年3月31日 下午9:36:16
 *
 */
// @SpringBootConfiguration
// @EnableAutoConfiguration
// @ComponentScan("com")
@SpringBootApplication
@ServletComponentScan
@MapperScan("com.mapper")
@EnableCaching
@EnableScheduling
@EnableBatchProcessing
@EnableDiscoveryClient
public class CoreApplication {

	private static final Logger logger = LoggerFactory.getLogger(CoreApplication.class);

	@Autowired
	InitController initController;

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
		InitController initCtl = (InitController) SpringUtil.getBean("initController");
		String initInfo = initCtl.init();
		logger.info("读取配置文件信息:{}", initInfo);
	}

}
