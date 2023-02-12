public class Main {
    public static void main(String[] args) {
        // Variables and simulated input
        double productCost = 69.99;
        double shippingCost = 0;
        // if productCost <= 100 then
        if(productCost <= 100) {
            shippingCost = (double) (productCost * .02);
            // output "Because your product costs: $" + productCost + ", the cost of shipping is: $" + shippingCost + "."
            System.out.println("Because your product costs: $" + productCost + ", the cost of shipping is: $" + shippingCost + ".");
        }
        // else
        else{
            // output "Because your product costs: $" + productCost + ", the shipping is free."
            System.out.println("Because your product costs: $" + productCost + ", the shipping is free.");
        }
    }
}