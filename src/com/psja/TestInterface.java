package com.psja;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/*
 * The main thing is the @interface which creates a new annotation
 * the target type tells that the annotation is used in method level or class level or element level
 * */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TestInterface {

}
