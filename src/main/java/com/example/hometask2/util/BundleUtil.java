package com.example.hometask2.util;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class BundleUtil {
    private static final ResourceBundle RESOURCE_PAINTINGS = ResourceBundle.getBundle("paintings");

    public static Map<String, String> getBundleProperties() {
        return convertResourceBundleToMap(getBundle());
    }

    private static Map<String, String> convertResourceBundleToMap(ResourceBundle resource) {
        Map<String, String> map = new HashMap<>();
        Enumeration<String> keys = resource.getKeys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            map.put(key, resource.getString(key));
        }
        return map;
    }

    private static ResourceBundle getBundle() {
            return RESOURCE_PAINTINGS;
    }
}
