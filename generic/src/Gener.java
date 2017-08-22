import java.util.ArrayList;

/**
 * Created by user on 8/17/2017.
 */
public class Gener {

    public  <T> void change(T[] array, int i, int j){

        T elem = array[i];
        array[i] = array[j];
        array[j] = elem;
//        String element = array.get(i);
//        String element2 = array.get(j);
//        array.set(i,element2);
//        array.set(j, element);
//        for(String s: array) {
//            System.out.println();
//        }

    }


    public static void main(String args[]){



    }
}
