package Arrayin2d;

import java.util.ArrayList;
import java.util.List;

public class ArrayListtwoD {
    public static void main(String[] args) {

        List<Integer> a=new ArrayList<>();
        a.add(10); a.add(20); a.add(40);
        List<Integer> b=new ArrayList<>();
        b.add(45);

        List<Integer> c=new ArrayList<>();
        List<Integer> d=new ArrayList<>();
        d.add(90);
        d.add(21);
        d.add(89);
        List<List<Integer>> l=new ArrayList<>();
        l.add(a); l.add(b); l.add(c); l.add(d);
        for(int i=0;i<l.size();i++)
        {
            for(int j=0;j<l.get(i).size();j++)
            {
                System.out.print(l.get(i).get(j)+" ");
            }
            System.out.println();
        }


    }
}
