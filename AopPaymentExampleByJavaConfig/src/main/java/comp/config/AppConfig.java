package comp.config;

import com.aspect.MyAspect;
import org.example.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
//@ComponentScan(basePackages = "org.example,org.Aop")
public class AppConfig {
    @Bean
    public MyAspect createAspect(){
        return new MyAspect();
    }
    @Bean
    public PaymentService createPaymentService(){
        return new PaymentService();
    }
}
