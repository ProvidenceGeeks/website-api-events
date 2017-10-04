# website-api-events

## Overview
Backend RESTful API for managing event data to be consumed by clients, like *website-frontend*.  Built with Java and Spring Boot.

## Project Setup

Please review the local development environment steps at https://github.com/ProvidenceGeeks/website-api-events/wiki#welcome-to-the-website-api-events-wiki

After Java and Maven installed, do the following to setup the project.

1. In order to create a new project, open Spring initializer (http://start.spring.io).  
2. Select a Maven project and enter the group and artifact. 
3. Add dependencies - Rest Repositories and Web. 
4. A zip file of the project would be downloaded. Open the project in IDE.
5. Run the project using the command line with the following command: mvn spring-boot:run.
6. The other way to run the application through the command line is with the spring cli tool, which lets you run it with just `spring run`, but it would need to be installed.  There are instructions for that here: https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started-installing-spring-boot.html
7. Then browse to http://localhost:8080/api and we can see the response from the controller and request mapping we just created.

## Development

## Release Management