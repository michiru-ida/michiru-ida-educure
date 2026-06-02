public class Main5 {
    public static void main(String[] args) {
        double note=280*3;
        double pen=120*5;
        double eraser=100*2;
        
        int total=(int)(note+pen+eraser);
        int tax=(int)(total*0.1);
        int totalprice=total+tax;
        int change=2000-totalprice;
            
        System.out.println("小計:"+total+"円");
        System.out.println("消費税:"+tax+"円");
        System.out.println("合計金額:"+totalprice+"円");
        System.out.println("おつり:"+change+"円");
    }   
}
