package com.test.manage.assets.enums;

public enum AssetsStatus {
    INITIAL("initial"), IN_MAINTENANCE("in_maintenance"),
    FINISH("finish");

    private final String status;

    AssetsStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return status;
    }

    public static AssetsStatus getEnum(String value) {
        for (AssetsStatus status : values())
            if (status.getCode().equalsIgnoreCase(value))
                return status;
        throw new IllegalArgumentException();
    }
}
