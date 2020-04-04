package Solution;

public class NFC implements Connectivity {
    @Override
    public void connect() {
        connectViaNFC();
    }

    public void connectViaNFC() {
        System.out.println("Connecting via NFC");
    }
}

// This is a another lowe level module that depends on the Interface.
