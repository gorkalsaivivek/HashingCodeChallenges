package src;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class FirstRepeatingElement {
    public static int firstRepeated(int[] arr, int n) {
        LinkedHashMap<Integer,Integer> hashMap=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0)+1);
        }

        for(int i=0;i<arr.length;i++){
            if(hashMap.get(arr[i])>1){
                return i+1;
            }
        }
        return -1;
    }
}


class FirstRepeatingElementStarter {
    public static void main(String[] args) {
        FirstRepeatingElement firstRepeatingElement=new FirstRepeatingElement();
        System.out.println(firstRepeatingElement.firstRepeated(new int[]{1, 5, 3, 4, 3, 5, 6},7));
        System.out.println(firstRepeatingElement.firstRepeated(new int[]{1, 2, 3, 4},4));
    }
}