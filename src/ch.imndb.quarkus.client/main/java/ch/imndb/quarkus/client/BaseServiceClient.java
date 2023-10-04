package ch.imndb.quarkus.client;

import ch.imndb.quarkus.api.BaseServiceApi;

import java.util.ServiceLoader;

public class BaseServiceClient {


    public static void main(String[] args) {


        ServiceLoader<BaseServiceApi> serviceLoader = ServiceLoader.load(BaseServiceApi.class);
        if (!serviceLoader.iterator().hasNext() ) {
            System.out.println("Service not found");
        } else {
            serviceLoader.forEach(
                    service -> System.out.println(service.greeting(args[0]))
            );
            System.out.println("already calles service");
        }

    }

}
