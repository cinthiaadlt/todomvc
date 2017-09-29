package com.autentia.training.selenium.todomvc.config;

public final class Config {

    public static final String HUB_URL = System.getProperty("hub.url", "http://127.0.0.1:4444/wd/hub");
    public static final String BASE_URL = System.getProperty("base.url", "http://127.0.0.1:3000");
    public static final String ENV = System.getProperty("env", "dev");
    public static final boolean DEBUG = Boolean.valueOf(System.getProperty("debug", "false"));

    private Config() {
    }

}