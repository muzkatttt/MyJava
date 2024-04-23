package com.gb;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE}) // аннотация @Timer будет использоваться и над методами и над классами
@Retention(RetentionPolicy.RUNTIME) // @Timer будет доступен во время выполнения программы и на этапе компиляции
public @interface Timer {

}
