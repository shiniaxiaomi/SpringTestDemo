package annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * Created by Yingjie.Lu on 2019/10/10.
 */

@Component
@Import(Cat.class)
public class ImportTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ImportTest.class);
        Cat cat = context.getBean(Cat.class);
        System.out.println(cat);
    }
}
