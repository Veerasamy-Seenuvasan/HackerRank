import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<0){
                list.add(arr[i]);
            }
        }
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    temp+=arr[k];
                }
                if(temp<0){
                    list.add(temp);
                    }
                    temp=0;
                }
          }
          System.out.println(list.size());
        }
}

