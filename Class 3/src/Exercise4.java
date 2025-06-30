import java.util.Scanner;
import java.util.ArrayList;

class Product{
    private String name;
    private double price ;

    public Product(String name, double price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}


public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        ArrayList<Product> productList= new ArrayList<>();
        String productName;
        double productPrice=0;
        double somatoryPrice=0;

        System.out.println("Enter the name of products and your prices. Type 'stop', in the name place, to stop the recorders");
        do{
            productName=" ";
            System.out.print("Name:");
            productName= scanner.nextLine();
            if(!productName.equalsIgnoreCase("stop")) {
                System.out.print("Price:");
                productPrice = scanner.nextDouble();
                scanner.nextLine(); //It's used to fix a 'bug', that 'jump' the nextLine of the beggin of next iteration

                productList.add(new Product(productName,productPrice));
            }
        }while(!productName.equalsIgnoreCase("stop"));

        for(Product product: productList){
            somatoryPrice+=product.getPrice();
        }

        int mediumPrice=(int)somatoryPrice/productList.size();
        System.out.println("The medium price of products List is: "+ mediumPrice);

        scanner.close();
    }
}


