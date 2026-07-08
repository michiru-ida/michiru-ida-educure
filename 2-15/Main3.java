public class Main3 {
    public static void main(String[] args) {
        double[] temperatures={25.5,26.0,24.5,26.5,27.0,25.0,24.0};
        String[] today={"月曜日","火曜日","水曜日","木曜日","金曜日","土曜日","日曜日"};

        for(int i=0;i<temperatures.length;i++){ 

        System.out.println(today[i]+":"+temperatures[i]+"度");
    }
}
}
