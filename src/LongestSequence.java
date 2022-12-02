package src;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.util.*;

public class LongestSequence {

    static int findLongestConseqSubseq(int arr[], int N)
    {
        Arrays.sort(arr);
        int [] resultArray;
        int count=1;
        ArrayList<Integer> result=new ArrayList<>();
        LinkedHashSet<Integer> duplicates=new LinkedHashSet<>();

        for(int i=0;i<N;i++){
            duplicates.add(arr[i]);
        }
        resultArray=new int[duplicates.size()];
        int j=0;
        for(int num: duplicates) {
             resultArray[j]=num;
             j++;
        }

        for(int i=1;i< resultArray.length;i++){
            if(resultArray[i]-resultArray[i-1]==1 ){
                count++;
            }
            else {
                result.add(count);
                count=1;

            }

        }
        result.add(count);
        Collections.sort(result);



        return result.get(result.size()-1);
    }

}

class LongestSequenceStarter {
    public static void main(String[] args) {
        LongestSequence longestSequence=new LongestSequence();
        System.out.println(longestSequence.findLongestConseqSubseq(new int[]{6 ,6, 2, 3, 1, 4, 1, 5, 6, 2, 8, 7, 4, 2, 1, 3, 4, 5, 9, 6}, 20));
        System.out.println(longestSequence.findLongestConseqSubseq(new int[]{1,9,3,10,4,20,2}, 7));

    }
}
