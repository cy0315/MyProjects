package com.nanshan.enb.enums;

public enum Gender {
    M("男"), // 男性
    F("女"); // 女性

    private final String displayName;

    // 构造函数
    Gender(String displayName) {
        this.displayName = displayName;
    }

    // 获取显示名称
    public String getDisplayName() {
        return displayName;
    }

    // 可以根据需要添加其他方法，例如从字符串转换
    public static Gender fromString(String gender) {
        if (gender != null) {
            for (Gender g : Gender.values()) {
                if (g.name().equalsIgnoreCase(gender)) {
                    return g;
                }
            }
        }
        throw new IllegalArgumentException("Unknown gender: " + gender);
    }
}

