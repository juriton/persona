# Persons registry REST API

This application acts as a REST service for persons registry.

## Resources

* Git repository(web client) - https://github.com/juriton/persona-web.git
* Git repository(backend api) - https://github.com/juriton/persona.git

### Build and Run

Checkout
```bash 
git clone 
```
Build
```bash 
cd persona
gradlew build

Run
```bash 
java -jar .\build\libs\persona-0.0.1-SNAPSHOT.war -Dspring.profiles.active=H2
```

By default the "H2" profile is used, that uses in-memory H2 database and runs at http://localhost:9003

Generate idea project
 ```bash 
gradlew idea
 ``` 
 
 ### Requirements
 
 * JDK 8 installed and in PATH
 * PostgreSQL >8
 * Tomcat >8 (optional, if not running as a Linux service as instructed in the next main chapter)
 
 Create PostrgeSQL database and database user like this:
 
 ```sql
 create user personadbuser with password 'personaddbpwd';
 create database persona;
 grant all privileges on database persona to personadbuser;
 ```
 NB! change database name, username and password.