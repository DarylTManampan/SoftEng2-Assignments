package statePattern;

public class OutofOrderState implements VendingMachineState {
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Vending machine is currently out of order. Cannot select item.");
    }

    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Vending machine is currently out of order. Inserted coin not processed.");
    }

    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Vending machine is currently out of order. Dispensing not processed.");
    }

    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Vending machine is already Out of Order.");
    }
}