/**
 * All rights Reserved, Designed By www.xcompany.com  
 * @Package com.job.scheduled   
 * @Description:    TODO 描述   
 * @author: Frankjiu
 * @date:   2020年4月12日下午8:14:22
 * @version V1.0
 */

package com.job.scheduled;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Schedule Job Config
 * 
 * @author: Frankjiu
 * @date: 2020年4月12日 下午8:14:22
 */
@Component
public class TimeSchedule {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Scheduled(fixedDelay = 60000)
	public void fixedDelay() {
		logger.info("######fixedDelay:{}, after finish this task and wait for n/1000 s then next.", new Date());
	}

	@Scheduled(cron = "0 * * * * ?")
	public void cron() {
		logger.info("######executed one time per minute for cron:{}", new Date());
	}

}
