/**
 * All rights Reserved, Designed By www.xcompany.com  
 * @Package com.job.quartz   
 * @Description:    TODO 描述   
 * @author: Frankjiu
 * @date:   2020年4月12日下午11:36:12
 * @version V1.0
 */

package com.job.quartz;

import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Quartz JobTwo
 * 
 * @author: Frankjiu
 * @date: 2020年4月12日 下午11:36:12
 */
public class JobTwo extends QuartzJobBean {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param context
	 * @throws JobExecutionException
	 */
	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		logger.info("#########JobTwoExecuting:{}...name:{}", new Date(), name);
	}

}
