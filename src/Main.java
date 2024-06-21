import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer a[] = {1,3,4,5,6};
       ArrayList<Integer> listInteger = new ArrayList<>(Arrays.asList(a));
       listInteger.forEach(x -> {
           if (x % 2 == 0) {
               return;
           }
           System.out.println(x);
       });
        System.out.println("feature branch");




    }

}