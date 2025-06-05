# Game Platform- Software Design 

Version 1  
Prepared by Tianrui Zhang and James Weah\
Game Platform\
June 5, 2025

Table of Contents
=================
* [Revision History](#revision-history)
* 1 [Product Overview](#1-product-overview)
* 2 [Use Cases](#2-use-cases)
  * 2.1 [Use Case Model](#21-use-case-model)
  * 2.2 [Use Case Descriptions](#22-use-case-descriptions)
    * 2.2.1 [Actor: Teacher](#221-actor-teacher)
    * 2.2.2 [Actor: Student](#222-actor-student) 
* 3 [UML Class Diagram](#3-uml-class-diagram)
* 4 [Database Schema](#4-database-schema)

## Revision History
| Name | Date    | Reason For Changes  | Version   |
| ---- | ------- | ------------------- | --------- |
|      |         |                     |           |
|      |         |                     |           |
|      |         |                     |           |

## 1. Product Overview

This is a game platform made for game players and game developers. It provides a way for users to set up own profiles, chat in the community, write reviews and purchase products. 

This application would be a nice place to gather and enjoy games. Welcome every game developer to publish games and every game player to try playing here.
## 2. Use Cases
### 2.1 Use Case Model
![Use Case Model](https://github.com/Qaggbgbgb/su25-team6/blob/main/object%20oriented%20design/use-case-diagram.png)

### 2.2 Use Case Descriptions

#### 2.2.1 Actor: Customer
##### 2.2.1.1 Sign Up
A teacher can sign up to create their profile with their name, email, password, and bio. Emails must be unique.
##### 2.2.1.2 Log In
A teacher shall be able to sign in using their registred email and password. After logging in, the teacher shall be directed their dashboard where they see an overview of their classes and stats.
##### 2.2.1.3 Update Profile
A teacher shall be to modify their profile by going to their profile page. They can change their email, password, profile picture, and biography.
##### 2.2.1.4 Create Class
The teacher shall be able to create a new class listing. They would provide a class name, code, description, and schedule. This class will be created to be associated with only this teacher.
##### 2.2.1.4 Manage Class Content
A teacher shall be able to add and remove class assignments and announcements, as well as assign grades to their students.

#### 2.2.2 Actor: Developer
##### 2.2.2.1 publish games 
A game developer can publish games in Game Store.
##### 2.2.2.2 publish services
A game developer can publish services in Services.
##### 2.2.2.3 reply in reviews
A game developer can write reviews to reply to the users.
##### 2.2.1.4 sign up for the platform
A game developer can create an account and log in to view their profile.


## 3. UML Class Diagram
![UML Class Diagram](https://github.com/Qaggbgbgb/su25-team6/blob/main/object%20oriented%20design/class-diagram.png)
## 4. Database Schema
![Database Schema](https://github.com/Qaggbgbgb/su25-team6/blob/main/object%20oriented%20design/schema1.png)&&(https://github.com/Qaggbgbgb/su25-team6/blob/main/object%20oriented%20design/schema2.png)
