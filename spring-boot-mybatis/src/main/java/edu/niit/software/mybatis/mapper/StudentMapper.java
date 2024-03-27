package edu.niit.software.mybatis.mapper;

import edu.niit.software.mybatis.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface StudentMapper {
    int insert(Student student);

    Student findStudentById(int studentId);

    int updateById(Student student);

    int deleteById(int studentId);

    int batchInsert(@Param("students") List<Student> students);

    int batchDelete(@Param("idList") List<Integer> ids);

    int batchUpdate(@Param("students") List<Student> students);

    List<Student> selectByDynamicSql(Student student);

    Student getStudentManyToOne(int i);
    Student getStudent(int studentId);
}