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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Quartz JobOne
 * 
 * @author: Frankjiu
 * @date: 2020年4月12日 下午11:36:12
 */
@Component
public class JobOne {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public void doJobOne() {
		logger.info("#########JobOneExecuting:{}...", new Date());
	}

}
