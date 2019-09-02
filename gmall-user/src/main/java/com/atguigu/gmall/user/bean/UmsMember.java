package com.atguigu.gmall.user.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 描述：
 *
 * @ClassName UmsMember
 * @Author Administrator
 * @Date 2019/9/2 0002 10:51
 * @Version 1.0.0
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class UmsMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String member_level_id;
    private String username;
    private String password;
    private String nickname;
    private String phone;
    private Integer status;
    private Date createTime;
    private String icon;
    private Integer gender;
    private Date birthday;
    private String city;
    private String job;
    private String personalizedSignature;
    private Integer sourceType;
    private Integer growth;
    private Integer luckeyCount;
    private Integer historyIntegration;


}
