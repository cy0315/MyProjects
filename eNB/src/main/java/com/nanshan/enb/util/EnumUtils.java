
package com.nanshan.enb.util;

import org.reflections.Reflections;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EnumUtils {

    public static Map<String, Map<String, String>> getAllEnumsInPackage(String packageName) {
        Map<String, Map<String, String>> enumMap = new HashMap<>();
        
        Reflections reflections = new Reflections(packageName);
        Set<Class<? extends Enum>> enumClasses = reflections.getSubTypesOf(Enum.class);
        
        for (Class<? extends Enum> enumClass : enumClasses) {
            Map<String, String> enumValuesMap = new HashMap<>();
            
            // 獲取 enum 的所有常量
            Enum<?>[] enumConstants = enumClass.getEnumConstants();
            
            for (Enum<?> constant : enumConstants) {
                String code = constant.name(); // 這裡假設使用 enum 的名字作為 code
                String description = getEnumDescription(constant); // 獲取描述
                enumValuesMap.put(code, description);
            }
            
            enumMap.put(enumClass.getSimpleName(), enumValuesMap);
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
