package statePattern;

public class VendingMachine {

  private VendingMachineState state;
  private int inventory;
  
  public VendingMachine(int inventory) {
    this.inventory = inventory;
    this.state = new IdleState();
  }

  public void setState(VendingMachineState state) {
    this.state = state;
  }

  public void selectItem() {
    state.selectItem(this); 
  }

  public void insertCoin() {
    state.insertCoin(this);
  }

  public void dispenseItem() {
    state.dispenseItem(this);
    printInventory();
  }

  public void setOutOfOrder() {
    state.setOutOfOrder(this);
  }

  public int getInventory() {
    return inventory;
  }

  public void reduceInventory() {
    inventory--;
  }
  public void printInventory() {
    System.out.println("\nRemaining inventory: " + inventory );
  }

}