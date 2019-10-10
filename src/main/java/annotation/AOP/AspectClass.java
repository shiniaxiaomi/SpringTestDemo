package annotation.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/10/10.
 */


@Component
@Aspect //标记该类为一个切面类,该注解不能被IOC容器扫描到,所以需要加上@Component才能够被处理
public class AspectClass {
    //定义一个可重复使用的切点
    @Pointcut("execution(* hello(..))")
    public void log(){}

    //前置通知
    @Before(value = "log()")
    public void beforeLog(){
        System.out.println("before log");
    }

    //后置通知
    @After("execution(* hello(..))")
    public void afterLog(){
        System.out.println("after log");
    }

    //环绕通知
//    @Around("log()")
//    public void aroundLog(ProceedingJoinPoint pjp) throws Throwable {
//        //============在业务方法执行之前
//        System.out.println("aroundBeforeLog");
//        //============在业务方法执行之前
//        pjp.proceed();//执行业务方法
//        //============在业务方法执行之后
//        System.out.println("aroundAfterLog");
//        //============在业务方法执行之后
//    }

    //返回通知
    //不获取返回值
//    @AfterReturning("log()")
//    public void afterReturningLog(){
//        System.out.println("afterReturning log");
//    }
    //需要获取返回值
    @AfterReturning(pointcut = "log()",returning = "retVal")
    public void afterReturningLog(Object retVal){
        System.out.println("afterReturning log:"+retVal);
    }

    //异常通知
    //不获取异常信息
//    @AfterThrowing("log()")
//    public void afterThrowingLog(){
//        System.out.println("afterThrowing log");
//    }
    //需要获取异常信息
    @AfterThrowing(pointcut = "log()",throwing = "ex")
    public void afterThrowingLog(Exception ex){
        System.out.println("afterThrowing log:"+ex.getMessage());
    }
}
