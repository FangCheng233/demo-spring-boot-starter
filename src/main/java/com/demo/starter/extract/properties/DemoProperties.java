package com.demo.starter.extract.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 描述：
 *
 * @Author shf
 * @Date 2019/5/7 22:08
 * @Version V1.0
 **/
@Data
@ConfigurationProperties(prefix = "demo")
public class DemoProperties {
    private String sayWhat;
    private String toWho;

    /**
     * Gets the value of sayWhat. *
     *
     * @return the value of sayWhat
     */
    public String getSayWhat() {
        return sayWhat;
    }

    /**
     * Sets the sayWhat. *
     * <p>You can use getSayWhat() to get the value of sayWhat</p>
     * * @param sayWhat sayWhat
     */
    public void setSayWhat(String sayWhat) {
        this.sayWhat = sayWhat;
    }

    /**
     * Gets the value of toWho. *
     *
     * @return the value of toWho
     */
    public String getToWho() {
        return toWho;
    }

    /**
     * Sets the toWho. *
     * <p>You can use getToWho() to get the value of toWho</p>
     * * @param toWho toWho
     */
    public void setToWho(String toWho) {
        this.toWho = toWho;
    }
}
