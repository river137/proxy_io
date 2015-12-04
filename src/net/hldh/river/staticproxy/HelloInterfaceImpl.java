package net.hldh.river.staticproxy;

/**
 * Created by liuhj on 2015/12/1.
 */
public class HelloInterfaceImpl implements HelloInterface {
    @Override
    public void say() {
        System.out.println("Hello");
    }
}
