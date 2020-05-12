# Grocery Analytics

### Table of Contents

- [Grocery Analytics](#grocery-analytics)
    - [Table of Contents](#table-of-contents)
  - [About](#about)
  - [Introduction](#introduction)
  - [Screenshots](#screenshots)
  - [Running Grocery Analytics locally](#running-grocery-analytics-locally)
    - [Prerequisites](#prerequisites)
    - [Instructions](#instructions)
      - [1. Clone the project](#1-clone-the-project)
      - [2. Set up database](#2-set-up-database)
      - [3. Run the client](#3-run-the-client)
      - [4. Populate database](#4-populate-database)
  - [Sequence Diagram](#sequence-diagram)
  - [Database Schema](#database-schema)
  - [Database Queries](#database-queries)
  - [License](#license)

## About

**University**: San Jose State University

**Course**: Enterprise Software - Computer Engineering 172 / Spring 2020

**Team Members**: Sophie Chen, Stefan Do, Janice Lu

## Introduction

Grocery Store Owners often don't realize that the most valuable information they have is right in front of them, their customers and their shopping habits. Grocery stores already keep track of their inventory but often do not utilize this information to make better informed decisions to improve their stores.

Grocery Analytics aims to solve this problem. By utilizing the data that grocery stores collect, like store traffic and inventory sold, Grocery Analytics helps grocery store owners and employees to make decisions for their business that's backed by data.

## Screenshots

**Home Screen**
<img src= "https://github.com/JaniceLu/cmpe172_project/blob/master/resources/cmpe172github1.png"/>

**Item Analytics Screen**
<img src= "https://github.com/JaniceLu/cmpe172_project/blob/master/resources/cmpe172github2.png"/>

**Store Traffic Screen - Hourly**
<img src= "https://github.com/JaniceLu/cmpe172_project/blob/master/resources/cmpe172github3.png"/>

**Store Traffic Screen - Weekly**
<img src= "https://github.com/JaniceLu/cmpe172_project/blob/master/resources/cmpe172github4.png"/>

**Store Traffic Screen - Monthly**
<img src= "https://github.com/JaniceLu/cmpe172_project/blob/master/resources/cmpe172github5.png"/>

**Store Analytics Screen**
<img src= "https://github.com/JaniceLu/cmpe172_project/blob/master/resources/cmpe172github6.png"/>

## Running Grocery Analytics locally

### Prerequisites

- Docker Desktop and Docker Account
- MySQL Workbench
- Suggested: GitHub Desktop

### Instructions

#### 1. Clone the project

 - Option 1: Use Command Line or Terminal to clone project into desired folder

```java
git clone https://github.com/JaniceLu/cmpe172_project.git
```

- Option 2: Go to https://github.com/JaniceLu/cmpe172_project and click on "Clone or download" (requires GitHub Desktop installed or download the zip and place in desired folder)

#### 2. Set up database

Create database using this command in MySQL Workbench: 

```java
Create database store;
```
Configure application.properties file to match your database and credentials:
```java
spring.jpa.hibernate.ddl-auto = create
spring.datasource.url = jdbc:mysql://${MYSQL_HOST:localhost}:3306/YOUR_DATABASE_NAME
spring.datasource.username = YOUR_USERNAME
spring.datasource.password = YOUR_PASSWORD
```

#### 3. Run the client

Navigate to the folder that you cloned the project into then run this command:
```java
./gradlew bootRun
```
* Make sure that this can run successfully and check localhost/8080
* Make sure that the database and its tables have been successfully created

#### 4. Populate database

- Stop the localhost (CTRL+C, choose Y to end process)
- Go to MySQL Workbench and import an appropriately formatted CSV file for each table

## Sequence Diagram
<img src= "https://github.com/JaniceLu/cmpe172_project/blob/master/resources/SequenceDiagram.png"/>

## Database Schema
<img src= "https://github.com/JaniceLu/cmpe172_project/blob/master/resources/Schema.png"/>

## Database Queries

All queries are handled through Spring Boot JPA (CRUD repositories) and Thymeleaf's templates.

License
----
All parts of this project are free to use under the open-source MIT license.

