
package Body;


public class DataProcessor {
    private BucketMethod bucket;
    private CountingMethod counting;
    private Printer printer;
    private RadixMethod radix;

    public DataProcessor(BucketMethod bucket, CountingMethod counting, Printer printer, RadixMethod radix) {
        this.bucket = bucket;
        this.counting = counting;
        this.printer = printer;
        this.radix = radix;
    }

    
    
    public void arrayManager (int[] array) {
        int [] array2 = new int[array.length];
        System.arraycopy(array, 0, array2, 0, (array.length-1));
        
        int[] array3 = new int[array.length];
        System.arraycopy(array, 0, array3, 0, (array.length-1));
        
        
        printer.print(bucket.sort(array), counting.sort(array2), radix.sort(array3));
    }
    
    
    

}
