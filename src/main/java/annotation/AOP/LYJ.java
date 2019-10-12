package annotation.AOP;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 自定义注解
 * 特别提醒： @Rentention(RetentionPolicy.RUNTIME) 时，注解才会被jvm加载，才能使用反射获取。
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface LYJ {
    String value() default "";
}
