# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

Embed your UML Diagram here. Upload the image of your UML Diagram to your repo, then use Markdown to insert your image here:

![UML Diagram for my project]((https://github.com/user-attachments/files/33297282/Copy.of.UML.Diagram.pdf))

## Description

1. My project I created a cafe. It is a small café that sells beverages and pastries, including iced lattes, hot coffee, chocolate chip cookies, and croissants. I chose this business because I enjoy the idea of having a café and wanted to create a program that helps manage its products and inventory. My program uses object oriented programming and a class hierarchy to organize the café's products. The superclass, MenuItem, contains instance variables shared by all products, such as the item name, ID, price, and quantity available. The subclasses, Beverage and Pastry, extend the superclass and contain their own unique instance variables. For example, Beverage stores the size and temperature, while Pastry stores the pastry type and whether it is gluten-free. Each class has a no-argument constructor and a parameterized constructor. The subclass constructors use the super keyword to call the superclass constructor. I also implemented accessor methods, mutator methods, toString() methods to retrieve, modify, and display information about each object. The program uses a Scanner object to receive user input through the console. The user can choose an option to view the café menu, check inventory, update the quantity of an item, or exit the program. The program uses the user's response to determine which information to display or which inventory value to update.

2. The project represents real-world products and inventory, showing how information about products can be organized and tracked systematically.
I used Java, classes, objects, inheritance, constructors, and a Scanner object to create a working store management program. I designed a class hierarchy with a superclass and subclasses. This structure allows the program to organize different types of products while reusing code from the superclass. I created a café concept with a business name, a menu, and different types of products. The UML diagram also visually organizes the classes and their relationships. The program uses numeric data types such as int and double to represent item IDs, inventory quantities, and prices. It also uses logical decisions to respond to menu choices and update inventory. 

3.  I created a superclass and subclasses to represent different café products. UI created no-argument and parameterized constructors and used super() to initialize inherited variables.sed extends so that Beverage and Pastry inherit shared variables and methods from MenuItem.I made instance variables private and used public getter and setter methods to access and modify them.I implemented toString() methods in the superclass and subclasses to display object information.I used a Scanner object to collect input from the user. I used conditional statements to respond to user choices and update the café's inventory.



