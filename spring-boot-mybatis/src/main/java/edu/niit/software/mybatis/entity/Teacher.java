package edu.niit.software.mybatis.entity;

import java.io.Serial;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;
/**
 * @author 31807
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Teacher {
    private Integer teacherId;
    private String teacherName;
    private Integer clazzId;
    private Clazz clazz;
}