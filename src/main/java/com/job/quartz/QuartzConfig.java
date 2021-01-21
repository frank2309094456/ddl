/**
 * All rights Reserved, Designed By www.xcompany.com  
 * @Package com.job.quartz   
 * @Description:    TODO 描述   
 * @author: Frankjiu
 * @date:   2020年4月12日下午11:48:11
 * @version V1.0
 */

package com.job.quartz;

import org.quartz.CronTrigger;
import org.quartz.JobDataMap;
import org.quartz.SimpleTrigger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;

/**
 * Quartz Job Config
 * 
 * @author: Frankjiu
 * @date: 2020年4月12日 下午11:48:11
 */
@Configuration
public class QuartzConfig {

	@Bean
	MethodInvokingJobDetailFactoryBean jobDetail1() {
		MethodInvokingJobDetailFactoryBean bean = new MethodInvokingJobDetailFactoryBean();
		bean.setTargetBeanName("jobOne");
		bean.setTargetMethod("doJobOne");
		return bean;
	}

	@Bean
	JobDetailFactoryBean jobDetail2() {
		JobDetailFactoryBean bean = new JobDetailFactoryBean();
		bean.setJobClass(JobTwo.class);
		JobDataMap dataMap = new JobDataMap();
		dataMap.put("name", "frank");
		bean.setJobDataMap(dataMap);
		bean.setDurability(true);
		return bean;
	}

	@Bean
	SimpleTriggerFactoryBean simpleTrigger() {
		SimpleTriggerFactoryBean bean = new SimpleTriggerFactoryBean();
		bean.setJobDetail(jobDetail1().getObject());
		bean.setRepeatCount(3);
		bean.setStartDelay(1000);
		bean.setRepeatInterval(30000);
		return bean;
	}

	@Bean
	CronTriggerFactoryBean cronTrigger() {
		CronTriggerFactoryBean bean = new CronTriggerFactoryBean();
		bean.setJobDetail(jobDetail2().getObject());
		bean.setCronExpression("0 */1 * * * ?");// every minute
		return bean;
	}

	@Bean
	SchedulerFactoryBean schedulerFactory() {
		SchedulerFactoryBean bean = new SchedulerFactoryBean();
		SimpleTrigger simpleTrigger = simpleTrigger().getObject();
		CronTrigger cronTrigger = cronTrigger().getObject();
		bean.setTriggers(simpleTrigger, cronTrigger);
		return bean;
	}

}
