//Author:Swanit Rivankar
//RollNo:2453
//Title:Java Application Demonstrating Exception Handling, Generics, and Lambda Functions
//Start Date:22nd October 2024
//Modified Date:22nd October 2024
//Description:This Java program offers a simple menu-driven application with options to test various programming concepts, including exception handling, generic classes, and lambda functions.

public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void display() {
        System.out.println("First: " + first + ", Second: " + second);
    }
}