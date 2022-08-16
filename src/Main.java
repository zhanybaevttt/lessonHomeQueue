import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Car1,Car>hashMap=new HashMap<>();
        hashMap.put(new Car1(2019,"Teslo","Black"),new Car(12,777));
        hashMap.put(new Car1(2022,"BMW","white"),new Car(18,888));
        hashMap.put(new Car1(2020,"AMG","blue"),new Car(10,000));
        hashMap.put(new Car1(2002,"Toyota","Black"),new Car(14,800));
        for (Map.Entry d: hashMap.entrySet()) {
            System.out.println(d);

        }







    }
}