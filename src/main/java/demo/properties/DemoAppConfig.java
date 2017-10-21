package demo.properties;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:large-prop-number.properties")
public class DemoAppConfig {

}
