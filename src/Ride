package src;

import java.util.*;
import java.io.*;

public class Ride implements RideInterface {
    private String name;
    private Employee operator;
    private int maxRiders; // 每次循环最多可以乘坐的游客数量
    private int numOfCycles; // 已经运行的循环次数
    private Queue<Visitor> waitingLine = new LinkedList<>(); // 等待队列
    private LinkedList<Visitor> rideHistory = new LinkedList<>(); // 历史记录

    public Ride(String name, Employee operator, int maxRiders) {
        this.name = name;
        this.operator = operator;
        this.maxRiders = maxRiders;
    }

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        waitingLine.add(visitor);
        System.out.println("Visitor added to waiting line: " + visitor.getName());
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (waitingLine.remove(visitor)) {
            System.out.println("Visitor removed from waiting line: " + visitor.getName());
        } else {
            System.out.println("Visitor not found in waiting line.");
        }
    }

    @Override
    public void printQueue() {
        System.out.println("Visitors in waiting line:");
        for (Visitor visitor : waitingLine) {
            System.out.println(visitor.getName());
        }
    }

    @Override
    public void runOneCycle() {
        if (operator == null) {
            System.out.println("No operator assigned. Ride cannot run.");
            return;
        }
        if (waitingLine.isEmpty()) {
            System.out.println("No visitors in waiting line. Ride cannot run.");
            return;
        }
        System.out.println("Running one cycle. Max riders per cycle: " + maxRiders);
        for (int i = 0; i < maxRiders && !waitingLine.isEmpty(); i++) {
            Visitor visitor = waitingLine.poll();
            rideHistory.add(visitor);
            System.out.println("Visitor " + visitor.getName() + " took the ride.");
        }
        numOfCycles++;
        System.out.println("Ride completed one cycle.");
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println("Visitor added to history: " + visitor.getName());
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return rideHistory.contains(visitor);
    }

    @Override
    public int numberOfVisitors() {
        return rideHistory.size();
    }

    @Override
    public void printRideHistory() {
        System.out.println("Visitors in ride history:");
        for (Visitor visitor : rideHistory) {
            System.out.println(visitor.getName());
        }
    }

    public void sortRideHistory() {
        Collections.sort(rideHistory, new VisitorComparator());
        System.out.println("Ride history sorted.");
    }

    public void exportRideHistory() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("ride_history.csv"))) {
            for (Visitor visitor : rideHistory) {
                writer.println(visitor.getName() + "," + visitor.getAge() + "," + visitor.getId());
            }
            System.out.println("Ride history exported to ride_history.csv");
        } catch (IOException e) {
            System.out.println("Error exporting ride history: " + e.getMessage());
        }
    }

    public void importRideHistory() {
        try (Scanner scanner = new Scanner(new File("ride_history.csv"))) {
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(",");
                if (parts.length == 3) {
                    Visitor visitor = new Visitor(parts[0], Integer.parseInt(parts[1]), parts[2], "Standard", false);
                    rideHistory.add(visitor);
                } else {
                    System.out.println("Invalid data format in line: " + String.join(",", parts));
                }
            }
            System.out.println("Ride history imported from ride_history.csv");
        } catch (FileNotFoundException e) {
            System.out.println("Error importing ride history: " + e.getMessage());
        }
    }
}
