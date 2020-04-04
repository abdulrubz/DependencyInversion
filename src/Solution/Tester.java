package Solution;

import java.util.ArrayList;
import java.util.List;

public class Tester {

    private List<Connectivity> technologies;
    public Tester() {
        //Gets all the Connecting technologies
        Connectivity b = new Bluetooth();
        Connectivity n = new NFC();
        List<Connectivity> list = new ArrayList<Connectivity>();
        list.add(b);
        list.add(n);
        technologies = list;
    }

    public void implement() {
        technologies.forEach(tech -> tech.connect());
    }

    public static void main(String[] args) {
        Tester t = new Tester();
        t.implement();
    }
}

//This is the class or module that implements the lower level modules.
//OUTPUT
//Connecting via Bluetooth
//Connecting via NFC
