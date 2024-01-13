package class1.ex;


public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.productName="두부";
        order1.price=2000;
        order1.quantity=2;
        orders[0]=order1;
        ProductOrder order2 = new ProductOrder();
        order2.productName="치킨";
        order2.price=15000;
        order2.quantity=5;
        orders[1]=order1;

        int totalAmount=0;
        for(ProductOrder order:orders){
            System.out.println(order.productName+"수량"+order.quantity+"가격"+order.price);
            totalAmount+=order.price*order.quantity;
        }
        System.out.println("총 결제 금액"+totalAmount);
    }
}
