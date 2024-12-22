# Declarations and Access Control
## Identifiers and Keywords (OCA Objectives 1.2 and 2.1)
### Legal Identifiers
+ Identifiers must start with a letter, a currency character ($), or a connecting character such as
the underscore (_). Identifiers cannot start with a digit!
+ After the first character, identifiers can contain any combination of letters, currency
characters, connecting characters, or numbers.
+ In practice, there is no limit to the number of characters an identifier can contain.
+ You can’t use a Java keyword as an identifier.
    ```java
    // RIGHT V
    int $a=1;
    int _____a=1;
    int $=1;
    int _=1;

    // WRONG X
    int :1=1;
    int false=false;
    int true=false;
    int if=1;
    int -d=1;
    int .a=1;
    int 3a=1;
    ```
### Source File Declaration Rules
+ There can be only one public class per source code file
    ```java
    // WRONG X
    public class Car {}
    public class Car2 {}
    ```
+ Comments can appear at the beginning or end of any line in the source code file; they are
independent of any of the positioning rules discussed here.

    ```java
    // RIGHT V
    //public
    package demo;//aaa
    ```
+ If there is a public class in a file, the name of the file must match the name of the public class.
    
    ```java
    public class Car {}
    // RIGHT V
    // => Car.java 
    
    // WRONG X
    // => CarDemo.java 
    ```
+ If the class is part of a package, the package statement must be the first line in the source code file, before any import statements that may be present.
    ```java
    // RIGHT V
    package demo;
    import java.awt.Color;

    // WRONG X
     import java.awt.Color;
     package demo;
     
     // WRONG X
     package demo;
     public class Car {}
     import java.awt.Color;
    ```
+ If there are import statements, they must go between the package statement (if there is one) and the class declaration. If there isn’t a package statement, then the import statement(s) must be the first line(s) in the source code file. If there are no package or import statements, the class declaration must be the first line in the source code file
    ```java
    // WRONG X

     public class Car {}
     import java.awt.Color;
    ```

+ import and package statements apply to all classes within a source code file. In other words, there’s no way to declare multiple classes in a file and have them in different packages or use different imports.

+ A file can have more than one non-public class
    ```java
    // RIGHT V
     public class Car {}
     class NewCar {}
     class OldCar {}
    ```
+ Files with no public classes can have a name that does not match any of the classes in the file
    ```java
    // RIGHT V
     class Car {}
     class NewCar {}
     class OldCar {}
     // => AnyClass.java
    ```

### Using the javac and java Commands
#### Compiling with javac
+ The javac command is used to invoke Java’s compiler.
    ```cmd
    // RIGHT V
    javac [options] [source files]
    javac -help
    javac -version Foo.java Bar.java
    ```
#### Launching Applications with java
+ The java command is used to invoke the Java Virtual Machine (JVM).
+ The [options] and [args] parts of the java command are optional, and they can both have multiple values
    ```cmd
    // RIGHT V
    java [options] class [args]
    java -showversion MyClass x 1
    ```

#### Using public static void main(String[ ] args)
+ the only version of main() will be run 
    ```java
    // RIGHT V
    public static void main(String[] args)
    static public void main(String[] args)
    static public void main(String... x)
    static public void main(String args[])
    ```

### Import Statements and the Java API
+ fully qualified name
    ```java
    // RIGHT V
    public static void main(String args[] ) {
        java.util.List<String> a=new java.util.ArrayList<String>();
    }
    ```
+ use import

    ```java
    import java.util.ArrayList;
    import java.util.List;
    // RIGHT V
    public static void main(String args[] ) {
        List<String> a=new ArrayList<String>();
    }
    ```

    ```java
    import java.util.*;
    // RIGHT V
    public static void main(String args[] ) {
        List<String> a=new ArrayList<String>();
    }
    ```
    
#### Static Import Statements