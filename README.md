## Java-Constructor

A Java constructor is a special block of code used to initialize objects when they are created.

## Key Characteristics of a Java Constructor
Name Matching: A constructor's name must be the exact same as its class name.
No Return Type: Unlike regular methods, a constructor does not have an explicit return type, not even void.
Automatic Invocation: The constructor is automatically called by the Java Virtual Machine (JVM) whenever a new instance of the class is created using the new keyword.
Initialization Logic: Its primary purpose is to perform start-up procedures, such as setting default values or connecting to resources like a database. 


## Types of Constructors
Default Constructor: If you don't define any constructor in your class, the Java compiler automatically provides a default, no-argument constructor. This constructor initializes all member variables to their default values (e.g., 0 for an integer, null for a string).
No-args Constructor: This is an explicitly defined constructor that takes no arguments. Developers can use it to set specific default values or perform other initialization logic when a default constructor is not sufficient.
Parameterized Constructor: This type of constructor accepts one or more parameters. It allows you to initialize object attributes with specific, unique values passed in during object creation. 

