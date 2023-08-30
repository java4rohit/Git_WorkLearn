package com.java4rohit.DesignPattern.CreationalPattern.Factory;

/*
When there is SuperClass Multiple Subclass, and we want to get Object of SubClass based on Inout
and requirement
Then we create a factory class which take the responsibility of creating object class based on input.

Advantage:
1.Focus on creating object  for interface  rather than implementation.
2.loose coupling  more robust code.
 */
public class DeveloperFactory {
    public static Employee getDeveloper(String developerType) {

        if (developerType.trim().equalsIgnoreCase("Web Developer")) {
            WebDeveloper developer = new WebDeveloper();
            return developer;
        } else if (developerType.trim().equalsIgnoreCase("Java Developer")) {
            JavaDeveloper developer = new JavaDeveloper();
            return developer;
        }
        else
            return null;
    }
}
