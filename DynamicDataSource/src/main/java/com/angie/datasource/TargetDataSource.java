/**
 * 
 */
package com.angie.datasource;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 在方法上使用，用于指定使用哪个数据源
 * 
 * @author Angie
 * github:https://github.com/Angie520
 * @date 2017年4月5日 上午11:53:13
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {
	String name();
}
