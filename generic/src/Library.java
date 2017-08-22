import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 8/17/2017.
 */
public class Library <E extends Media>{
    private List<E>  resour = new ArrayList<E>();
    public void addMedia(E x){
        resour.add(x);
    }




}
