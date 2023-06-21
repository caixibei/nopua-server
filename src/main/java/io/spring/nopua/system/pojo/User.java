package io.spring.nopua.system.pojo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Component
@Data
@Schema(name = "user", description = "系统用户信息")
public class User implements Serializable {

    @Schema(name = "id", description = "用户标识ID")
    private BigInteger id;

    @Schema(name = "name", description = "姓名")
    private String name;

    @Schema(name = "password", description = "密码")
    private String password;

    @Schema(name = "account", description = "账号")
    private String account;

    @Schema(name = "birthday", description = "出生日期")
    private Date birthday;

    @Schema(name = "age", description = "年龄")
    private Integer age;

    @Schema(name = "gender", description = "性别")
    private String gender;

    @Schema(name = "phone", description = "电话")
    private String phone;

    @Schema(name = "degree", description = "学历")
    private String degree;
}
