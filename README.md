# SpringHibernateEx

Sample project using Spring 4 and Hibernate Projeto exemplo utilizando Spring 4 e Hibernate 4 and annotations.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

1. Java JDK 8
2. Apache Maven
3. Servlet container(Tomcat)
4. MySQL database

### Installing

1. Create springhibernateex database on your MySQL server

```
CREATE DATABASE springhibernateex;
```  

2. Execute the script inside sql folder

3. Compile project.

```
mvn compile
```

4. Create WAR file.

```
mvn package
```
5. Go to target folder and deploy SpringHibernateEx.war to your servlet container.

## Built With

* [Spring](https://docs.spring.io/spring/docs/4.0.x/spring-framework-reference/html/) - The web framework used
* [Hibernate](http://hibernate.org/orm/documentation/4.3/) - The ORM used
* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Leandro Souza** - *Initial work*

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

## Acknowledgments

* This project is for learning purposes
