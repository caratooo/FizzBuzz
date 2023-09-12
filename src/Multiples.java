public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int num_mults = 0;
        while (i < 1000) {
            if (i % 3 == 0 | i % 5 == 0) {
                num_mults++;
            }
            i++;
        }
        System.out.println(num_mults);
    }
}
