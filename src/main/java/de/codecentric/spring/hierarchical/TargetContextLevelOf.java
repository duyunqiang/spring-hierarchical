package de.codecentric.spring.hierarchical;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TargetContextLevelOf {
	public static final String UNASSIGNED = "[unassigned]";
	Class<?> value();
	String beanName() default UNASSIGNED ;
}
