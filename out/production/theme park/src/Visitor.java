//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package src;

public class Visitor extends Person {
    private String ticketType;
    private boolean hasFastPass;

    public Visitor() {
    }

    public Visitor(String name, int age, String id, String ticketType, boolean hasFastPass) {
        super(name, age, id);
        this.ticketType = ticketType;
        this.hasFastPass = hasFastPass;
    }

    public String getTicketType() {
        return this.ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public boolean isHasFastPass() {
        return this.hasFastPass;
    }

    public void setHasFastPass(boolean hasFastPass) {
        this.hasFastPass = hasFastPass;
    }
}