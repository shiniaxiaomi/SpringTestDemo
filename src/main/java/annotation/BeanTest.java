package annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by Yingjie.Lu on 2019/10/10.
 */

@Component
public class BeanTest {
    @Bean(name = "cat2")
    public Cat creatCat(){
        return new Cat("2");
    }
}
