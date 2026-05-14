public class Main8 {
    public static void main(String[] args) {
        String ATK="30";
        String DEF="20";
        int atk=Integer.parseInt(ATK);
        int def=Integer.parseInt(DEF);
        int damage=atk-def;
        int criticaldamage=(int)(damage*1.5);
        System.out.println("攻撃力を入力してください:"+ATK);
        System.out.println("防御力を入力してください:"+DEF);
        System.out.println("通常ダメージ:"+damage);
        System.out.println("クリティカルダメージ:"+criticaldamage);

    }
}
