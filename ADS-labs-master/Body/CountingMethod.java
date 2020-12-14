package Body;
import java.util.Arrays;

public class CountingMethod {
    public  double sort(int arr[], int n )
    {
        double start = System.nanoTime();
        int[] arr1 = new int[n + 1];

            int x = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] > x)
                    x = arr[i];
            }
            int[] count_arr = new int[x + 1];

            for (int i = 0; i < x; ++i) {
                count_arr[i] = 0;
            }

            for (int i = 0; i < n; i++) {
                count_arr[arr[i]]++;
            }

            for (int i = 1; i <= x; i++) {
                count_arr[i] += count_arr[i - 1];
            }

            for (int i = n - 1; i >= 0; i--) {
                arr1[count_arr[arr[i]] - 1] = arr[i];
                count_arr[arr[i]]--;
            }

            for (int i = 0; i < n; i++) {
                arr[i] = arr1[i];
            }
        double finish = System.nanoTime();
        double result = (finish-start);
        return result;
        }
    }




