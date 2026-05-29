import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int exp=scanner.nextInt();
        int bonus=(int)(exp+exp*0.25);
        System.out.println("現在の経験値を入力してください:"+exp);
        System.out.println("ボーナス後の経験値:"+bonus);
        scanner.close();
    }
}
