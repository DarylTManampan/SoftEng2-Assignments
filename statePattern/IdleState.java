package statePattern;

public class IdleState implements VendingMachineState {
    
    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("You have selected an item.");
        vendingMachine.setState(new ItemSelectedState());
    }

    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Please select an item before inserting coin.");
    }

    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("No selected item to dispense. Please select an item.");
    }

    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Vending machine is set as Out of Order.");
        vendingMachine.setState(new OutofOrderState());
    }
}