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
* Classes should be OPEN for extension but CLOSED for modification ( Open-Closed Principle )
* Depend upon abstractions. Do not depend upon concrete classes. ( Dependency Inversion Principal )

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
* The Decorator Pattern provides an altrenative to subclassing for extending behavior.
* Decorators can result in many small objects in our design, and overuse can be complex.

## Chapter 04 - Factory Pattern & Abstract Pattern

* both encapsulate object creation to keep applications loosely coupled and less dependent on implementations.

Do you have families of products you need to create and you want to make sure your clients create products that belong togehter?
* Use the abstract method

Do you not know ahead of time all the concrete classes you are going to need?
* Use the factory method

### Factory Pattern
Defines an interface for creating an object, but lets subclasses decide which class to instantiate. The method lets a class defer instantiation to subclasses.

* Creates objects through inheritance
* All factory patterns encapsulate object creation.
* Encapsulates object creation by letting sublcasses decide what objects to create. 

#### Terms
* Client - What interacts with the factory to get the Product
* Factory - where the product is created
* Product - The interface of the product
* Concrete Product - Specific classes of the product

#### Simple Factory
* Isn't actually a design pattern. It is more of a programming idiom.

    < Insert Image of simple factory here >

#### Avoid violating the Dependency Inversion Principle
* No variable should hold a reference to a concrete class
* No class should derive from a concrete class
* No method should override an implementation method of any of its base classes

### Abstract Factory Pattern
Provides an tnterface for creating families of RELATED or DEPENDENT objects without specifying their concrete classses.


* Creates objects through composition 
* Group together a set of related products
* Interface has to change if new products are added 

## Chapter 05 - Singleton Principle
Ensures a class has only one instance, and provides a global point of access to it.

* Has no public constructor

### Best used for:
1. Thread pools
2. Logging

### Ways of implementing the Singleton Pattern
1. Synchronized Approach
2. Eager approach
3. Double-checked locking approach

** Note to self: Dont over think this DP **
## Chapter 06 - Command Pattern
Encapsulates a request as an object, thereby letting you parameterize other objects with different requests, queue or log requests, and support undoable operations.

### Key Terms
* Invoker
* Receiver
* Command


## Questions
1. Why do we use interfaces instead of abstract classses and vise versa?

We use interfaces only to describe an object. 
Abstract classes describe the object and set base functionality for subclasses to inherit.

## Resources

### Book Resources
https://wickedlysmart.com/head-first-design-patterns/


