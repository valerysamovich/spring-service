spring-service
==============

RESTful Web Service with Spring.

Requirements
------------

- JDK 1.6 or later
- Maven 3.0+

How to run
----------

To run application use `mvn spring-boot:run`. Or build the JAR file with `mvn 
clean package` and run the JAR with `java -jar target/gs-rest-service-0.1.0.jar`. 
When service is up, visit  `http://localhost:8080/greeting` to see: 

```
{
    "id":1,
    "content":"Hello, World!"
}
```

Provide a name query string parameter with `http://localhost:8080/greeting?name=User`. 
Notice how the value of the content attribute changes from `"Hello, World!"` to 
`"Hello User!"`:

```
{
    "id":2,
    "content":"Hello, User!"
}
```
