
package Body;


public class MainClass {
    public static void main(String[] args) {
        int[] arraySorted5k = new int [5000];
        for(int i=0; i<arraySorted5k.length; i++) {
            arraySorted5k[i] = i;
        }
        
        int[] arraySorted50k = new int [50000];
        for(int i=0; i<arraySorted50k.length; i++) {
            arraySorted50k[i] = i;
        }
        
        int[] arraySorted500k = new int [500000];
        for(int i=0; i<arraySorted500k.length; i++) {
            arraySorted500k[i] = i;
        }
        
        int [] arrayUnSorted5k = new int[5000];
        for(int i=0; i<arrayUnSorted5k.length; i++) {
            arrayUnSorted5k[i] = (int) (Math.random()*100);
        }
        int [] arrayUnSorted50k = new int[50000];
        for(int i=0; i<arrayUnSorted50k.length; i++) {
            arrayUnSorted50k[i] = (int) (Math.random()*100);
        }
        int [] arrayUnSorted500k = new int[500000];
        for(int i=0; i<arrayUnSorted500k.length; i++) {
            arrayUnSorted500k[i] = (int) (Math.random()*100);
        }
        
        DataProcessor process = new DataProcessor(new BucketMethod(), new CountingMethod(), new Printer(), new RadixMethod());
        System.out.println("Впорядкований масив з " + arraySorted5k.length);
        process.arrayManager(arraySorted5k);
        System.out.println("Впорядкований масив з " + arraySorted50k.length);
        process.arrayManager(arraySorted50k);
        System.out.println("Впорядкований масив з " + arraySorted500k.length);
        process.arrayManager(arraySorted500k);
        
        System.out.println("Не впорядкований масив з " + arrayUnSorted5k.length);
        process.arrayManager(arrayUnSorted5k);
        System.out.println("Не впорядкований масив з " + arrayUnSorted50k.length);
        process.arrayManager(arrayUnSorted50k);
        System.out.println("Не впорядкований масив з " + arrayUnSorted500k.length);
        process.arrayManager(arrayUnSorted500k);

    }
}
