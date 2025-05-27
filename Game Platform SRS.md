# Software Requirements Specification
## For <project Game Platform>

Version 0.1  
Prepared by <author>  Tianrui Zhang / James Weah
<organization>  UNCG CS340
<date created>  5/26/2025

Table of Contents
=================
* [Revision History](#revision-history)
* 1 [Introduction](#1-introduction)
  * 1.1 [Document Purpose](#11-document-purpose)
  * 1.2 [Product Scope](#12-product-scope)
  * 1.3 [Definitions, Acronyms and Abbreviations](#13-definitions-acronyms-and-abbreviations)
  * 1.4 [References](#14-references)
  * 1.5 [Document Overview](#15-document-overview)
* 2 [Product Overview](#2-product-overview)
  * 2.1 [Product Functions](#21-product-functions)
  * 2.2 [Product Constraints](#22-product-constraints)
  * 2.3 [User Characteristics](#23-user-characteristics)
  * 2.4 [Assumptions and Dependencies](#24-assumptions-and-dependencies)
* 3 [Requirements](#3-requirements)
  * 3.1 [Functional Requirements](#31-functional-requirements)
    * 3.1.1 [User Interfaces](#311-user-interfaces)
    * 3.1.2 [Hardware Interfaces](#312-hardware-interfaces)
    * 3.1.3 [Software Interfaces](#313-software-interfaces)
  * 3.2 [Non-Functional Requirements](#32-non-functional-requirements)
    * 3.2.1 [Performance](#321-performance)
    * 3.2.2 [Security](#322-security)
    * 3.2.3 [Reliability](#323-reliability)
    * 3.2.4 [Availability](#324-availability)
    * 3.2.5 [Compliance](#325-compliance)
    * 3.2.6 [Cost](#326-cost)
    * 3.2.7 [Deadline](#327-deadline)

## Revision History
| Name     | Date    | Reason For Changes  | Version   |
| -------- | ------- | ------------------- | --------- |
|T.Z, J.W  | 5/26/27 | Initial SRS         |  1.0      |
|          |         |                     |           |
|          |         |                     |           |

## 1. Introduction

### 1.1 Document Purpose
This document is created for users of this porduct including game players and game developers to show the requiremnts and overview of this product. 

### 1.2 Product Scope
This game platform is created for people who love to play games and game develpers. They can use this platform to publish their games or download and purchase some interesting game to play. 
Game Platform 0.0.1.
 This SRS described all the functionality of this product.
This product could be used in the gaming market to provide a wide range of services to its customers including game players and game developers. It satisfies the requirement of the trading for game develpers and it is useful for game players to find games to play. 

### 1.3 Definitions, Acronyms and Abbreviations                                                                                         
 SRS stands for software requirement specification.        
 Reference	Definition
* Java	A programming language originally developed by James Gosling at Sun Microsystems. We will be using this language to build Class Connect.
* Postgresql	Open-source relational database management system.
* SpringBoot	An open-source Java-based framework used to create a micro Service. This will be used to create and run our application.
* Spring MVC	Model-View-Controller. This is the architectural pattern that will be used to implement our system.
* Spring Web	Will be used to build our web application by using Spring MVC. This is one of the dependencies of our system.
* API	Application Programming Interface. This will be used to interface the backend and the fronted of our application.
* HTML	Hypertext Markup Language. This is the code that will be used to structure and design the web application and its content.
* CSS	Cascading Style Sheets. Will be used to add styles and appearance to the web app.
* JavaScript	An object-oriented computer programming language commonly used to create interactive effects within web browsers.Will be used in conjuction with HTML and CSS to make the web app.
* VS Code	An integrated development environment (IDE) for Java. This is where our system will be created.
            
                                                                    

### 1.4 References  
We don't have any additional documentation except JamesWeah.md, README. md and tianruizhang.md.
See explicitly at https://github.com/Qaggbgbgb/su25-team6/blob/main/JamesWeah.md
https://github.com/Qaggbgbgb/su25-team6/blob/main/README.md
https://github.com/Qaggbgbgb/su25-team6/blob/main/tianruizhang.md  .

### 1.5 Document Overview
The rest of this document described the overview of this product including functions and constraints and then the detailed requirements of this product separately in next two parts. 

## 2. Product Overview
Factors that can effect the product include but are not limmited to the Users desires on the websites whether it is to purchase or provide games / services. The technology a user may use could have an effect on the requirements and the performace of the product. 

### 2.1 Product Functions
The product must allow the customer to purchase games and services as well as allow provider to offer their services. 

             +------------------+
             |      Website     |
             | (Game Platform)  |
             +------------------+
                     / \
                    /   \
                   /     \
                  /       \
       +----------+       +-----------+
       |  Customer|       | Provider  |
       +----------+       +-----------+
           |                   |
    +------+-------+   +-------+------+
    | Browse games  |   | Offer games |
    | & services    |   | & services  |
    +------+-------+   +-------+------+
           |                   |
    +------+-------+   +-------+------+
    |  Purchase     |   | Manage       |
    |  services &   |   | offerings    |
    |  games        |   |              |
    +------+-------+   +-------+------+
           \                   /
            \                 /
             \               /
              \             /
               \           /
             +----------------+
             |     Chat        |
             | (Send messages) |
             +----------------+


### 2.2 Product Constraints
User will need to login in order to take advantage of all the features. Not having an account and logging in will lead to a far reduced expierence of the product. 
The website will be as responsive as possible however very rare screensizes may not be taken into account leading to a less responsive experience.
Depending on the customer or provider status certain features will be limited as expected. Ex. A customer will not be able to provide services.
  
### 2.3 User Characteristics
Customer and Provider class
General Customer - This customer will be a typical user that aims to purchase games/services on a regular bases.

Veteran Customer - This customer invest extensive time on the platform and the chats. The customer has an array of purchased games and services.

Community Provider - This is a single provider aiming to provide games and services to customer usually on a smaller scale. This provider is typically a solo provider.

Professional Provider - This a single account provider under the control of an organisation that provides games and services on a large scale. This provider typically values the statistics feature more.

### 2.4 Assumptions and Dependencies
Third party API's (ex. time or location api) may have an effect on the product as its availability status (active or inactive) is not dependent on the platform. The product will depend on a stable network connection.

## 3. Requirements

### 3.1 Functional Requirements 
R0: The system will allow gamers and develpers to Create or Modify Profiles.
R1: The system will allow gamers to View available games for purchase. 
R2: The system will allow gamers to View and add input to chat functions.
R3: The system will allow gamers to Modify views and settings(e.g., dark mode).
R4: Game players is able to purchase games, add-ons and subscribe to services of the software.
R5: Users can rate a game based on a star based method, and comments and view them.
R6: The system will allow developers to Ability to add games.
R7: The systems will allow game develpers to Create services and allow customers to subscribe to services
R8: The system can Show game developers what users have subscribed.  
R9: The game developers has Ability to reply to customers in review chat.


#### 3.1.1 User interfaces
A software includes a logging interface and working interface for both developers and players. 
a logging interface should Including include usename and password. ANd ability to sign up.
a working interface include libraries for players showing what they bought and allow them to play. It could also include setting button allow users to modify the viewings and log out. 
It could also include commmunity where people are going to chat. And ability to rate the games they purchased. It includes review button and could let users and developers write reviews and view other reviews.
It should include a service button. It could let players and developers to subscribe and publish services. And show developers what players have subscribed.

#### 3.1.2 Hardware interfaces
Mac and Software Windows
Updated version

#### 3.1.3 Software interfaces
Java jdk 21
PostgreSQL 17
SpringBoot 3.4.5

### 3.2 Non Functional Requirements 

#### 3.2.1 Performance

- NFR0: The platform must be smooth and have short loading times. 
- NFR1: The platform must be responsive on a varity of screen sizes.
- NFR2: The platform must be able to handle a large number of users simultaneously.
- NFR3: The platform must be interactive allowing users to see game/services updates consistant with providers offering.
- NFR4: User must not experience a number of errors during the process of using the platform.


#### 3.2.2 Security

- NFR5: User must be the only person capable of accessing there information.
- NFR6: Users that provide games/services may be the only ones capable of making changes to these games and services.
- NFR7: User sessions must have a finite duration time.



#### 3.2.3 Reliability

- NFR8: User must experience minimal errors.
- NFR10: User must experience a fast platform.
- NFR11: User must have a secure experience.
- NFR12: User must have access to there account 24/7.


#### 3.2.4 Availability

- NFR13: Product prototype must be completed by the 29th of May.
- NFR14: Product backend api must be completed by the 5th of June.
- NFR15: Product must be complete by the 18th of June.
- NFR16: User must have access to there account 24/7.
- NFR17: Downtime of the product must not surpase the 6 hours mark.

#### 3.2.5 Compliance

- NFR18: User must experience a safe evironment in chat.
- NFR19: User must be notified if personal information is exposed.
- NFR20: User financial information must not be shared with anyone.
- NFR21: User with disrespectul messages must be warned and banned if behavior continues.

#### 3.2.6 Cost

- NFR22: The product will be free to make(with the exception of pre-existing hardware).
- NFR23: The software will be available to user for free.

#### 3.2.7 Deadline

- NFR24: Product must have weekly checkpoints of progression documenting changing to the product.
- NFR25: User must have access to the product by June 18.

