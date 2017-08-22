import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 8/3/2017.
 */
public class Buket {
//    private ArrayList<Flower>  bouquet;

    private List<Flower> flowers = new ArrayList<Flower>();

    public Buket addFlower(Flower flower) {
        flowers.add(flower);
        return flowers;
    }


//
//    public ArrayList<Flower> getBouquet() {
//        return bouquet;
//    }
//
//    public int oldBuket(){
//        int old =0;
//        for(int i = 1; i<bouquet.size();i++){
//            old = old + bouquet.get(i).getOld();
//        }
//        return old/bouquet.size();
//    }
//    public  int size(){
//        return bouquet.size();
//    }
//}
}