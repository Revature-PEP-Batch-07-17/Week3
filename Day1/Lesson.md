# Principals of OOP: Abstraction and Encapsulation

## Abstraction:

A way to hide certain details in code (ie how things work) and only showing essential information to the user

Abstract Classes:
- uses the word 'abstract' in the class definition
- allows for methods to be abstract (not implemented)
- cannot instantiate an object from an abstract class
- only one abstract can be inherited to a subclass

Interfaces:
- contains abstract methods; any fields/properties are public, static, final
- can implement as many interfaces to a subclass as you want
- the subclass that inherits the interface MUST define/implement all abstract methods in the interface
- cannot instantiate an object from an interface

## Encapsulation

A way to package related classes/data together and provide security for the code through access modifiers.

Access Modifiers:
- public: accessible anywhere in the program
- protected: accessible in the package and subclasses
- default: accessible in the class and package
- private: only accessible in the class
    * Use getters/setters to manipulate private data