# SpringBootJWT
To run the SpringBootJWT application in your local machine, use the below url to generate the token
http://localhost:9091/authenticate

#POST call data
username: admin 
password: password

Once token is generated, pass the Authorization with token in request header and hit the below url to access the webservice, otherwise you will get unauthorized error as output.
http://localhost:9091/pncbank/greeting

# SpringBootJPA
In this application, covered the CRUD operations with database access.
h2 database dependency added in the pom.xml file, in-order to persist objects into databse.
Written data.sql file with default insert statements, so that while application start up those will be persist into database.

#In order to access the database in your local machine. Use the below url.
http://localhost:8089/h2-console

Click on Test Connection button and then click on connect.

Note: No need to pass the username and password to access database. By default username will be added as 'sa'. password is optional.

# SpringBootSwagger2
In this application, It provides the user interface to access our webservices via web browser.
This is the url, to see webservices in browser. http://localhost:8080/swagger-ui.html.

# SpringBootThymeleaf
Thymeleaf is a Java-based library used to create a web application. It provides a good support for serving a XHTML/HTML5 in web applications.
Note: I have added spring-boot-devtools in the pom.xml file, In order to stop the server when changes made in code, this will do auto build and publish your code in the server.

# SpringBootActuator
Spring Boot Actuator provides secured endpoints for monitoring and managing your Spring Boot application. 
By default, all actuator endpoints are secured. In order to disable the security for actuator endpoints.
Write this property in application.properties file management.security.enabled = false
So that we can access the actuator endpoints like health, info, env, beans, mappings and etc...

#Case Study#
*****Online Banking System*****

The Banking system consists of two parts: User-Front and Admin-Portal. 

User-Front is a user-facing system and it includes such modules as User Signup/Login, Account, Transfer, 
Appointment, Transaction and User Profile. 

Admin-Portal is mainly used by Admin and it involves User Account and Appointment modules.
