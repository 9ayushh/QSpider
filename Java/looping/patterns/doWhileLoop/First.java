public class First {
    public static void main(String[] args){
        // 1
        int i1 = 0;
        do {
            char j = 'A';
            do{
                System.out.print(j);
                j++;
            } while (j<'C');
            System.out.println();
            i1++;
        } while (i1 < 2);
        
        // 2.
        int i2 = 0;
        do {
            char j = 'A';
            do {
                System.out.print(j);
                j++;
            } while (j < 'E');
            System.out.println();
            i2++;
        } while (i2 < 2);


        // 3.
        char i3 = 'A';
        do {
            char j = i3;
            do {
                System.out.print(j);
                j++;
            } while (j < i3 + 4);
            System.out.println();
            i3 += 4;
        } while (i3 <= 'I');


        // 4.
        int i4 = 1;
        do {
            int j = i4;
            do {
                System.out.print(j);
                j++;
            } while (j < i4 + 5);
            System.out.println();
            i4 += 5;
        } while (i4 <= 6);


        // 5.
        int i5 = 1;
        do {
            int j = 1;
            do {
                System.out.print(i5);
                j++;
            } while (j <= 4);
            System.out.println();
            i5++;
        } while (i5 <= 3);


        // 6.
        int i6 = 1;
        do {
            int j = 1;
            do {
                System.out.print(j);
                j++;
            } while (j <= 2);
            System.out.println();
            i6++;
        } while (i6 <= 4);


        // 7.
        char i7 = 'C';
        do {
            int j = 1;
            do {
                System.out.print(i7);
                j++;
            } while (j <= 3);
            System.out.println();
            i7--;
        } while (i7 >= 'A');


        // 8.
        int i8 = 1;
        do {
            char j = 'D';
            do {
                System.out.print(j);
                j--;
            } while (j >= 'A');
            System.out.println();
            i8++;
        } while (i8 <= 3);


        // 9.
        char i9 = 'I';
        do {
            char j = i9;
            do {
                System.out.print(j);
                j--;
            } while (j > i9 - 3);
            System.out.println();
            i9 -= 3;
        } while (i9 >= 'A');


        // 10.
        int i10 = 1;
        do {
            int j = 8;
            do {
                System.out.print(j);
                j--;
            } while (j >= 5);
            System.out.println();
            i10++;
        } while (i10 <= 4);


        // 11.
        int i11 = 4;
        do {
            int j = 1;
            do {
                System.out.print(i11 + " ");
                j++;
            } while (j <= 3);
            System.out.println();
            i11--;
        } while (i11 >= 2);


        // 12.
        int i12 = 9;
        do {
            int j = i12;
            do {
                System.out.print(j + " ");
                j--;
            } while (j >= i12 - 2);
            System.out.println();
            i12 -= 3;
        } while (i12 >= 1);


        // 13.
        int i13 = 2;
        do {
            int j = i13;
            do {
                System.out.print(j + " ");
                j += 2;
            } while (j <= i13 + 4);
            System.out.println();
            i13 += 6;
        } while (i13 <= 24);


        // 14.
        int i14 = 3;
        do {
            int j = i14;
            do {
                System.out.print(j + " ");
                j *= 3;
            } while (j <= i14 * 3);
            System.out.println();
            i14 = i14 * i14 * i14;
        } while (i14 <= 81);


        // 15.
        int i15 = 5;
        do {
            int j = i15;
            do {
                System.out.print(j + " ");
                j *= 5;
            } while (j <= i15 * 5);
            System.out.println();
            i15 = i15 * i15 * i15;
        } while (i15 <= 625);


        // 16.
        int i16 = 1;
        do {
            int j = 1;
            do {
                System.out.print("*");
                j++;
            } while (j <= i16);
            System.out.println();
            i16++;
        } while (i16 <= 4);


        // 17.
        char i17 = 'A';
        do {
            char j = 'A';
            do {
                System.out.print(j);
                j++;
            } while (j <= i17);
            System.out.println();
            i17++;
        } while (i17 <= 'D');


        // 18.
        char i18 = 'A';
        do {
            char j = 'A';
            do {
                System.out.print(i18);
                j++;
            } while (j <= i18);
            System.out.println();
            i18++;
        } while (i18 <= 'D');


        // 19.
        int k19 = 0;
        char i19 = 'A';
        do {
            char j = i19;
            do {
                System.out.print(j);
                j++;
            } while (j <= i19 + k19);
            k19++;
            System.out.println();
            i19 += k19;
        } while (i19 <= 'G');


        // 20.
        int i20 = 1;
        do {
            int j = 1;
            do {
                System.out.print(1);
                j++;
            } while (j <= i20);
            System.out.println();
            i20++;
        } while (i20 <= 4);


        // 21.
        int i21 = 1;
        do {
            int j = 1;
            do {
                System.out.print(j);
                j++;
            } while (j <= i21);
            System.out.println();
            i21++;
        } while (i21 <= 4);


        // 22. Method 1
        int k22 = 0;
        int i22 = 1;
        do {
            int j = i22;
            do {
                System.out.print(j);
                j++;
            } while (j <= i22 + k22);
            k22++;
            System.out.println();
            i22 += k22;
        } while (i22 <= 10);


        // 22. Method 2
        int k = 1;
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.print(k++);
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i <= 4);


        // 23.
        int i23 = 1;
        do {
            int j = 1;
            do {
                System.out.print(i23);
                j++;
            } while (j <= i23);
            System.out.println();
            i23++;
        } while (i23 <= 4);


        // 24.
        int i24 = 1;
        do {
            int j = 1;
            do {
                System.out.print(i24 % 2);
                j++;
            } while (j <= 5);
            System.out.println();
            i24++;
        } while (i24 <= 4);


        // 25.
        int i25 = 1;
        do {
            int j = 1;
            do {
                System.out.print(j % 2);
                j++;
            } while (j <= 5);
            System.out.println();
            i25++;
        } while (i25 <= 3);
    }
}
