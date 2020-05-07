
import java.util.HashMap;
import java.util.Map;

public class Hash{
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Mysuru");
        map.put(2, "Banglore");
        map.put(3,"Coorg");
        map.put(4, "Manglore");
        
        for( Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
