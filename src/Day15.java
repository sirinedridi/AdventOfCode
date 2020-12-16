import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day15 {

    public static void main(String[] args) throws FileNotFoundException {
        part1();
    }

    static void part1() {
        List list = new ArrayList<>();
//        list.add(1);
//        list.add(0);
//        list.add(18);
//        list.add(10);
//        list.add(19);
//        list.add(6);
        list.add(0);
        list.add(3);
        list.add(6);
        for(int i = 3; i <= 2020; i++) {
            int prev = (int) list.get(i - 1);
            int idx = -1;
            for(int j = i - 2; j>=0; j--) {
                if((int)list.get(j) == prev) {
                    idx = j;
                }
            }
            if(list.get(i - 1) == list.get(i-2)) {
                list.add(1);
            } else  if(idx == -1) {
                list.add(0);
            } else {
                list.add(i - 1 - idx);
            }
        }
        System.out.println(list.get(2019));
    }
}
