package indi.zeroornull.pattern.flyweight.impl2;

import indi.zeroornull.pattern.flyweight.impl2.pojo.SchoolInfo;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

// FlyweightFactory：管理共享对象
@Slf4j
public class FlyweightFactory {
    private FlyweightFactory() {}

    private static final Map<String, SchoolInfo> SCHOOL_INFO_MAP = new HashMap<>();

    public static SchoolInfo getSchoolInfo(String name, String address, String slogan) {
        String key = name + address + slogan;
        return SCHOOL_INFO_MAP.computeIfAbsent(key, k -> new SchoolInfo(name, address, slogan));
    }

    public static void printCache() {
        log.info("SchoolInfo Cache: {}", SCHOOL_INFO_MAP);
    }
}
