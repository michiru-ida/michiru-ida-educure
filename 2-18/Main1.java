public class Main1 {
    public static void main(String[]args){
        int price=1000;
        int quantity=3;

        int total=totalPrice(price, quantity);

        System.out.println("商品価格:"+price+"円,数量"+quantity);
        System.out.println("合計金額（税込み）"+total+"円");
    }
        public static int totalPrice(int price,int quantity){
            int total=price*quantity;
            total=(int)(total*1.10);
             return total;
    }
    
}
