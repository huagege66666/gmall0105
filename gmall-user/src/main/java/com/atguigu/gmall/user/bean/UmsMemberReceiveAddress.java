package com.atguigu.gmall.user.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.Id;
import java.io.Serializable;

@ToString
@Accessors(chain = true)
@Setter
@Getter
public class UmsMemberReceiveAddress implements Serializable {

    @Id
    private String id;
    private String memberId;
    private String  name;
    private String  phoneNumber;
    private int defaultStatus;
    private String postCode;
    private String province;
    private String city;
    private String region;
    private String detailAddress;
}
