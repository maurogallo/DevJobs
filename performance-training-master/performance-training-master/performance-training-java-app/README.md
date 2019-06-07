# Performance training Java app

Demo app to demonstrate and teach about performance engineering.

## To quickly start the app from your IDE or the console

Simply type:

```./gradlew bootRun```

This will enable JMX monitoring by default in the `8008` port.

## Building the app

Simply type:

```./gradlew build```

This will generate an executable JAR file inside of `build/libs`.

## Running the app

Simply type:

```java -jar performance-training-java-app.jar```

If you wish to activate JMX monitoring for the app, use:

```java -jar java -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.port=8008 -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false -jar performance-training-java-app.jar```
