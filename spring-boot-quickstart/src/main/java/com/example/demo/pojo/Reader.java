package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 31807
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Reader implements Serializable {
    private String name;
    private Integer age;
}