package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortElementsByFrequency {

    static ArrayList<Integer> sortByFreq(int arr[], int n)
    {
        LinkedHashMap<Integer,Integer> result=new LinkedHashMap<>();
       for(int i=0;i<n;i++){
           result.put(arr[i],result.getOrDefault(arr[i],0)+1);
       }
        int max=0;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : result.entrySet()) {
            if(integerIntegerEntry.getValue()>max){
                max=integerIntegerEntry.getValue();
            }

        }

        for (Map.Entry<Integer, Integer> integerIntegerEntry : result.entrySet()) {
        if(integerIntegerEntry.getValue()==max){
            max=integerIntegerEntry.getValue();
        }

    }



    }
}

class SortElementsByFrequencyStarter {
    public static void main(String[] args) {
        SortElementsByFrequency
    }
}
