
public class Calculator {

    private Boolean isveg;
    private Boolean ispremium;

    public Calculator(Boolean isveg, Boolean ispremium) {
        this.ispremium = ispremium;
        this.isveg = isveg;
    }

    public double getCost() {
        double cost = 0;
        if (isveg) {
            cost += 250;
        } else {
            cost += 300;
        }
        if (ispremium) {
            cost += 100;
        }
        return cost;

    }

    public double addTopings(double cost, String toping) {
        if (toping.equals("cheese")) {
            cost += 20;
        } else if (toping.equals("chiken")) {
            cost += 50;
        } else if (toping.equals("onion")) {
            cost += 15;

        }
        return cost;

    }

    public double addTex(double cost) {
        return cost + cost * 0.05;

    }

    public double addDiscount(double cost, double discount) {
        return cost - cost * discount;

    }

    public static void main(String[] args) {
        System.out.println("welcome to my pizza shop");
        System.out.println("Select the pizza type");
        System.out.println("1.veg pizza");
        System.out.println("2. Non Veg pizza");
        System.out.println("enter the choice:");
        int choice = Integer.parseInt(System.console().readLine());
        boolean isveg = false;
        if (choice == 1) {
            isveg = true;
        }
        System.out.println("Do you want premium pizza?");
        System.out.println("1.yes");
        System.out.println("2. No");
        choice = Integer.parseInt(System.console().readLine());
        boolean ispremium = false;
        if (choice == 1) {
            ispremium = true;
        }
        Calculator cal = new Calculator(isveg, ispremium);
        double cost = cal.getCost();
        System.out.println("Do you want to add toppings?");
        System.out.println("1.Cheese");
        System.out.println("2.Chiken");
        System.out.println("3. Onion");
        System.out.println("4. No Toppings");
        System.out.println("enter the choice:");
        choice = Integer.parseInt(System.console().readLine());
        if (choice != 4) {
            String topping = "";
            if (choice == 1) {
                topping = "cheese";
            } else if (choice == 2) {
                topping = "Chiken";

            } else if (choice == 3) {
                topping = "Onion";

            }
            cost = cal.addTopings(cost, topping);

        }
        System.out.println("Do you have any discount coupon?");
        System.out.println("1.yes");
        System.out.println("2. No");
        System.out.println("enter the choice:");
        choice = Integer.parseInt(System.console().readLine());
        if (choice == 1) {
            System.out.println("Enter the discount coupn:");
            double discount = Double.parseDouble(System.console().readLine());
            cost = cal.addDiscount(cost, discount);

        }
        cost = cal.addTex(cost);
        System.out.println("Total cost:" + cost);

    }

}
