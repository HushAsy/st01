package org.hhs.pro.impls;

import org.hhs.pro.baseInters.BaseService;

import java.util.Map;

public class BaseServiceImpl implements BaseService {
    public Object execcute(Map<String, Object> args) {
        String[] helloArg = (String[]) args.get("arg1");
        if ("hello".equals(helloArg[0])){
            return "hello";
        }else {
            return "bye bye";
        }
    }
}
