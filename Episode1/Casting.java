public class Casting {
    public static void main(String[] args) {
        char c = 'z';
        System.out.println(c);
        int cI = (int) c;
        System.out.println(cI);

        int i = 250;
        System.out.println(i);
        long iL = i;
        System.out.println(iL);
        short iS = (short) i;
        System.out.println(iS);

        double d = 301.067;
        long dL = (long) d;
        System.out.println(dL);

        int i2 = 100;
        i2 += 5000.66;
        System.out.println((float) i2);

        int i3 = 737;
        i3 *= 100;
        System.out.println((byte) i3);

        double d2 = 298.638;
        d2 /= 25;
        System.out.println((long) d2);
    }
}
