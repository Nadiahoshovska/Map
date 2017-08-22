/**
 * Created by user on 8/3/2017.
 */
public class Flower {
    // private String name;
    private int cost;
    private int length;
    private int old;
    private String name;
    private String form;

    public Flower(String name, int cost, int lengtn, int old) {
        this.name = name;
        this.cost = cost;
        this.length = lengtn;
        this.old = old;

    }

    public Flower(String name, int cost, int lengtn, int old, String form) {
        this.name = name;
        this.cost = cost;
        this.length = lengtn;
        this.old = old;
        this.form = form;
    }

    public Flower(String name, int cost, int old) {
        this.name = name;
        this.cost = cost;
        this.old = old;
    }

    public Flower(String name, int cost, int old, String form) {
        this.name = name;
        this.cost = cost;
        this.old = old;
    }

    public int getCost() {
        return cost;
    }

    public int getLength() {
        return length;
    }

    public int getOld() {
        return old;
    }


    public String getName() {
        return name;
    }

    public String getForm() {
        return form;
    }

}

