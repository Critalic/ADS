package Body;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;


public class BucketMethod {
    public  double sort(int arr[], int bucketSize){
        double start = System.nanoTime();
        List<Integer>[] buckets = new List[bucketSize];
        for(int i = 0; i < bucketSize; i++){
            buckets[i] = new LinkedList<>();
        }
        for(int num : arr){
            buckets[hash(num, bucketSize)].add(num);
        }
        for(List<Integer> bucket : buckets){
            Collections.sort(bucket);
        }

        int index = 0;
        for(List<Integer> bucket : buckets){
            for(int num : bucket){
                arr[index++] = num;
            }
        }
        double finish = System.nanoTime();
        double result = (finish-start);
        return result;
    }

    public static int hash(int num, int bucketSize){
        return num/bucketSize;
    }
}