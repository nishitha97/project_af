package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "spring.mail", ignoreUnknownFields = false)
@PropertySource("classpath:application.properties")
public class ApplicationProperties {

    private final Properties properties = new Properties();
    private String host;
    private String userName;
    private String password;
    private String port;

    public Properties getProperties() {
        return properties;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }


    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public static class Properties {
        private final Mail mail = new Mail();

        public Mail getMail() {
            return mail;
        }


    }

    public static class Mail {
        private final Smtp smtp = new Smtp();

        public Smtp getSmtp() {
            return smtp;
        }
    }


    public static class Smtp {

        private final Starttls starttls = new Starttls();

        public Starttls getStarttls() {
            return starttls;
        }

    }

    public static class Starttls {

        private String enable;

        public String getEnable() {
            return enable;
        }

        public void setEnable(String enable) {
            this.enable = enable;
        }


    }
}