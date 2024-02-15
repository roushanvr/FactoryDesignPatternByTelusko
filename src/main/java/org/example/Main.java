package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //OS obj=new Android();
        //we want to hide the logic of object creation from clients/users.
        //so we can't write OS obj=new Android();
        //for this we create a factory class which has one function called getInstance()
        Factory factory=new Factory();
        OS obj=factory.getInstance("Ios");
        obj.spec();
    }
}