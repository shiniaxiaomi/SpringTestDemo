package xml.AOP;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Administrator on 2019/10/10.
 */


public class AspectClass {

    //前置通知
    public void beforeLog(){
        System.out.println("before log");
    }

    //后置通知
    public void afterLog(){
        System.out.println("after log");
    }

    //环绕通知
    public void aroundLog(ProceedingJoinPoint pjp) throws Throwable {
        //============在业务方法执行之前
        System.out.println("aroundBeforeLog");
        //============在业务方法执行之前
        pjp.proceed();//执行业务方法
        //============在业务方法执行之后
        System.out.println("aroundAfterLog");
        //============在业务方法执行之后
    }

    //返回通知
    //不获取返回值
//    public void afterReturningLog(){
//        System.out.println("afterReturning log");
//    }
    //需要获取返回值
    public void afterReturningLog(Object retVal){
        System.out.println("afterReturning log:"+retVal);
    }


    //异常通知
    //不获取异常信息
//    public void afterThrowingLog(){
//        System.out.println("afterThrowing log");
//    }
    //需要获取异常信息
    public void afterThrowingLog(Exception ex){
        System.out.println("afterThrowing log:"+ex.getMessage());
    }
}
