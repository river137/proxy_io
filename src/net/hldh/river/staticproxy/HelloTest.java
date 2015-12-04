package net.hldh.river.staticproxy;

/**
 * Created by liuhj on 2015/12/1.
 */
public class HelloTest {
    public static void main(String args[]){
        HelloStaticProxy proxy = new HelloStaticProxy(new HelloInterfaceImpl());
        proxy.say_proxy();
    }
}
