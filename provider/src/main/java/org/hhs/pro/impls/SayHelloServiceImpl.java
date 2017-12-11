package org.hhs.pro.impls;

import org.hhs.pro.baseInters.SayHelloService;

public class SayHelloServiceImpl implements SayHelloService {
    public String sayHello(String helloArg) {
        if (helloArg.equals("hello")) {
            return "hello";
        }else {
            return "bye bye";
        }
    }
}
