package statePattern;

public class ItemSelectedState implements VendingMachineState {

    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("You have already selected an item!");
    }

    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Coin inserted. Processing..");
        vendingMachine.setState(new DispensingState());
    }

    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Please insert coin.");
    }

    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Vending nachine is set as Out of Order");
        vendingMachine.setState(new OutofOrderState());
    }
}