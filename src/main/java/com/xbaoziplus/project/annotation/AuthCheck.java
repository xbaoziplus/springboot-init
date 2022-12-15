package com.xbaoziplus.project.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author xbaozi
 * @version 1.0
 * @interface AuthCheck
 * @date 2022-12-14  14:46
 * @description 权限认证
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthCheck {

    /**
     * 有任何一个角色
     */
    String[] anyRole() default "";

    /**
     * 必须有某个角色
     */
    String mustRole() default "";
}
