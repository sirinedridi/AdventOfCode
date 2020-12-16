import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Day2 {

    public static void main(String[] args) throws FileNotFoundException {
        part2();
    }

    static void part1() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("/Users/sirinedridi/Downloads/day3input.txt"));
            String line = reader.readLine();
            int totalCount = 0;
            while(line != null) {
                String[] bySpace = line.split(" ");
                String[] minAndMax = bySpace[0].split("-");

                int min = Integer.parseInt(minAndMax[0]);
                int max = Integer.parseInt(minAndMax[1]);
                char letter = bySpace[1].charAt(0);
                String password = bySpace[2];
                int count = 0;
                for(int i = 0; i < password.length(); i++) {
                    if(password.charAt(i) == letter) {
                        count++;
                    }
                }
                if(count >= min && count <= max) {
                    totalCount++;
                }
                line = reader.readLine();
            }
            System.out.println(totalCount);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    static void part2() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("/Users/sirinedridi/Downloads/day2input.txt"));
            String line = reader.readLine();
            int totalCount = 0;
            while(line != null) {
                String[] bySpace = line.split(" ");
                String[] minAndMax = bySpace[0].split("-");

                int min = Integer.parseInt(minAndMax[0]);
                int max = Integer.parseInt(minAndMax[1]);
                char letter = bySpace[1].charAt(0);
                String password = bySpace[2];
                if(password.charAt(min - 1) ==  letter) {
                    if(password.charAt(max - 1) != letter){
                        totalCount++;
                    }
                } else if(password.charAt(max - 1) == letter) {
                    totalCount++;
                }
                line = reader.readLine();
            }
            System.out.println(totalCount);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
