package designPatterns.creational.factory;

public class AlgoFactory {

    public static Algo getAlgo(AlgoType algoType){
        if(algoType.equals(AlgoType.MERGE)){
            return new MergeAlgo();
        }
        else if(algoType.equals(AlgoType.QUICK)){
            return new QuickAlgo();
        }
        else{
            return null;
        }
    }
}
