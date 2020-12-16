import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Day3 {

    public static void main(String[] args) throws FileNotFoundException {

    }

    static void part1() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("/Users/sirinedridi/Downloads/day3input.txt"));
            String line = reader.readLine();
            int totalCount = 0;
            while(line != null) {

                line = reader.readLine();
            }
            System.out.println(totalCount);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
