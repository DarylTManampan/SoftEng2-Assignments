package statePattern;

public class DispensingState implements VendingMachineState {

    public void selectItem(VendingMachine vendingMachine) {
        System.out.println("Currently dispensing. Wait before you can select item again");
    }

    public void insertCoin(VendingMachine vendingMachine) {
        System.out.println("Currently dispensing. Wait before inserting coin again");
    }

    public void dispenseItem(VendingMachine vendingMachine) {
        vendingMachine.reduceInventory();
        System.out.println("Dispensing....Item Dispensed");
        vendingMachine.setState(new IdleState());
    }

    public void setOutOfOrder(VendingMachine vendingMachine) {
        System.out.println("Vending machine is set as Out of Order");
        vendingMachine.setState(new OutofOrderState());
    }
}