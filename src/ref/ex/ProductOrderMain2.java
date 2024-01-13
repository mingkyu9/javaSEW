package ref.ex;


public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

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