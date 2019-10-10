package annotation.AOP;


import org.springframework.stereotype.Component;

@Component
public class Person {
    public String hello(String str) throws Exception {
        System.out.println("打招呼:"+str);
        int i=0;//是否抛出异常的开关,用于测试异常通知
        if(i==1){
            throw new Exception("java");
        }
        return str;
    }
}
