package com.lianlian.osc.gateway.client.request;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author xujs002
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestConfig {

    /**
     * uri for API
     */
    String uri() default "";

    /**
     * uri type of API
     */
    ApiUriType type() default ApiUriType.NORMAL;

    /**
     * http menthod of API
     */
    ApiMenthod menthod() default ApiMenthod.GET;


    /**
     * API return type reference
     */
    ApiTypeReference reference() default ApiTypeReference.DEFAULT;


}
