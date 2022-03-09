package powerpackage;

public class Math {
    public static int calculatePower(int base, int power) {
        int result = 1;
        for (int i = 0; i<power; i++) {
            result *= base;
        }
        return result;
    }
}
