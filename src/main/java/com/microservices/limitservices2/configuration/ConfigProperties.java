package com.microservices.limitservices2.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "limit-service")
public class ConfigProperties {

    private String minimum;
    private String maximum;

    public ConfigProperties() {
    }

    public ConfigProperties(String minimum, String maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public String getMinimum() {
        return minimum;
    }

    public void setMinimum(String minimum) {
        this.minimum = minimum;
    }

    public String getMaximum() {
        return maximum;
    }

    public void setMaximum(String maximum) {
        this.maximum = maximum;
    }
}
