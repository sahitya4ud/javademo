package org.example.polymorphism.abstractdemo;

import java.util.HashMap;
import java.util.Map;

public class TaxServiceImpl {

    public static Map<String,Tax> taxMap = new HashMap<>();
    static  {
        Tax t = new Tax();
        t.setPan("22222");
        t.setAmount(200000.0);
        t.setAccountNmuber("1234");

        taxMap.put("22222",t);
    }


}
