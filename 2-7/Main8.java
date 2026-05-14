public class Main8 {
    public static void main(String[] args) {
        int ATK;
        int DEF;

        ATK=50;
        DEF=20;
        int damage=ATK-DEF;
        int criticaldamage=(int)(damage*1.5);
        System.out.println("攻撃力を入力してください:"+ATK);
        System.out.println("防御力を入力してください:"+DEF);
        System.out.println("通常ダメージ:"+damage);
        System.out.println("クリティカルダメージ:"+criticaldamage);

    }
}
