//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ride implements RideInterface {
    private String name;
    private Employee operator;
    private int maxRiders;
    private int numOfCycles;
    private Queue<Visitor> waitingLine = new LinkedList();
    private LinkedList<Visitor> rideHistory = new LinkedList();

    public Ride(String name, Employee operator, int maxRiders) {
        this.name = name;
        this.operator = operator;
        this.maxRiders = maxRiders;
    }

    public void addVisitorToQueue(Visitor visitor) {
        this.waitingLine.add(visitor);
        System.out.println("Visitor added to waiting line: " + visitor.getName());
    }

    public void removeVisitorFromQueue(Visitor visitor) {
        if (this.waitingLine.remove(visitor)) {
            System.out.println("Visitor removed from waiting line: " + visitor.getName());
        } else {
            System.out.println("Visitor not found in waiting line.");
        }

    }

    public void printQueue() {
        System.out.println("Visitors in waiting line:");
        Iterator var1 = this.waitingLine.iterator();

        while(var1.hasNext()) {
            Visitor visitor = (Visitor)var1.next();
            System.out.println(visitor.getName());
        }

    }

    public void addVisitorToHistory(Visitor visitor) {
        this.rideHistory.add(visitor);
        System.out.println("Visitor added to history: " + visitor.getName());
    }

    public void runOneCycle() {
        if (this.operator == null) {
            System.out.println("No operator assigned. Ride cannot run.");
        } else if (this.waitingLine.isEmpty()) {
            System.out.println("No visitors in waiting line. Ride cannot run.");
        } else {
            System.out.println("Running one cycle. Max riders per cycle: " + this.maxRiders);

            for(int i = 0; i < this.maxRiders && !this.waitingLine.isEmpty(); ++i) {
                Visitor visitor = (Visitor)this.waitingLine.poll();
                this.rideHistory.add(visitor);
                System.out.println("Visitor " + visitor.getName() + " took the ride.");
            }

            ++this.numOfCycles;
            System.out.println("Ride completed one cycle.");
        }
    }

    public boolean checkVisitorFromHistory(Visitor visitor) {
        return this.rideHistory.contains(visitor);
    }

    public int numberOfVisitors() {
        return this.rideHistory.size();
    }

    public void printRideHistory() {
        System.out.println("Visitors in ride history:");
        Iterator var1 = this.rideHistory.iterator();

        while(var1.hasNext()) {
            Visitor visitor = (Visitor)var1.next();
            System.out.println(visitor.getName());
        }

    }

    public void sortRideHistory() {
        Collections.sort(this.rideHistory, new VisitorComparator());
        System.out.println("Ride history sorted.");
    }

    public void exportRideHistory() {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("ride_history.csv"));

            try {
                Iterator var2 = this.rideHistory.iterator();

                while(true) {
                    if (!var2.hasNext()) {
                        System.out.println("Ride history exported to ride_history.csv");
                        break;
                    }

                    Visitor visitor = (Visitor)var2.next();
                    String var10001 = visitor.getName();
                    writer.println(var10001 + "," + visitor.getAge() + "," + visitor.getId());
                }
            } catch (Throwable var5) {
                try {
                    writer.close();
                } catch (Throwable var4) {
                    var5.addSuppressed(var4);
                }

                throw var5;
            }

            writer.close();
        } catch (IOException var6) {
            IOException e = var6;
            System.out.println("Error exporting ride history: " + e.getMessage());
        }

    }

    public void importRideHistory() {
        try {
            Scanner scanner = new Scanner(new File("ride_history.csv"));

            try {
                while(true) {
                    if (!scanner.hasNextLine()) {
                        System.out.println("Ride history imported from ride_history.csv");
                        break;
                    }

                    String[] parts = scanner.nextLine().split(",");
                    if (parts.length == 3) {
                        Visitor visitor = new Visitor(parts[0], Integer.parseInt(parts[1]), parts[2], "Standard", false);
                        this.rideHistory.add(visitor);
                    } else {
                        System.out.println("Invalid data format in line: " + String.join(",", parts));
                    }
                }
            } catch (Throwable var5) {
                try {
                    scanner.close();
                } catch (Throwable var4) {
                    var5.addSuppressed(var4);
                }

                throw var5;
            }

            scanner.close();
        } catch (FileNotFoundException var6) {
            FileNotFoundException e = var6;
            System.out.println("Error importing ride history: " + e.getMessage());
        }

    }
}
