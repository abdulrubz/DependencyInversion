package Violation;

public class Tester {
    public static void main(String[] args) {
        Bluetooth b = new Bluetooth();
        NFC n = new NFC();
        b.connectViaBluetooth();
        n.connectViaNFC();
    }
}

// Tester is a high-level module, but depends on Bluetooth & NFC (low-level modules), thus violating
// the first principle of DIP. It also implements the connectViaNFC() and connectViaBluetooth() which are
// details of the low-level modules, violating DIP.
