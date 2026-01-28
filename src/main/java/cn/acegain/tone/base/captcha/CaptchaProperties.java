package cn.acegain.tone.base.captcha;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("tone.captcha")
public class CaptchaProperties {

    private CaptchaType type;

    private Integer width;

    private Integer height;

    private Integer length;

    private Integer stain;

}