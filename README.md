# Unit Testing and JUnit Examples

This repository provides beginner-friendly explanations of unit testing and JUnit, a popular Java testing framework. The repository contains implementations of basic applications for JUnit tests, with detailed explanations for beginners.

## Getting Started
Make sure you have the following dependency added to your pom.xml file:

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>RELEASE</version>
</dependency>
```
## Classes

### 1. Elec Class
The `Elec` class contains a method to determine if the power (in watts) is less than 2000W based on voltage and current.

```java
public class Elec {
    public boolean isPowerLessThan2000W(int voltage, int current){
        return (voltage * current < 2000);
    }
}
```
Unit Test: ElecTest
This class tests the isPowerLessThan2000W method of the Elec class.

### 2. Rectangle Class
The `Rectangle` class calculates the perimeter of a rectangle based on its width and height.

```java
public class Rectangle {
    public int perimeter(int width, int height){
        return 2 * (width + height);
    }
}
```
Unit Test: RectangleTest
This class tests the perimeter method of the Rectangle class.

### 3. Vowel Class
The `Vowel` class counts the number of vowels in a given string.

```java
public class Vowel {
    char[] vowels = {'a','o','u','e','i','y','A','O','U','E','I','Y'};

    public int vowelCount(String string){
        if(string == null) return 0;
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if(isVowel(string.charAt(i))) count++;
        }
        return count;
    }
    public boolean isVowel(char c){
        for (char x:vowels){
            if(c==x) return true;
        }
        return false;
    }
}
```
Unit Test: VowelTest
This class tests the vowelCount method of the Vowel class.
