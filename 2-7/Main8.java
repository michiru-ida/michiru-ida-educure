import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("攻撃力を入力してください:");
        int atk=scanner.nextInt();

        System.out.println("防御力を入力してください:");
        int def=scanner.nextInt();
        int damage=atk-def;
        int criticaldamage=(int)(damage*1.5);
        System.out.println("通常ダメージ:"+damage);
        System.out.println("クリティカルダメージ:"+criticaldamage);
        scanner.close();
    }
}
