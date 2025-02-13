class OutOfOrderState implements VendingMachineState {
    public void selectItem(VendingMachine machine) {
        System.out.println("Machine is out of order.");
    }
    public void insertCoin(VendingMachine machine, double amount) {
        System.out.println("Machine is out of order. Cannot accept coins.");
    }
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Machine is out of order. Cannot dispense items.");
    }
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is already out of order.");
    }
}