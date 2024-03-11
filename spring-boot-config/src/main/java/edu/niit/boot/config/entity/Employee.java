package edu.niit.boot.config.entity;


import lombok.Data;
import lombok.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 31807
 */
@Data
@Component
@PropertySource(value = {"classpath:employee.properties"})
public class Employee {
   // @Value("#{'${employee.names}'.split(',')}")
    private List<String> employeeNames;
}
