//package ques2;
import java.util.*;
 class BinarySearch {


    public static void main(String[] args) {
        Scanner y=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=y.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array in sorted way(increasing order:)");
        for(int i=0;i<n;i++)
        {
            arr[i]=y.nextInt();
        }
        System.out.println("Enter the number to be searched:");
        int x=y.nextInt();
        
        //Arrays.sort(arr); //if the array is not sorted, uncomment this
        int index=bsearch(arr,n-1,0,x);
        if(index==-1)
            System.out.println("Searched number is not present in the array");
        else
            System.out.println("Searched number is present at position "+(index+1)+" in the array");
                
        
        
    }
    
    public static int bsearch(int arr[],int high, int low,int searchedNum)
    {
        while(high>=low)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==searchedNum)
                return mid;
            if(arr[mid]>searchedNum)
                high=mid-1;
            else
                low=mid+1;
            
        }
        return -1;
     }
    
    
}
      
