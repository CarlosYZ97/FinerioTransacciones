package pe.finerio.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import pe.finerio.app.config.cors.EnableCors;
import pe.finerio.app.web.message.WebMessageSource;

@EnableCors
@EnableFeignClients
@SpringBootApplication
public class TransactionMain {

    public static void main(String[] args) {
        SpringApplication.run(TransactionMain.class);
    }

    @Bean(name = "messageSource")
    public MessageSource messageSource() {
        WebMessageSource messageSource = new WebMessageSource("default", 60, "classpath:i18n/messages", "classpath:i18n/messages-legacy");
        return messageSource;
    }
}
