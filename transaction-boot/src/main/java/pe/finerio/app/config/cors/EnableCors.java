package pe.finerio.app.config.cors;

import org.springframework.context.annotation.Import;
import pe.finerio.app.config.property.CorsProperties;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({CorsConfigurationSource.class, CorsProperties.class})
public @interface EnableCors {
}
