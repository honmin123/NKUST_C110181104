import java.util.ArrayList;
import java.util.HashSet;
public class ex2_20211123 {
    public static void main(String[] args) {
        ArrayList<String> figure = new ArrayList<String>();
        HashSet<String> figure1 = new HashSet<String>();
        ArrayList<String> total = new ArrayList<String>();
        figure.add("0");
        figure.add("0");
        figure.add("1");
        figure.add("1");
        figure.add("1");
        figure.add("2");
        figure.add("2");
        figure.add("3");
        figure.add("3");
        figure.add("4");
        int d = figure.size();
        for (String  g :figure) {
            figure1.add(g);
        }
        int z = figure1.size() ;
        int e = d - z;
        for (String y :figure1) {
            total.add(y);
        }

        for (int g = 0; g < e;g++) {
            total.add("_");
        }
        System.out.println(total);
    }
}
