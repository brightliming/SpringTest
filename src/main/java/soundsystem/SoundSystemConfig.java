package soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Administrator on 2016/10/7.
 */
@Configuration
@Import({CDPlayerConfig.class,CDConfig.class})
//@ImportResource("classpath:applicationContext.xml")
public class SoundSystemConfig {
}
