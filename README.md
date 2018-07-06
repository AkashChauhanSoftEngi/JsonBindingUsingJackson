# JsonBindingUsingJackson

* Maven + Json-Binding + Jackson
* Helpful in Data binding when using Rest end points
* By using databind.JsonMappingException and databind.ObjectMapper classes;
```java
  ObjectMapper.writeValueAsString(POJO) and ObjectMapper.readValue(json, POJO.class);
```

> **###1. Technologies**
* Maven 3.1
* jackson-core 2.9.6
* jackson-databind 2.0.0
```xml
<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core -->
<dependency>
	<groupId>com.fasterxml.jackson.core</groupId>
	<artifactId>jackson-core</artifactId>
	<version>2.9.6</version>
</dependency>

<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind -->
<dependency>
	<groupId>com.fasterxml.jackson.core</groupId>
	<artifactId>jackson-databind</artifactId>
	<version>2.0.0</version>
</dependency>
```

> **###2. To Run this project locally**
* $ git clone https://github.com/AkashChauhanSoftEngi/MavenJsonBindingUsingJackson
* $ mvn tomcat7:run
