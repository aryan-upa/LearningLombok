# Learning Lombok
___

This project is about learning Lombok and using it in our future Java projects.

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

Here's the same zip file I used, hit _[SpringInitializerZip](https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.6.6&packaging=jar&jvmVersion=17&groupId=com.example&artifactId=LearningLombok&name=LearningLombok&description=A%20Project%20to%20learn%20how%20does%20Lombok%20work.&packageName=com.example.LearningLombok&dependencies=lombok)._
