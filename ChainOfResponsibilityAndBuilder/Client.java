import java.util.List;

public class Client {
    public static void main(String args[]) {
        Director director = new Director();
        ChainBuilder counterBuilder = new CounterChainBuilder();
        ChainBuilder factorsBuilder = new FactorizationChainBuilder();
        
        director.createChain(factorsBuilder);
        List<Integer> fact42 = factorsBuilder.getHandler().handle(42);
        List<Integer> fact10 = factorsBuilder.getHandler().handle(10);
        System.out.println("Factors of 42 = " + fact42);
        System.out.println("Factors of 10 = " + fact10);
        
        director.createChain(counterBuilder);
        List<Integer> count42 = counterBuilder.getHandler().handle(42);
        List<Integer> count10 = counterBuilder.getHandler().handle(10);
        System.out.println("#(primes <= 42) = " + count42.get(0));
        System.out.println("#(primes <= 10) = " + count10.get(0));
    }
}
