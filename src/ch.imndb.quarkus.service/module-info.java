module ch.imndb.quarkus.service {
    exports ch.imndb.quarkus.service;
    requires java.base;
    requires ch.imndb.quarkus.api;
    provides ch.imndb.quarkus.api.BaseServiceApi with ch.imndb.quarkus.service.BaseServiceImpl;
}