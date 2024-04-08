package designPatterns.creational.factory;

import java.util.Arrays;

public class QuickAlgo implements Algo{
    @Override
    public void execute(Object obj) {
        int[] arr = (int[])obj;

        Arrays.sort(arr);

        for(int item: arr)
            System.out.print(item+" ");

        System.out.println();
    }
}
