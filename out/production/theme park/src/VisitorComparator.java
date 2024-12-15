//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package src;

import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {
    public VisitorComparator() {
    }

    public int compare(Visitor v1, Visitor v2) {
        int ageCompare = Integer.compare(v1.getAge(), v2.getAge());
        return ageCompare != 0 ? ageCompare : v1.getName().compareTo(v2.getName());
    }
}
