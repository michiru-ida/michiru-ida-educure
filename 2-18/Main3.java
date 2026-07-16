public class Main3 {
    public static void main(String[] args) {
        String input="Hello";
        greet();
    
        String reversed=new StringBuffer("Hello").reverse().toString();
        System.out.println(reversed);    
    }
    public static void greet(){
        System.out.println();
    }
}    