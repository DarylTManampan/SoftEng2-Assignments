package statePattern;

public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(2);
        
        System.out.println("------------------");
        vendingMachine.dispenseItem();

        vendingMachine.insertCoin();
        vendingMachine.selectItem();
        
        vendingMachine.insertCoin();
        vendingMachine.selectItem();
        vendingMachine.dispenseItem();
        
        System.out.println("------------------");
        vendingMachine.setOutOfOrder();
        vendingMachine.selectItem();
        vendingMachine.insertCoin();
        
        
    }
}