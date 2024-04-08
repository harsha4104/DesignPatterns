package designPatterns.behavioural.template;

/*

        In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods.
        Its subclasses can override the method implementation as per need but the invocation is to be in the same way as defined by an abstract class.
        This pattern comes under behavior pattern category.
 */
public class Executor {

    public static void main(String[] args){
        FootBall footBall = new FootBall();
        footBall.playGame();
        System.out.println();
        Cricket cricket = new Cricket();
        cricket.playGame();
    }

}
