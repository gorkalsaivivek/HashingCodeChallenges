package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class NonRepeatedElements {

    static long countNonRepeated(int arr[], int n)
    {
        TreeMap<Integer,Integer> hashMap=new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0)+1);
        }

        ArrayList<Integer> result=new ArrayList<>();

        for (Map.Entry<Integer, Integer> integerIntegerEntry : hashMap.entrySet()) {
            if(integerIntegerEntry.getValue()==1){
                result.add(integerIntegerEntry.getValue());
            }
        }

        return Long.valueOf(result.size());
    }
}


class NonRepeatedElementsStarter {
    public static void main(String[] args) {
        NonRepeatedElements nonRepeatedElements=new NonRepeatedElements();
        System.out.println(nonRepeatedElements.countNonRepeated(new int[]{1,1 ,2 ,2 ,3 ,3 ,4 ,5, 6, 7},10));
        System.out.println(nonRepeatedElements.countNonRepeated(new int[]{10,20,30,40,10},5));
    }
}