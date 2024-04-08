package designPatterns.creational.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeAlgo implements Algo{

    @Override
    public void execute(Object obj) {
        int[] arr = (int[])obj;

        mergeSort(arr, 0, arr.length-1);

        for(int item: arr){
            System.out.print(item+" ");
        }

        System.out.println();

    }

    private void mergeSort(int[] arr, int low, int high){
        if(high > low){
            int mid = (low+high)/2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }

    private void merge(int[] arr, int low, int mid, int high){
        List<Integer> list = new ArrayList<>();

        int i=low;
        int j= mid+1;

        while(i <=mid || j<=high){
            int a = Integer.MAX_VALUE;
            int b = Integer.MAX_VALUE;
            if(i <= mid){
                a = arr[i];
            }

            if(j <= high){
                b = arr[j];
            }

            if(a < b){
                list.add(a);
                i++;
            }
            else{
                list.add(b);
                j++;
            }
        }
        j=0;
        for(i=low;i<=high;i++){
            arr[i] = list.get(j++);
        }
    }
}
