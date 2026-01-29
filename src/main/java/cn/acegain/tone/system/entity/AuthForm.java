package cn.acegain.tone.system.entity;

import lombok.Data;

@Data
public class AuthForm {

    private String uuid;

    private String code;

    private String channel;

    private String mode;

    private String account;

    private String password;

}
