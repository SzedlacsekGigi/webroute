package com.codecool.webroute;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface WebRoute {
    java.lang.String[] urlPatterns() default {};
}