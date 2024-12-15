package src;

import java.util.Collections;

public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
        assignment.partFourA();
        assignment.partFourB();
        assignment.partFive();
        assignment.partSix();
        assignment.partSeven();
    }

    public void partThree() {
        Ride ride = new Ride("Roller Coaster", new Employee("John", 30, "E001", "Operator", 50000), 2);
        ride.addVisitorToQueue(new Visitor("Jack", 25, "V001", "Standard", false));
        ride.addVisitorToQueue(new Visitor("Sharon", 30, "V002", "Standard", false));
        ride.addVisitorToQueue(new Visitor("Benny", 35, "V003", "Standard", false));
        ride.addVisitorToQueue(new Visitor("Leo", 40, "V004", "Standard", false));
        ride.printQueue();
        ride.runOneCycle();
        ride.printQueue();
        ride.printRideHistory();
    }

    public void partFourA() {
        Ride ride = new Ride("Ferris Wheel", new Employee("Jane", 28, "E002", "Operator", 50000), 4);
        ride.addVisitorToQueue(new Visitor("Tom", 25, "V005", "Standard", false));
        ride.addVisitorToQueue(new Visitor("Sherly", 30, "V006", "Standard", false));
        ride.addVisitorToQueue(new Visitor("Ben", 35, "V007", "Standard", false));
        ride.addVisitorToQueue(new Visitor("David", 40, "V008", "Standard", false));
        ride.runOneCycle();
        ride.printQueue();
        ride.printRideHistory();
    }

    public void partFourB() {
        Ride ride = new Ride("Carousel", new Employee("Alice", 28, "E003", "Operator", 45000), 3);
        ride.addVisitorToHistory(new Visitor("Amy", 22, "V009", "Standard", false));
        ride.addVisitorToHistory(new Visitor("Bob", 24, "V010", "Standard", false));
        ride.addVisitorToHistory(new Visitor("Charlie", 23, "V011", "Standard", false));
        ride.printRideHistory();
        ride.sortRideHistory();
        ride.printRideHistory();
    }

    public void partFive() {
        Ride ride = new Ride("Roller Coaster", new Employee("John", 30, "E001", "Operator", 50000), 2);
        ride.addVisitorToQueue(new Visitor("Eva", 26, "V012", "Standard", false));
        ride.addVisitorToQueue(new Visitor("Frank", 27, "V013", "Standard", false));
        ride.addVisitorToQueue(new Visitor("Grace", 28, "V014", "Standard", false));
        ride.runOneCycle();
        ride.printQueue();
        ride.printRideHistory();
    }

    public void partSix() {
        Ride ride = new Ride("Ferris Wheel", new Employee("Jane", 28, "E002", "Operator", 50000), 4);
        ride.addVisitorToHistory(new Visitor("Hank", 30, "V015", "Standard", false));
        ride.addVisitorToHistory(new Visitor("Ivy", 29, "V016", "Standard", false));
        ride.exportRideHistory();
    }

    public void partSeven() {
        Ride ride = new Ride("Merry-Go-Round", new Employee("Dave", 32, "E004", "Operator", 48000), 3);
        ride.importRideHistory();
        System.out.println("Number of visitors in ride history: " + ride.numberOfVisitors());
        ride.printRideHistory();
    }
}
