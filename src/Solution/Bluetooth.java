package Solution;

public class Bluetooth implements Connectivity {
    @Override
    public void connect() {
        connectViaBluetooth();
    }
    public void connectViaBluetooth() {
        System.out.println("Connecting via Bluetooth");
    }
}

// This a lower level module which depends on the Interface.