package net.hldh.river.staticproxy;

/**
 * Created by liuhj on 2015/12/1.
 */
public class HelloStaticProxy{

    //spring 依赖注入？类似吧
    private HelloInterface helloInterface;
    public HelloStaticProxy(HelloInterface helloInterface){
        this.helloInterface = helloInterface;
    }

    public void say_proxy(){
        System.out.println("start");
        helloInterface.say();
        System.out.println("end");
    }
}
