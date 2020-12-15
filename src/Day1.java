import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while(scan.hasNext()) {
            list.add(Integer.parseInt(scan.next()));
        }

        for(Integer num: list) {
            for(Integer num2: list) {
                for(Integer num3: list) {
                    if(num + num2 + num3 == 2020) {
                        System.out.println(num);
                        System.out.println(num2);
                        System.out.println(num3);
                        break;
                    }
                }

            }
        }
    }
}
