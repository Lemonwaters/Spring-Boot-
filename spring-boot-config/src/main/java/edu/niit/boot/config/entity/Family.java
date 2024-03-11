package edu.niit.boot.config.entity;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 31807
 */
@Data
@Component
@ConfigurationProperties(prefix = "family")  //整体前缀
public class Family {

    //    @Value("${family.family-name}")
    private String familyName;

    //    @Value("${family.father}")
    private String father;

    //    @Value("${family.mother}")
    private String mother;

    //    @Value("${family.child}")
    private String child;
}
