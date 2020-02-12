package com.timurradko.regex;

public interface Validator<T> {
    boolean valid(T elements);
}
