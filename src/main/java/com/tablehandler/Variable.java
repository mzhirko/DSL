package com.tablehandler;

public class Variable<T>{
    private String dataType;
    private T value;

    public Variable(String dataType, T value) {
        this.dataType = dataType;
        this.value = value;
    }

    public String getType() {
        return this.dataType;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
