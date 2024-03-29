package edu.niit.software.mybatis.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serial;
import java.io.Serializable;

@Data
@Component
public class User implements Serializable {
    private Integer id;

    /**
     * 账号
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 密码
     */
    private String password;

    @Serial
    private static final long serialVersionUID = 1L;


}