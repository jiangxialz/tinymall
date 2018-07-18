package com.menethil.tinymall.core.notify.config;

import com.menethil.tinymall.core.util.YmlPropertyFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Configuration
@PropertySource(value = {"classpath:application-core.yaml"}, factory = YmlPropertyFactory.class)
@ConfigurationProperties(prefix = "tinymall.core.notify.MailNotifyConfig")
public class MailNotifyConfig {
    private boolean enable;
    private String host;
    private String username;
    private String password;
    private String sendto;

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSendto() {
        return sendto;
    }

    public void setSendto(String sendto) {
        this.sendto = sendto;
    }
}
