package annotation.AOP;


import annotation.Cat;
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

    @LYJ("测试")
    public void study(String str, Cat cat){
        System.out.println("study:"+str);
        System.out.println(cat);
    }

}
