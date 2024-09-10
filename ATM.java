public class ATM {
    private int Balance;
    private int pin;

    public ATM(int Balance, int pin) {
        // this.balance refer to first variable private and second balance refer to int
        // balanace
        this.Balance = Balance;
        this.pin = pin;
    }

    public void displayAtm() {
        System.out.println("1 check balance");
        System.out.println("2 deposite");
        System.out.println("3 withdraw money");
        System.out.println("4 change pin");
        System.out.println("5 exit ATM");

    }

    public void deposite(int amount) {
        Balance += amount;

    }

    public void withdraw(int amount) {
        if (Balance < amount) {
            System.out.println("insufficent balance ");
            // void dont have return type if u want exist can use return it will exit
            return;

        }
        Balance -= amount;
    }

    public int getbalance() {
        return Balance;

    }

    public Boolean validate(int pin) {
        return this.pin == pin;
    }

    public void changepin(int newpin) {
        pin = newpin;
        System.out.println("Pin Changed");

    }

    public static void main(String[] args) {
        ATM atm = new ATM(1000, 1234);
        atm.displayAtm();
        System.out.print("enter the pin");
        int pin = Integer.parseInt(System.console().readLine());
        System.out.println("entered pin:" + pin);
        if (atm.validate(pin)) {
            int option = 0;
            // if not equal to 5 ,if equal should exit from while loop
            while (option != 5) {
                atm.displayAtm();
                option = Integer.parseInt(System.console().readLine());
                switch (option) {
                    case 1:
                        System.out.println("balance:" + atm.getbalance());
                        break;
                    case 2:
                        System.out.println("enter amount");
                        int amount = Integer.parseInt(System.console().readLine());
                        atm.deposite(amount);
                        break;
                    case 3:
                        System.out.println("enter amount");
                        amount = Integer.parseInt(System.console().readLine());
                        atm.withdraw(amount);
                        break;
                    case 4:
                        System.out.println("enter new pin");
                        int newpin = Integer.parseInt(System.console().readLine());
                        atm.changepin(newpin);
                        break;
                    case 5:
                        System.out.println("thank you for using ATM");
                        break;
                    default:
                        break;

                }
            }

        } else {
            System.out.println("you have entered invalid pin");
        }
    }
}