import java.util.Arrays;

public class Director {
    private static boolean primes[];
    
    public Director() {
        if (primes == null) {
            primes = new boolean[50];
            Arrays.fill(primes, 0, 1, false);
            Arrays.fill(primes, 2, primes.length, true);
            primes[0] = false;
            for (int f = 2; f*f < primes.length; f++)
                if (primes[f])
                    for (int j = f; f*j < primes.length; j++)
                        primes[f*j] = false;
        }
    }

    public void createChain(ChainBuilder builder) {
        for (int n = primes.length - 1; n >= 2; n--)
            if (primes[n])
                builder.buildHandler(n);
    }
}
