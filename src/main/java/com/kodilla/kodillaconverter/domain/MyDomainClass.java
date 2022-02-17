package com.kodilla.kodillaconverter.domain;

public class MyDomainClass {
    private final String parameterX;
    private final String parameterY;

    public MyDomainClass(String parameterX, String parameterY) {
        this.parameterX = parameterX;
        this.parameterY = parameterY;
    }

    public String getParameterX() {
        return parameterX;
    }

    public String getParameterY() {
        return parameterY;
    }
}
