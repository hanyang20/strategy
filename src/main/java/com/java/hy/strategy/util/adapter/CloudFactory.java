package com.java.hy.strategy.util.adapter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CloudFactory {

    private static Map<String, CloudSdk> map = new ConcurrentHashMap<>();

    static {
        map.put("alisdk", new AliAdapter(new AliSdk()));
        map.put("awssdk",new AWSAdapter(new AWSSdk()));
    }

    public static CloudSdk getInstance(String type){
        return map.get(type);
    }
}
