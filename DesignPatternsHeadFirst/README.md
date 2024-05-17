# Design Patterns \| Book By Book

## OO Basics

* Abstraction
* Encapsulate
* Polymorphism
* Inheritance

## OO Principles

* Encapsulate what varies
* Favor composition over inheritance
* Program to interfaces, not implementations
* Strive for loosely coupled designs between objects that interact

## Chapter 01 - Strategy

Defines a family of algorithms, cencapsulates each one, and make them interchangeable. Strategy lets the algorithm vary indepeendently from clients that use it.

## Chapter 02 - Observer

Defines a one to many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

* Subjects and Observers are loosely coupled
* Pulling data from Subject to Observers is the more "correct" approach

## Chapter 03 - Decorator

Attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

* The decorator adds its own behavior before and or after delegating to the object it decorates to do the rest of the job.
* Decorator classes mirror the type of the components they decorate.

## Chapter 04 - Factory Pattern

* Client - What interacts with the factory to get the Product
* Factory - where the product is created
* Product - The interface of the product
* Concrete Product - Specific classes of the product

### Simple Factory

* Isn't actually a design pattern. It is more of a programming idiom.
* Factory:
    * 