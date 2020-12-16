import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Day16 {

    public static void main(String[] args) throws FileNotFoundException {
        part1();
    }






    static void part1() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("/Users/sirinedridi/Downloads/day16input.txt"));
            String line;
            int totalCount = 0;
            List<Range> ranges = new ArrayList<>();
            for(int i = 0; i < 20; i++) {
                line = reader.readLine();
                String[] bySpace = line.split(" ");
                String range1;
                String range2;
                if(bySpace.length == 5) {
                     range1 = bySpace[2];
                     range2 = bySpace[4];
                } else {
                    range1 = bySpace[1];
                    range2 = bySpace[3];
                }

                String[] range1Split = range1.split("-");
                String[] range2Split = range2.split("-");
                Range range_1 = new Range(Integer.parseInt(range1Split[0]), Integer.parseInt(range1Split[1]));
                Range range_2 = new Range(Integer.parseInt(range2Split[0]), Integer.parseInt(range2Split[1]));
                ranges.add(range_1);
                ranges.add(range_2);
            }

            for(int i = 0; i < 5; i++) {
                line = reader.readLine();
            }
            line = reader.readLine();
            while(line != null) {
                String[] numbers = line.split(",");
                for(String s: numbers) {
                    int num = Integer.parseInt(s);
                    boolean found = false;
                    for(int i = 0; i < ranges.size(); i+=2) {
                        Range r1 = ranges.get(i);
                        Range r2 = ranges.get(i+1);
                        if((num >= r1.min && num <= r1.max) || (num >= r2.min && num <= r2.max)) {
                            found = true;
                            break;
                        } else {
                            continue;
                        }
                    }
                    if(!found) totalCount += num;
                }
                line = reader.readLine();
            }
            System.out.println(totalCount);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}

class Range {
    public int min;
    public int max;
    public Range(int min, int max) {
        this.min = min;
        this.max = max;
    }
}
