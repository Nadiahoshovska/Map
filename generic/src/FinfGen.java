import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 8/17/2017.
 */
public class FinfGen {

    public static  <T extends  Comparable<T>> T find(List<T> array, int begin, int end){
        T max = array.get(begin);

        for (int i = begin+1;i<=end;i++){
            if (max.compareTo(array.get(i)) < 0){
                max = array.get(i);
            }
        }
        return max;
    }
    public static void main(String args[]){

        List<String > ff = new ArrayList<>();
        ff.add("fff");
        ff.add("ffffffff");
        ff.add("ffffffff");
        ff.add("fffffff");
        ff.add("ffffffffffffffffffff");

       System.out.println( find(ff, 1,3));
    }
}
