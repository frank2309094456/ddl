/**
 * All rights Reserved, Designed By www.xcompany.com
 * 
 * @Package com.appconfig.websocket
 * @Description: TODO 描述
 * @author: Frankjiu
 * @date: 2020年4月8日上午9:34:20
 * @version V1.0
 */

package com.appconfig.websocket;

/**
 * WebSocket Security Config
 * 
 * @author: Frankjiu
 * @date: 2020年4月8日 上午9:34:20
 */
/*
 * @EnableWebSecurity public class WebSecurityConfig extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Bean PasswordEncoder passwordEncoder() { return new BCryptPasswordEncoder();
 * }
 * 
 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
 * Exception {
 * auth.inMemoryAuthentication().withUser("admin").password(passwordEncoder().
 * encode("admin")).roles("admin").and()
 * .withUser("frank").password(passwordEncoder().encode("123456")).roles("user")
 * ;
 * 
 * }
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * http.authorizeRequests().anyRequest().authenticated()
 * 
 * .and().csrf().requireCsrfProtectionMatcher(new RequestMatcher() {
 * 
 * @Override public boolean matches(HttpServletRequest httpServletRequest) {
 * String servletPath = httpServletRequest.getServletPath(); return
 * !servletPath.contains("/druid"); } })
 * 
 * 
 * .and().formLogin().loginProcessingUrl("/login").permitAll().and().csrf().
 * disable();
 * 
 * }
 * 
 * }
 */
