package com.example.quotas.domain.members;

/**
 * StateValues
 * 
 * This class represents the state values of the members.
 */
public enum StateValues {
    ACTIVE(1L),
    INACTIVE(2L),
    EFECTIVE(3L),
    HONORARY(4L);

    private final long value;

    StateValues(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }
}
