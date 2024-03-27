package edu.niit.software.mybatis.mapper;

import edu.niit.software.mybatis.entity.Course;
import edu.niit.software.mybatis.mapper.CourseMapper;

import java.util.List;

public interface CourseMapper {

    /**
     * 查询所有课程（关联查询出每门课程的选课学生）
     * @return List<Course>
     */
    List<Course> selectAll();
}