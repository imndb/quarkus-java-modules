- compiling: 

javac -d target/classes src/module-info.java

- packaging: 

jar --create --file lib/quarkus-java-modules.jar -C target/classes .

- Running in module mode: 

java --module-path lib -m ch.imndb.quarkus/ch.imndb.quarkus.GreetingResource

- Running in Classpath mode: 

java -classpath lib/quarkus-java-modules.jar ch.imndb.quarkus.GreetingResource 