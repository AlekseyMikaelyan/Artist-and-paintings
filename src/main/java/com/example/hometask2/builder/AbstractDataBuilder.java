package com.example.hometask2.builder;

import com.example.hometask2.util.BundleUtil;

import java.util.Map;

public interface AbstractDataBuilder {
    default Map<String, String> getKeyValueMapByBundleProperties() {
        return BundleUtil.getBundleProperties();
    }

    void buildDataList();
}
