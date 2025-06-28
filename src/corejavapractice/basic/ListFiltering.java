package corejavapractice.basic;

import java.util.ArrayList;
import java.util.List;

public class ListFiltering {
    public static void main(String[] args) {
        int[] list = new int[]{1,2,3,4,5,6,7,8,9,10};
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<list.length;i++) {
            if(i%2==0) {
                res.add(i);
            }
        }
        System.out.println(res.toString());
    }
}
