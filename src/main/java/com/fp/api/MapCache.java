package com.fp.api;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Copyright (C), 2018,北京同创永益科技发展有限公司
 * @ProjectName: hatech
 * @Package cn.com.hatech.octopus.plugins.simis.util
 * @ClassName: MapCache
 * @Author: lihaipeng
 * @Description: map缓存
 * @create: 2019-05-30-17-32
 **/
public class MapCache {

    private static Map<Object, Object> cacheMap = new ConcurrentHashMap<Object, Object>();

    public static void destoryCacheMap() {
        cacheMap = null;
    }

    public static Map<Object, Object> getCacheMap() {
        return cacheMap;
    }

    public static void set(Object key, Object values) {
        cacheMap.put(key, values);
    }

    public static Object get(Object key) {
        return cacheMap.get(key);
    }

    public static String getString(Object key) {
        return (String) cacheMap.get(key);
    }

    public static Object getToEmpty(Object key) {
        Object o = cacheMap.get(key);
        if (o == null){
            return "";
        } else{
            return o;
        }
    }

    public static void remove(Object key) {
        cacheMap.remove(key);
    }

    public static void clear() {
        cacheMap.clear();
    }

}
