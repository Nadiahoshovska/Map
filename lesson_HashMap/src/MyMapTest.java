//import static org.junit.AssertEquals;
//import org.junit.Before;
//import org.*;
public class MyMapTest {
   // @Before
    public void setUp() throws  Exception{

    }
//    public void testMapMap(){
//        MyMap<String,Integer> map = new MyMap<String,Integer>();
//        map.put("Lara",1);
//        map.put("Lara",2);
//        map.put("Lara",1);
//        assertEquals(map.get("Lars"),1);
//        for (int i = 0; i<100;i++){
//            map.put(String.valueOf(i),i);
//        }
//        assertEquals(map.size(),101);
//        assertEquals(map.get("51"),51);
//    }

public static void main(String args[]){
    MyMap<String,Integer> map = new MyMap<String,Integer>();
    map.put("Lara",1);
    map.put("Lara",2);
    map.put("Lara",1);
    map.remove("Lara");
    System.out.println(map);
}
}
