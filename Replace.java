package Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Replace {
    ArrayList<String> bw = new ArrayList<String>();
    void list1() {

        bw.add("stupid");
        bw.add("idiot");
        bw.add("bastard");

    }

    public void replacewords() {
        Scanner sc = new Scanner(System.in);
        list1();
        System.out.println("Please Enter Any Word : ");
        String word = sc.nextLine();
        for(String word1 : bw) {

            word=word.replace(word1, "****");
        }
        System.out.println(word);
    }
    public static void main(String[]args) {


        Replace  rw = new Replace();
        rw.replacewords();
    }
}