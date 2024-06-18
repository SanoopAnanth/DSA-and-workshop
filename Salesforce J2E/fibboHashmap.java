import java.math.BigInteger;
import java.util.HashMap;

class FibboHashmap {
    private HashMap<Integer, BigInteger> map = new HashMap<>();
    public FibboHashmap() {
        map.put(0, BigInteger.ZERO);
        map.put(1, BigInteger.ONE);
    }

    public BigInteger fibo(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        }
        BigInteger result = fibo(n - 1).add(fibo(n - 2));
        map.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        FibboHashmap obj = new FibboHashmap();
        BigInteger result = obj.fibo(1000);
        System.out.println("fibo(1000) = " + result);
    }
}



// 354224848179261915075         354,224,848,179,261,915,075