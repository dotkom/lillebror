# lillebror
Module for handling personal user information.

# Goal
The goal of this project is to create a dynamic data sharing permission system for easely granting permission to data consumer
to fetch data from a data provider.

The consumer will ask a lillebror service to access some data from a provider. If the user currently logged into the consumer via keycloak they will be asked if they want to grant the consumer the privilege to fetch data from a specific provider, if granted the consumer will then ask the provider for that data throught it's api. The provider will then verify that the consumer actually has the permissions to access this information via an api call to lillebror.

The user will at any point be able to rewoke permission for any client at any point. They will also be able to request that the provider deletes information stored about them.


# Requirements
 - Kotlin
 - Maven

 # Run server

```bash
$ cd target/
$ java -cp  lillebror-0.0.1-SNAPSHOT-jar-with-dependencies.jar lillebror.MainKt
```dy
