package com.github.sivakumar_kailasam.super_rentals;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;


public class SuperRentalsConfiguration extends Configuration {

    @NotEmpty
    private String appName;


    @JsonProperty
    public String getAppName() {
        return appName;
    }

    @JsonProperty
    public void setAppName(String appName) {
        this.appName = appName;
    }
}
