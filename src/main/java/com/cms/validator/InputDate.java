package com.cms.validator;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target( { METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = InputDateValidator.class)
@Documented
public @interface InputDate {
	String message() default "{com.cms.validator.InputDate.format.message}";
	Class<?>[] groups() default {};
	public abstract Class<? extends Payload>[] payload() default{};
}
