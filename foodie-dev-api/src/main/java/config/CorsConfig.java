package config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    public CorsConfig(){

    }
    @Bean
    public CorsFilter corsFilter(){
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("http://localhost:8080");

        // 设置是否发送cookie信息
        corsConfiguration.setAllowCredentials(true);

        corsConfiguration.addAllowedMethod("*");

        corsConfiguration.addAllowedHeader("*");
        // 2. 为url添加映射路径
        UrlBasedCorsConfigurationSource corsSource = new UrlBasedCorsConfigurationSource();
        corsSource.registerCorsConfiguration("/**", corsConfiguration);

        // 3. 返回重新定义好的corsSource
        return new CorsFilter(corsSource);
    }

}
