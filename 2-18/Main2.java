public class Main2 {
    public static void main(String[] args) {
        int score = 85;  

        showGrade(score);
    }
        public static void showGrade(int point){
        String testResult;
        if (point>=80) {
            testResult="優";
         } else if (point>=70) {
                testResult="良";
          } else if (point>=60) {
                    testResult="可";
          }else {
            testResult="不可";
          }
            System.out.println("成績:"+testResult);
        }
    }        