/**
 * All rights Reserved, Designed By www.xcompany.com  
 * @Package com.funcbean.shiro   
 * @Description:    TODO 描述   
 * @author: Frankjiu
 * @date:   2020年4月7日上午11:53:25
 * @version V1.0
 */

package com.exception;

import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * Global UnAuthorizationException Handler
 * 
 * @author: Frankjiu
 * @date: 2020年4月7日 上午11:53:25
 */
@ControllerAdvice
public class UnAuthorizationExceptionController {

	@ExceptionHandler(AuthorizationException.class)
	public ModelAndView error(AuthorizationException e) {
		ModelAndView mv = new ModelAndView("unauthorized");
		mv.addObject("error", e.getMessage());
		return mv;
	}
}
