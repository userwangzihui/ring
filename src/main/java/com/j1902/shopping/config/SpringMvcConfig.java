package com.j1902.shopping.config;

;
import com.j1902.shopping.intercept.LoginInterceptor;
import com.j1902.shopping.intercept.TestHandlerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

//WebMvcConfiguration === WebMvcConfigurationSupport
@SpringBootConfiguration
@MapperScan("com.j1902.shopping.mapper")
public class SpringMvcConfig extends WebMvcConfigurationSupport {
//    @Override
//    public void configurePathMatch(PathMatchConfigurer configurer) {
//        configurer.setUseRegisteredSuffixPatternMatch(true);
//    }
//
//    @Bean
//    public ServletRegistrationBean servletRegistrationBean(DispatcherServlet dispatcherServlet) {
//        ServletRegistrationBean<DispatcherServlet> servletServletRegistrationBean = new ServletRegistrationBean<>(dispatcherServlet);
//        servletServletRegistrationBean.addUrlMappings("*.html");
//        return servletServletRegistrationBean;
//    }


    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
       /* TestHandlerInterceptor testHandlerInterceptor = new TestHandlerInterceptor();*/
        LoginInterceptor loginInterceptor = new LoginInterceptor();
       /* registry.addInterceptor(testHandlerInterceptor).addPathPatterns("/**");*/
        registry.addInterceptor(loginInterceptor).addPathPatterns("/*");
    }
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/static/");
        /*registry.addResourceHandler("/upload/**").addResourceLocations("file:G:/upload/");*/
        registry.addResourceHandler("/templates/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX + "/templates/");
        registry.addResourceHandler("/upload/**").addResourceLocations("file:G:/upload/");
        super.addResourceHandlers(registry);
    }

}
