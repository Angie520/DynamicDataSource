/**
 * 
 */
package com.angie.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.angie.entity.Student;
/**
 * StudentMapper，映射SQL语句的接口，无逻辑实现
 * 
 * @author Angie
 * github:https://github.com/Angie520
 * @date 2017年4月5日 上午11:42:46
 */
public interface StudentMapper {
	// 注解 @TargetDataSource 不可以在这里使用
	@Select("select * from student Where name=#{name}")
	public List<Student> likeName(String name);

	public Student getById(int id);

	public String getNameById(int id);
	
}
