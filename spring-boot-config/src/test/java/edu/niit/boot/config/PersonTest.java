package edu.niit.boot.config;

import edu.niit.boot.config.entity.Dog;
import edu.niit.boot.config.entity.Person;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class PersonTest {
    @Resource
    private Dog dog;
    @Resource
    private Person person;
    @Test
    void name() {
        System.out.println(dog);
        System.out.println(person);
    }
}
