package designPatterns.creational.factory;

public class Executor {

    public static void main(String[] args){

        int[] arr = new int[]{5,4,3,2,1};

        Algo algo = AlgoFactory.getAlgo(AlgoType.MERGE);
        algo.execute(arr);
        algo = AlgoFactory.getAlgo(AlgoType.QUICK);
        algo.execute(arr);

    }
}
