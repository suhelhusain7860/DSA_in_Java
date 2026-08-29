//package DSAinJAVA.arrays;
import java.util.*;
public class ArraysCC {
    /*public static int LinearSearch2(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            return i;
        }


 }
        
        
    

    
    return -1;
}
public static void main(String args[]){
    int numbers[] = {2,4,6,8,10,12,14,16};
    int key = 10;
    int index = LinearSearch2(numbers,key);
    if(index == -1){
        System.out.println("NOT found");
    }else{
        System.out.println("key is at index:" +index);
    }
}/* */
   // Largest Number in Array
  /*  public static int getLargest(int numbers[]){
    int Largest = Integer_MIN_VALUE;
    int largest = Integer_MIX_VALUE;
    for(int i=0; i<numbers.length;i++){
        if(Largest<numbers[i]){
            Largest = numbers[i];
        }

    }
    if(smallest>numbers[i]){
        smallest = numbers[i];
    }
    System.out.println("smallest value is:"+smallest);
    return Largest;
    public static void main(String[] args){
        int number[] = {1,2,4,3,5,6}
        System.out.println("largest value is "+largest);
    }

   }/* */
   ///Binary Search
/*public static int BinarySearch(int numbers[], int key){
int start = 0,end = numbers.length-1;
while(start<= end){
    int mid = (start+end)/2;
    //comparisons
    if(numbers[mid]==key){//found
        return mid;

    }
    if(numbers[mid]<key){//right
        start = mid+1;


    } else{
        end = mid-1;
    }
}
return-1;
}
public static void main(String[] args) {
    int numbers[] = {2,4,6,8,10,12,14};
    int key = 24;
    System.out.println("index for key is: "+BinarySearch(numbers,key));
}
}/* */
//Reverse an Array
/*public static void reverse(int number[]){
    int First =0, last = number.length-1;
    while(First <last){
        //swap
        int temp = numbers[last];
        numbers[last] = numbers[first];
        numbers[first] = temp;
        First++;
        last--;


    }
}
public static void main(String[] args) {
    int number[] = {2,4,6,8,10};
    reverse(numbers );
    //print
    for(int i=0; i<numbers.length; i++){
        System.out.print(numbers[i]+"");

    }
    System.out.println();
}
}/* */
//Pairs in an Array
/*public static void printPairs(int numbers[]){
    int tp =0;
    for(int i=0; i<numbers.length; i++){
        int curr = numbers[i];//2,4,6,8
        System.out.print("("+curr+" ,"+numbers[j]+")");
        tp++;
    }
    System.out.println();


}
System.out.println("total pairs="+tp);
public static void main(String[] args) {
    
}/* */
//print subarrays
/*public static void printsubarrays(int numbers[]){
int ts = 0;
for(int i=0; i<numbers.length; i++){
    int start = i;
    for(int j=i; j<numbers.length; j++){
        int end = j;
        for(int k=start; k<=end; k++){//print
           System.out.print(numbers[k]+" ");//subarrays


        }
        ts++;
        System.out.println();


    }
    System.out.println();


}
System.out.println("total subarrays = "+ts);


}
public static void main(String[] args) {
    int numbers[] = {2,4,6,8,10};
    printsubarrays(numbers);
}
}/* */

/*public static void maxSubarraysSum(int numbers[]){
    int currSum = 0;
    int maxSum =Integer.MIN_VALUE;
    for(int i=0; i<numbers.length; i++){
        int start=i;
        
        for(int j=i; j<numbers.length; j++){
            int end = j;
            currSum=0;
            for(int k=start; k<=end;k++){
                 //subarrays sum
            currSum += numbers[k];


            }
           

        
        System.out.println(currSum);
        if(maxSum<currSum){
            maxSum = currSum;

        }
    }
}
System.out.println("maxSum="+maxSum);
}
public static void main(String args[]){
    int numbers[] ={2,4,6,8,10};
    maxSubarraysSum(numbers);
}
}/* */


//max subarraysum (method 2)

/*public static void maxSubarraysSum(int numbers[]){
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int [numbers.length];
    prefix[0] = numbers[0];
    //calculate prefix array
    for(int i=1; i<prefix.length; i++){
        prefix[i] = prefix[i-1]+numbers[i];
    }
    for(int i=0; i<numbers.length;i++ ){
        int start = i;
        for(int j=i; j<numbers.length;j++){
            int end = j;
            currSum = start == 0 ? prefix[end]:prefix[end]-prefix[start-1];
            
            if(maxSum<currSum){
                maxSum = currSum;

            }
        }
    }
    System.out.println("max sum="+maxSum);

}
public static void main(String[] args) {
    int numbers[]= {1,-2,6,-1,3};
    maxSubarraysSum(numbers);
}
/* */

//Kadanes_Algorithm
/*public static void maxSubarraysSum(int numbers[]){
    int currSum = 0;
    int maxSum = Integer.MIN_VALUE;
    int prefix[] = new int [numbers.length];
    prefix[0] = numbers[0];
    //calculate prefix array
    for(int i=1; i<prefix.length; i++){
        prefix[i] = prefix[i-1]+numbers[i];
    }
    for(int i=0; i<numbers.length;i++ ){
        int start = i;
        for(int j=i; j<numbers.length;j++){
            int end = j;
            currSum = start == 0 ? prefix[end]:prefix[end]-prefix[start-1];
            
            if(maxSum<currSum){
                maxSum = currSum;

            }
        }
    }
    System.out.println("max sum="+maxSum);

}
public static void kadanes(int numbers[]){
    int ms  = Integer.MIN_VALUE;
    int cs = 0;
    for(int i=0; i<numbers.length;i++){
        cs = cs+numbers[i];
        if(cs<0){
            cs = 0;
        }
        ms = Math.max(cs,ms);
    }
    System.out.println("our max subarray sum is:"+ ms);
}
public static void main(String[] args) {
    int numbers[]= {-2, -3, 4, -1, -2, 1, 5, -3};
    kadanes(numbers);
}
}/* */

//TrappedRainwater
// public static int trappedRainwater(int height[]){
//     int n= height.length;
//     //calculate left max boundary-array
//     int leftMax[] = new int[n];
//     leftMax[0] = height[0];
//     for(int i=1; i<n; i++){
//         leftMax[i]=Math.max(height[i],leftMax[i-1]);
        


//     }
//     //calculate right max boundary- array
//     int rightMax[] = new int[n];
//     rightMax[n-1] = height[n-1];
//     for(int i=n-2; i>=0;i--){
//         rightMax[i] = Math.max(height[i],rightMax[i+1]);
            
//     }
//     int trappedWater = 0;
//     //loop
//     for(int i=0; i<n; i++){
//         //waterLevel = min(leftmaxbound,rightmax bound)
//         int waterLevel = Math.min(leftMax[i],rightMax[i]);
//     }
//     //trapped water = waterLevel-height[i]
//     trappedWater += waterLevel-height[i];

// }
// return trappedWater;
// }
// public static void main(String args[]){
//     int height = {4,2,0,6,3,2,5};
//     System.out.println(trappedRainwater(height));
// }
public static int buyAndSellStoks(int prices[]){
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit= 0;
    for(int i=0; i<prices.length;i++){
        if(buyPrice<prices[i]){//profit
            int profit = prices[i]-buyPrice;
            maxProfit = Math.max(maxProfit, profit);

        } else{
            buyPrice = prices[i];
        }
    }
    return maxProfit;

}
public static void main(String[] args) {
    int prices[] = {7,1,5,3,6,4};
    System.out.println(buyAndSellStoks(prices));
    
}
}

   



   


