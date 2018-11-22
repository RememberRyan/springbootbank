# SpringBootBank

Introduction to using Spring Boot, applying it to create a simple Bank application. <br>
<p>Currently incomplete: Latest ToDo:
<ul> <li>Previous tasks</li> 
<ul><li> finish currency total filter method</li></ul>
</ul> 

<ul>
	<li>Users: Database</li>
	<ul>
<li>Add password column</li>
	<li>Add login [boolean] column</li>
	<li>Add username column</li>
	<li>Add Admin user credentials, logged in</li>
	</ul>
<li>Functionality:</li><ul>
	<li>Register as a new user to database</li>
	<li>Login as an existing user. Boolean flag for being logged in.</li>
	<li>Logout = boolean flag turning false.</li>
	<li></li></ul>
	<li>Admin logged in: </li><ul>
	<li>admin credentials should by default be on the database</li>
	<li>Can delete users</li></ul>
	<li>Logged in user </li><ul>
	<li>can withdraw money from their account</li></ul>
</ul>
</p>

## Getting Started

IntelliJ

### Prerequisites 
#### Dependencies:

Spring boot starter data jpa
```
<dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
```

### Installing

Create a new project with the following screenshots as a guide
<table>
    <tr>
        <td>
            <img alt="step 1" src="src/docs/screenshots/image201.png">
        </td>
        <td>
            <img alt="step 2" src="src/docs/screenshots/image202.png">
        </td>
        <td>
            <img alt="step 3" src="src/docs/screenshots/image203.png">
        </td>
<td><img alt="step 4" src="src/docs/screenshots/image204.png"></td>
    </tr>
<tr>
        <td>
            <img alt="step 5" src="src/docs/screenshots/image205.png">
        </td>
        <td>
            <img alt="step 6" src="src/docs/screenshots/image205.png">
        </td>
        <td>
            <img alt="step 7" src="src/docs/screenshots/image207.png">
        </td>
<td><img alt="step 8" src="docs/screenshots/image208.png"></td>
    </tr>
</table>


## Running the tests

```
Add screenshots later
```

## Built With

* [Tomcat plugin](https://mvnrepository.com/artifact/org.apache.tomcat/tomcat-jdbc) - Server plugin
* [Lombok](https://mvnrepository.com/artifact/org.projectlombok/lombok) - plugin
* [JDBC](https://mvnrepository.com/artifact/org.apache.tomcat/tomcat-jdbc) - MySQL database

## Authors

* **Ryan Alexander** - *Initial work* - [LinkedIn](https://www.linkedin.com/in/rememberryan/)


## Acknowledgments

* SDA