package Solution;

public interface Connectivity {
    public void connect();
}

// This is an abstraction on which high-level (Solution.Tester) and low-level (Solution.Bluetooth & Solution.NFC) modules will depend on.
// This abstraction does not depend on details like connectViaBluetooth() etc
// but has an abstract connect method() on which details depend.
