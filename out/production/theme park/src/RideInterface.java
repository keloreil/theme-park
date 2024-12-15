//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package src;

public interface RideInterface {
    void addVisitorToQueue(Visitor var1);

    void removeVisitorFromQueue(Visitor var1);

    void printQueue();

    void runOneCycle();

    void addVisitorToHistory(Visitor var1);

    boolean checkVisitorFromHistory(Visitor var1);

    int numberOfVisitors();

    void printRideHistory();
}
