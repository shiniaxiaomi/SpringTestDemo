package annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Created by Yingjie.Lu on 2019/10/10.
 */

@Configuration
public class CatFactory {
    @Bean(name = "cat")
    public Cat creatCat(){
        return new Cat("1");
    }

    @Bean
    public Cat creatCat2(){
        return new Cat("2");
    }
}
