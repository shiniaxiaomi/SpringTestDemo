package annotation.AOP;

import annotation.Cat;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * Created by Administrator on 2019/10/10.
 */


@Component
@Aspect //标记该类为一个切面类,该注解不能被IOC容器扫描到,所以需要加上@Component才能够被处理
public class AspectClass {
    //定义一个可重复使用的切点
    @Pointcut("execution(* hello(..))")
//    @Pointcut("execution(* annotation.AOP..* (..))")
//    @Pointcut("args(java.lang.String,java.lang.Integer)")
//    @Pointcut("target(annotation.AOP.Person)")
//    @Pointcut(value = "@annotation(annotation.AOP.LYJ)") //指定类lyj标注的类
    public void log(){}


    @Before("bean(person)")
    public void beanLog(){
        System.out.println("bean log");
    }

    //前置通知
    @Before(value = "@annotation(annotation.AOP.LYJ) && execution(* study(..))") //指定类lyj标注的类并且名称为study的方法
    public void annotationLog(JoinPoint joinPoint) throws Exception {

        System.out.println("annotation log");

        //获取注解中的值
        String value = ((MethodSignature) joinPoint.getSignature()).getMethod().getAnnotation(LYJ.class).value();

        //获取方法对象
        Method method = ((MethodSignature) joinPoint.getSignature()).getMethod();
        Class<?>[] classes = method.getParameterTypes();//获取方法中的参数类型
        Object[] args = joinPoint.getArgs();//获取方法中参数的引用

        //遍历,将Cat的name设置为注解中的值
        for(int i=0;i<classes.length;i++){
            if(classes[i].equals(Cat.class)){
                Cat cat = (Cat) args[i];
                cat.setName(value);
            }
        }
    }

    //前置通知
    @Before(value = "log()")
    public void beforeLog()  {
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
