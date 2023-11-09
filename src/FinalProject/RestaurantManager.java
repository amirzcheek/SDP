package FinalProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestaurantManager {

    private List<Customer> customers;

    public RestaurantManager() {
        customers = new ArrayList<>();

        Customer customer = new Customer("Amirkhan", "877777777");
        Customer customer1 = new Customer("Ilya", "8777546543");
        Customer customer2 = new Customer("Alisher", "8756754654");
        Customer customer3 = new Customer("Abay", "876765767545");
        Customer customer4 = new Customer("Eldos", "877677657543");

        customers.add(customer);
        customers.add(customer1);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer2);

    }

    public void addCustomer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("Enter phone number");
        String number = scanner.next();
        Customer customer = new Customer(name, number);
        customers.add(customer);
    }

    public void findCustomer(int id){
        System.out.println(customers.get(id));
    }

    public void showCustomers(){
        customers.stream().forEach(System.out::println);
    }

    public void removeCustomer(int id){
        customers.remove(id);
    }

    public void makeAnOrder(){
        CousineFactory cousineFactory = new CousineFactory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello dear, are you ready to make an order? (yes/no)");
        String choice = scanner.next();
        if (choice.equals("yes")) {
            System.out.println("What cousine do you want to choose? \nKazakh \nItalian \nRussian");
            String temp = scanner.next();
            System.out.println("Excellent choice");
            Cousine cousine = cousineFactory.createDish(temp);

            cousine.makeFood();
            cousine.giveFood();
        }
        else return;
    }

    public void makePayment(){
        PaymentMethod paymentMethod = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How would you like to make a payment our extraordinary choices, that's how you like it \n1 -> Qiwi \n2 -> Steam");
        int temp = scanner.nextInt();

        switch (temp){
            case 1 -> paymentMethod = new QiwiAdapter(new QiwiPayment());
            case 2 -> paymentMethod = new SteamPaymentAdapter(new SteamPayment());
            default -> {
                System.out.println("Number provided not in the list");
                return;
            }
        }
        paymentMethod.payment();
    }




}
