import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    ArrayList<String> arr1 = new ArrayList<>();
    arr1.add("a");
    arr1.add("b");
    arr1.add("c");
    arr1.add("d");

    shiftLeft(arr1);

    ArrayList<Integer> arr2 = new ArrayList<>();
    arr2.add(2);
    arr2.add(3);
    arr2.add(2);
    arr2.add(5);
    printStatistics(arr2);

  }

  public static void shiftLeft(ArrayList<String> arr)
  {
    arr.add(arr.get(0));
    arr.remove(0);

    for (String n : arr){
      System.out.print(n + " ");
    }
  }

  public static void printStatistics(final ArrayList<Integer> arr)
  {
    Integer sum = 0;
    for (Integer num : arr){
      sum += num;
    }
    System.out.println("Sum: " + sum);

    double avg = (double) sum / arr.size();
    System.out.println("Avg: " + avg);

    Integer mode = arr.get(0);
    int highestCount = 0;
    boolean uniqueMode = false;
    for (int i = 0; i < arr.size()-1; i++){
      int count = 1;
      for (int j = i; j < arr.size(); j++){
        if (arr.get(j)==arr.get(i)){
          count++;
        }
      }
      if (count > highestCount){
        mode = arr.get(i);
        highestCount = count;
        uniqueMode = true;
      } else if (count == highestCount) {
        uniqueMode = false;
      }
    }
    
    if (uniqueMode == true){
      System.out.println("Mode: " + mode);
    } else {
      System.out.println("Mode: N/A");
    }
  }
}
