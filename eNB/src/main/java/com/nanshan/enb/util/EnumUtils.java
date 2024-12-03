
package com.nanshan.enb.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.reflections.Reflections;

public class EnumUtils {

    public static Map<String, List<Map<String, String>>> getAllEnumsInPackage(String packageName) {
        Map<String, List<Map<String, String>>> enumMap = new HashMap<>();
        
        Reflections reflections = new Reflections(packageName);
        Set<Class<? extends Enum>> enumClasses = reflections.getSubTypesOf(Enum.class);
        
        for (Class<? extends Enum> enumClass : enumClasses) {
        	List<Map<String, String>> list = new ArrayList<Map<String, String>>();
            
            // 獲取 enum 的所有常量
            Enum<?>[] enumConstants = enumClass.getEnumConstants();
            
            for (Enum<?> constant : enumConstants) {
            	Map<String, String> enumValuesMap = new HashMap<>();
                String code = constant.name(); // 這裡假設使用 enum 的名字作為 code
                String description = getEnumDescription(constant); // 獲取描述
                enumValuesMap.put("Key", code);
                enumValuesMap.put("Value", description);
                list.add(enumValuesMap);
            }
            
            enumMap.put(enumClass.getSimpleName(), list);
        }
        
        return enumMap;
    }

    private static String getEnumDescription(Enum<?> constant) {
        try {
            Method method = constant.getDeclaringClass().getMethod("getDisplayName");
            return (String) method.invoke(constant);
        } catch (Exception e) {
            return constant.toString(); // 如果沒有描述，返回 enum 名稱
        }
    }
}
