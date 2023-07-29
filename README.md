# Backend-Spring
## Introduction 
This Repository contains the Backend of the web application Which i have created using Spring Framework, It is Redirecting the requests Using Spring boot and I have used Spring Security
for the authentication and Spring DATA JPA which will be resposible for sending requests to the MySql
## Dependencies
1. Thymeleaf
2. Spring Security
3. Spring Boot
4. Spring JPA
5. BeCrypt

## Installation 
1. Clone the repository using `git clone https://github.com/ShivanshCharak/Backend-Spring`
2. Download all teh dependency I have used Mven you just need to Reload the `pom.xml` it will download by itself
3. Change the Configuration of the application bt chainging the `application.properties` If you are using RDS change the url from mysql to RDS url
4. And simply compile the code and run it to host it on 8080
## Diagram
<img alt="Coding" src=./Ignore.png/>

## Explaination
- Frontend: HTML will send the request regarding the routing or whenever will send data to the backgroung regarding validation or other purposes
- Controllers: Controller will catch the request regarding routing between pages and send the requested HTML page to the website
- Services and Model: It contains the business logic Mainly the model layer is responsible for dealing woth the data before sending it to the service layer Model is responsible for validating the data and maintaining the Concept of `One to Many` or `Many to One` And the `Cascading types` and `Retrieval type` and then service layer will send the request to Repository layer which will dead with the Database
- Repository: This layer is responsible for managing the database methods like selecting inserting etc on the basis of configuration each variable have which i have initialized in the model layer
- Audit and Aspects: are cross-cutting concerns performing tasks across multiple layers. `Audit` can track changes across all layers for record-keeping or compliance, and `Aspects` typically handle tasks like logging, security, or transaction management that multiple layers need.

## Don't Forget to Like It! :star:

If you found this repository helpful or if it saved you time, please consider giving it a star ⭐️. It's a simple way to show your appreciation and helps others discover the project.

Your support is greatly appreciated! :heart:
 
<div style="text-align: center;">
  <a href="https://emoji.gg/emoji/5064-angel">
    <img src="https://cdn3.emoji.gg/emojis/5064-angel.png" width="64px" height="64px" alt="angel">
  </a>
</div>
