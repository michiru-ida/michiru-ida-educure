import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("現在の経験値を入力してください:");
        int exp=scanner.nextInt();
        int bonus=(int)(exp+exp*0.25);
        System.out.println("ボーナス後の経験値:"+bonus);
        scanner.close();
    }
}
