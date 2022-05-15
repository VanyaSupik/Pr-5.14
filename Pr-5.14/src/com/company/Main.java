
package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String k = scan.nextLine();
        String h = scan.nextLine();
        String o = scan.nextLine();
        String i = scan.nextLine();
        String rechennya = a.concat(" " + k).concat(" " + h).concat(" " + o).concat(" " + i);
        System.out.println(rechennya);


        String[] name = new String[]{a, k, h, o, i};
        for (int rahunoc = 0; rahunoc < name.length; rahunoc++) {
            System.out.println(name[rahunoc].substring(0, 1));
        }

        String q = scan.nextLine();
        String l = scan.nextLine();
        if (q.equalsIgnoreCase(l)) {
            System.out.println("однакові");
        } else {
            System.out.println("не однакові");
        }

        String firstLine = scan.nextLine();
        String secondLine = scan.nextLine();
        int score= firstLine.compareTo(secondLine);
        if(score>0){
            System.out.println(firstLine+" більше слово");
        }else {
            System.out.println(secondLine+" більше слово");
        }
    }
}
