package com.github.sivakumar_kailasam.super_rentals;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.slf4j.LoggerFactory;


public class SuperRentalsApp extends Application<SuperRentalsConfiguration> {


    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(SuperRentalsApp.class);

    @Override
    public void run(SuperRentalsConfiguration configuration, Environment environment) throws Exception {
        LOGGER.info("Starting application with name: {}", configuration.getAppName());

    }

    public static void main(final String[] args) throws Exception {
        new SuperRentalsApp().run(args);
    }
}
