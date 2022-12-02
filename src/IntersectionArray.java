package src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class IntersectionArray {
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        HashSet<Integer>hset= new HashSet<>();
        for(int i=0;i<n;i++){
            hset.add(a[i]);
        }
        int count=0;
        for(int j=0;j<m;j++){
            if(hset.contains(b[j])){
                count++;
                hset.remove(b[j]);
            }
        }
        return count;
    }
}

class IntersectionArrayStarter {
    public static void main(String[] args) {
        IntersectionArray intersectionArray=new IntersectionArray();
        System.out.println(intersectionArray.NumberofElementsInIntersection(new int[]{89, 24, 75, 11, 23},new int[]{89, 2, 4},5,3));
        System.out.println(intersectionArray.NumberofElementsInIntersection(new int[]{1, 2, 3, 4, 5, 6},new int[]{3, 4, 5, 6, 7},6,5));

    }
}