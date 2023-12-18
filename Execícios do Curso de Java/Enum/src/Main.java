import entities.Client;
import entities.Order;
import entities.Product;
import enums.OrderStatus;
import service.OrderItem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        List<OrderItem> orderItems = new ArrayList<>();

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email =sc.nextLine();
        System.out.print("BirthDate: ");
        Date birthDate = s.parse(sc.next());
        Client client = new Client(name, email, birthDate);
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        System.out.println("How many items to this order ?");
        int qtdItems = sc.nextInt();
        for (int i = 1; i <= qtdItems; i++) {
            System.out.println("Enter a #" + i + " item data:");
            System.out.print("Name: ");
            sc.nextLine();
            String nameProduct = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int qtd = sc.nextInt();
            Product p = new Product(nameProduct, price);
            OrderItem orderItem = new OrderItem(qtd, price, p);
            orderItems.add(orderItem);
        }
        Order order = new Order(Instant.now(), status, client, orderItems);
        System.out.println(order);


    }
}

