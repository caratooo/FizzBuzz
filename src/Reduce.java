public class Reduce {
    public static void main(String[] args) {
        int num_steps = 0;
        int yuh = 100;
        while (yuh != 0) {
            if (yuh % 2 == 0) {
                yuh = yuh / 2;
            }
            else {
                yuh = yuh - 1;
            }
            num_steps++;
        }
        System.out.println(num_steps);
    }
}
