# Learning Lombok
___

This project is about learning Lombok and using it in future Java projects.

### What is Lombok?
Project Lombok is a java library that automatically plugs into your editor and build tools, spicing up your java.
Never write another getter or equals method again, with one annotation your class has a fully featured builder, 
Automate your logging variables, and much more.

### How to use Lombok in a Java project?
#### 1. For existing project
Just add this dependency in your pom.xml file.
```xml
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>
```
#### 2. To create a new Project
We will use Spring Initializer to download the pre-built files and then open the folder in your preferred IDE.
1. Go to [start.spring.io](https://start.spring.io)
2. Now you can create Name of Project etc. accordingly.
3. Go to the Dependency Section and click add.
4. Search for Lombok
5. Click Generate and download the zip file.
6. Extract zip to your desired project location and open the folder using IDE.
7. You are all set.

Here's the same zip file I used, hit _[Spring Initializer Zip](https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.6.6&packaging=jar&jvmVersion=17&groupId=com.example&artifactId=LearningLombok&name=LearningLombok&description=A%20Project%20to%20learn%20how%20does%20Lombok%20work.&packageName=com.example.LearningLombok&dependencies=lombok)._

### Why use Lombok?
Using lombok significantly reduces the code size and increase the readability. It allows us to focus, what should be 
    focused and reduces a lot of boilerplate code. Lombok provides more functionality than records which are now a 
    constant feature from Java 17. 

### Resources Used

| Resource                     | Link                                                                          |
|------------------------------|-------------------------------------------------------------------------------|
| Amigoscode Video on Lombok   | [Click](https://youtu.be/z7bsNF2Dtf0?list=PLwvrYc43l1MyAmDss3HEYYBIQwY3pITeA) |
| Github Profile of Amigoscode | [Click](https://github.com/amigoscode)                                        |
 | Lombok Official Page         | [Click](https://projectlombok.org/)                                           |
