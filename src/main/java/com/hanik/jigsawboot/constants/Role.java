package com.hanik.jigsawboot.constants;

public enum Role {
    PM("Project Manager"),
    CX("CX Designer"),
    DEV("Developer"),
    OP("Staff"),
    ETC("기타");

    private String value;

    Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
