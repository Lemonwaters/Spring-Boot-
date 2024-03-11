package edu.niit.boot.config;

import edu.niit.boot.config.entity.Family;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FamilyTest {
    @Resource
    private Family family;
    @Test
    public void testFamily(){
        System.out.println(family);
    }
}
