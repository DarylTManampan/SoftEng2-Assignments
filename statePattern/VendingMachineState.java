package statePattern;

public interface VendingMachineState {
    void selectItem(VendingMachine vendingMachine);
    void insertCoin(VendingMachine vendingMachine);
    void dispenseItem(VendingMachine vendingMachine);
    void setOutOfOrder(VendingMachine vendingMachine);
}