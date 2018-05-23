package com.test.manage.assets.enums;

public enum DistributeStatus {
    //undistributed未分配，distributed已分配
    UNDISTRIBUTED("undistributed"), DISTRIBUTED("distributed");

    private final String status;

    DistributeStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return status;
    }

    public static DistributeStatus getEnum(String value) {
        for (DistributeStatus status : values())
            if (status.getCode().equalsIgnoreCase(value))
                return status;
        throw new IllegalArgumentException();
    }
}
