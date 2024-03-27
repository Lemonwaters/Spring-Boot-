package edu.niit.software.mybatis.mapper;

import edu.niit.software.mybatis.entity.Teacher;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class TeacherMapperTest {

    @Resource
    private TeacherMapper teacherMapper;
    @Test
    void selectOneByOne() {
        Teacher teacher = teacherMapper.selectOneByOne(1);
        log.info(teacher.getTeacherName() + "," + teacher.getClazz().getClazzName());
    }
}