module ch.imndb.quarkus.client {
    exports ch.imndb.quarkus.client;
    requires java.base;
    requires ch.imndb.quarkus.api;
    uses ch.imndb.quarkus.api.BaseServiceApi;
}