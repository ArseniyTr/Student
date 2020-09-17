package pract;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Pr6 {
    public static void selectionSort (Comparable[] list) {
        int j;
        Comparable temp;
        for (int index = 0; index < list.length ; index++) {
            j=index-1;
            temp=list[index];
            while (list[index].compareTo(temp)>0 && j>=0) {
                list[j + 1] = list[j];
                j -= 1;
            }
            list[j+1]=temp;
            }
        }
        public static void main(String[]args) {

            List<String> listA = new ArrayList<String>();
            listA.add("Avanesyan");
            listA.add("Petuhov");
            List<String> listB = new ArrayList<String>();
            listB.add("Bobrov");
            listB.add("Zolotov");

            List<String> listFinal = new ArrayList<String>();
            listFinal.addAll(listA);
            listFinal.addAll(listB);

            //same result
            //List<String> listFinal = new ArrayList<String>(listA);
            //listFinal.addAll(listB);
            Collections.sort(listFinal);
            System.out.println("listFinal : " + listFinal);

        }
}
