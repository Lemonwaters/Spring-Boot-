package edu.niit.software.mybatis.mapper;

import edu.niit.software.mybatis.entity.Course;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class CourseMapperTest {
    @Resource
    private CourseMapper courseMapper;

    @Test
    void selectAll() {
        List<Course> courses = courseMapper.selectAll();
        courses.forEach(course -> log.info(String.valueOf(course)));
    }
}