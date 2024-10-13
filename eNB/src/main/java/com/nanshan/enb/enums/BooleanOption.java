package com.nanshan.enb.enums;

public enum BooleanOption {
    Y("是"),
    N("否");

    private final String displayName;

    // 构造函数
    BooleanOption(String displayName) {
        this.displayName = displayName;
    }

    // 获取显示名称
    public String getDisplayName() {
        return displayName;
    }

    // 可以根据需要添加其他方法，例如从字符串转换
    public static BooleanOption fromString(String gender) {
        if (gender != null) {
            for (BooleanOption g : BooleanOption.values()) {
                if (g.name().equalsIgnoreCase(gender)) {
                    return g;
                }
            }
        }
        throw new IllegalArgumentException("Unknown gender: " + gender);
    }
}

