package ref.ex;


import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("입력할 주문의 개수 ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[n];
        for (int i=0;i< orders.length;i++){
            System.out.println((i+1)+"번째 주문 정보를 입력");
            System.out.println("상품명");
            scanner.nextLine();
        }

       orders[0] = createOrder("두부",2000,2);
       orders[1] = createOrder("김치",5000,1);

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액"+totalAmount);
    }
    static ProductOrder createOrder(String productName, int price,int quantity){
        ProductOrder order=new ProductOrder();
        order.productName=productName;
        order.price=price;
        order.quantity=quantity;
        return order;
    }
    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) { // iter
            System.out.println(order.productName+"수량"+order.quantity+"가격"+order.price);
        }
    }
    static int getTotalAmount(ProductOrder[] orders){
        int totalAmount=0;
        for (ProductOrder order : orders) {
            totalAmount+=order.price*order.quantity;
        }
        return totalAmount;
    }
}