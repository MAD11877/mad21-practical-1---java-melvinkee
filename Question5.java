import java.io.*;
import java.lang.*;
import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    ArrayList<Integer> integerList = new ArrayList<Integer>();
    int mode = 0;
    int maxCount = 0;

    for (int i = number;
        i > 0;
        i--){
          int integer = in.nextInt();
          integerList.add(integer);
        }
    for (int i = 0;
        i < number;
        i++) {
          int value = integerList.get(i);
          int count = 0;
          for (int j = 0;
              j < number;
              j++) {
                if (integerList.get(i) == value) {
                  count++;
                }
                if (count > maxCount) {
                  mode = value;
                  maxCount = count;
                }
              }
        }
    System.out.println(integerList);
    System.out.println(mode);
  }
}
