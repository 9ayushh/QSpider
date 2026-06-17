public class TypeCastingDemo {
    public static void main(String[] args) {
        // Widening

        byte a = 78;

        // byte to short
        short b = a;
        System.out.println(b);
        
        // byte to int
        int aa = a;
        System.out.println(aa);

        // byte to long
        long aaa = a;
        System.out.println(aaa);

        // byte to float
        float aaaa = a;
        System.out.println(aaaa);

        // byte to double
        double aaaaa = a;
        System.out.println(aaaaa);

        // short to int
        short x = 155;

        // short to int
        int xx = x;
        System.out.println(xx);

        // short to long
        long xxx = x;
        System.out.println(xxx);

        // short to float
        float xxxx = x;
        System.out.println(xxxx);

        // short to double
        double xxxxx = x;
        System.out.println(xxxxx);
        
        int c = 45;
        // int into long
        long cc = c; // widening
        System.out.println(cc);
        
        // int to float
        float ccc = c;
        System.out.println(ccc);

        // int to double
        double cccc = c;
        System.out.println(cccc);

        long d = 457;
        // long to float
        float dd = d;
        System.out.println(dd);

        // long to double 
        double ddd = d;
        System.out.println(ddd);

        float e = 45.566f;
        // float to double
        double ee = e;
        System.out.println(ee);

        char p = 'A';
        // char to int 
        int pp = p;
        System.out.println(pp);

        // char to long
        long ppp = p;
        System.out.println(ppp);

        // char to float
        float pppp = p;
        System.out.println(pppp);

        // char to double 
        double ppppp = p;
        System.out.println(ppppp);
        

        // Narrowing--------------------
        // long to int
        long big = 45;
        int small = (int)big; 
        System.out.println(big);
        System.out.println(small);

        // short to byte
        short sh = 78;
        byte by = (byte) sh;
        System.out.println(sh);
        System.out.println(by);

        // double to char
        double db = 98.6;
        char ch = (char) db;
        System.out.println(db);
        System.out.println(ch);

    }
}
