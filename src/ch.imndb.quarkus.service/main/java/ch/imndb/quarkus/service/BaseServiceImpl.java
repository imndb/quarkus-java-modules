package ch.imndb.quarkus.service;

import ch.imndb.quarkus.api.BaseServiceApi;

import java.time.LocalDateTime;

public class BaseServiceImpl implements BaseServiceApi {
    @Override
    public String greeting(String name) {
        return "Hello " + name + ". The current time: " + LocalDateTime.now();
    }
}
