/**
 * 
 */
package com.angie.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.angie.datasource.TargetDataSource;
import com.angie.entity.Student;
import com.angie.mapper.StudentMapper;

/**
 * 
 * @author Angie
 * github:https://github.com/Angie520
 * @date 2017年4月5日 上午11:41:08
 */
@Service
public class StudentService {
	@Autowired
    private JdbcTemplate jdbcTemplate;

    // MyBatis的Mapper方法定义接口
    @Autowired
    private StudentMapper studentMapper;

    @TargetDataSource(name="ds1")
    public List<Student> likeName(String name) {
        return studentMapper.likeName(name);
    }

    public List<Student> likeNameByDefaultDataSource(String name){
    	System.out.println(name);
    	
        return studentMapper.likeName(name);
    }

    /**
     * 不指定数据源使用默认数据源
     *
     * @return
     * @author SHANHY
     * @create  2016年1月24日
     */
    public List<Student> getList(){
        String sql = "SELECT ID,NAME,SCORE_SUM,SCORE_AVG, AGE FROM STUDENT";
        return jdbcTemplate.query(sql, new RowMapper<Student>(){

            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student stu = new Student();
                stu.setId(rs.getInt("ID"));
                stu.setAge(rs.getInt("AGE"));
                stu.setName(rs.getString("NAME"));
                stu.setSumScore(rs.getString("SUM_SCORE"));
                stu.setAvgScore(rs.getString("AVG_SCORE"));
                return stu;
            }

        });
    }

    /**
     * 指定数据源
     *
     * @return
     * @author SHANHY
     * @create  2016年1月24日
     */
    @TargetDataSource(name="ds1")
    public List<Student> getListByDs1(){
        String sql = "SELECT ID,NAME,SCORE_SUM,SCORE_AVG, AGE FROM STUDENT";
        return jdbcTemplate.query(sql, new RowMapper<Student>(){

            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student stu = new Student();
                stu.setId(rs.getInt("ID"));
                stu.setAge(rs.getInt("AGE"));
                stu.setName(rs.getString("NAME"));
                stu.setSumScore(rs.getString("SUM_SCORE"));
                stu.setAvgScore(rs.getString("AVG_SCORE"));
                return stu;
            }

        });
    }

    /**
     * 指定数据源
     *
     * @return
     * @author SHANHY
     * @create  2016年1月24日
     */
//    @TargetDataSource(name="ds2")
//    public List<Student> getListByDs2(){
//        String sql = "SELECT ID,NAME,SCORE_SUM,SCORE_AVG, AGE   FROM STUDENT";
//        return jdbcTemplate.query(sql, new RowMapper<Student>(){
//
//            @Override
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Student stu = new Student();
//                stu.setId(rs.getInt("ID"));
//                stu.setAge(rs.getInt("AGE"));
//                stu.setName(rs.getString("NAME"));
//                stu.setSumScore(rs.getString("SCORE_SUM"));
//                stu.setAvgScore(rs.getString("SCORE_AVG"));
//                return stu;
//            }
//
//        });
//    }
}