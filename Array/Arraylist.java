package Array;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(list+" "+list.size());
        list.add(60);
        System.out.println(list+" "+list.size());
        list.add(200);
        System.out.println(list+" "+list.size());
        list.add(634);
        System.out.println(list+" "+list.size());
        list.add(635);
        System.out.println(list+" "+list.size());
        list.add(160);
        System.out.println(list+" "+list.size());
        list.remove(1);
        System.out.println(list+" "+list.size());

    }
}
