package cn.suimg.ls;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import cn.suimg.ls.filter.IndexFilter;

/**
 * Web Config
 *
 * @author suimg
 *
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

	/**
	 * 首页过滤器
	 * @return
	 */
	@Bean
	public FilterRegistrationBean indexFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new IndexFilter());
		registration.addUrlPatterns("*");
		registration.setName("indexFilter");
		return registration;
	}
}