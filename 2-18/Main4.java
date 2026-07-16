public class Main4 {
    public static void main(String[] args) {
        int[] prices={100,200,300};
        int[] quantities={1,2,3};

        int[] totals=totalPrice(prices,quantities);

        System.out.println("商品価格:["+toStr(prices)+"],数量:["+toStr(quantities)+"]");
        System.out.println("合計金額:["+toStr(totals)+"]");
    }
    public static int[] totalPrice(int[] prices,int[] quantities) {
        int[] totals=new int[prices.length];
        
        for(int i=0;i<prices.length;i++){
            int total=prices[i]*quantities[i];
            totals[i]=(int)(total*1.10);
        }
        return totals;

        }
        public static String toStr(int[] arr){
            String result="";
            for(int i=0;i<arr.length;i++){
                result+=arr[i];
                if (i<arr.length-1) {
                    result+=",";
                    
                }

            }
            return result;
        }
    }
        


