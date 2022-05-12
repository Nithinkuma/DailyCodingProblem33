/**Compute the running median of a sequence of numbers. That is, given a stream of numbers,
 * print out the median of the list so far on each new element.

 Recall that the median of an even-numbered list is the average of the two middle numbers.**/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String line = br.readLine();
        String[] strs = line.trim().split(" ");

        ArrayList<Integer> list = new ArrayList<>();
        for (String str : strs) {
            list.add(Integer.parseInt(str));
        }

        flowMedian(list);
    }

    private static void flowMedian(ArrayList<Integer> list) {
        ArrayList<Integer> orderedList = new ArrayList<>();
        for (Integer integer : list) {
            orderedList.add(integer);
            Collections.sort(orderedList);
            medianPrinter(orderedList);
        }
    }

    private static void medianPrinter(ArrayList<Integer> orderedList) {
        int size = orderedList.size();
        if(size%2==0){
            if((orderedList.get(size/2-1)+orderedList.get(size/2))%2==0)
                System.out.println((orderedList.get(size/2-1)+orderedList.get(size/2))/2);
            else
                System.out.println((float)(orderedList.get(size/2-1)+orderedList.get(size/2))/2);
        }
        else
            System.out.println(orderedList.get(size/2));
    }
}