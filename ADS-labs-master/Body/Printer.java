
package Body;


public class Printer {
    public void print(double timeBucket, double timeCounting, double timeRadix) {
        System.out.print("Тривалість сортування через Bucket: ");
        System.out.println(timeBucket + " наносекунд, або " + (timeBucket/1000000.0) + " мілісекунд");
        
        
        System.out.print("Тривалість сортування через Counting: ");
        System.out.println(timeCounting + " наносекунд, або " + (timeCounting/1000000.0) + " мілісекунд");
        
        
        System.out.print("Тривалість сортування через Radix: ");
        System.out.println(timeRadix + " наносекунд, або " + (timeRadix/1000000.0) + " мілісекунд");
        System.out.println(" ");
    }
}
