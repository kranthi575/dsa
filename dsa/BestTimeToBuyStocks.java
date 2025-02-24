package dsa;

public class BestTimeToBuyStocks {

    public static void main(String[] args) {

        //initial array
        int[] prices={7,6,4,3,1};

        int[] maxArr=new int[prices.length];

        maxArr[prices.length-1] =prices[prices.length-1];

        for(int i=prices.length-2 ;i>=0;i--){

            if(prices[i]>maxArr[i+1]){
                maxArr[i]=prices[i];
            }else{
                maxArr[i]=maxArr[i+1];
            }
        }
        int maxVal=0;
        for(int i=0;i<prices.length-1;i++){
            maxArr[i]=maxArr[i]-prices[i];

            if(maxArr[i]>maxVal){
                maxVal=maxArr[i];
            }
        }

        System.out.println(maxVal);;
    }
}
