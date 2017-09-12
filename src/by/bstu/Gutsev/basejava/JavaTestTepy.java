package by.bstu.Gutsev.basejava;

import java.util.Random;

import static java.lang.Math.*;


/**
 * @author Oleg
 * @version 1.1
 */
public class JavaTestTepy {
    //TaskC
    /**
     * @value 123
     * @see 123
     */
    final int CONSTI = 123;
    public final int CONSTPI = 125;
    public static final int CONSTPSI = 126;
    static int sint;
    //

    /**
     * @param args params.
     * @throws ArrayIndexOutOfBoundsException mass
     */
    public static void main(String args[]) {
        TaskA();
        TaskB();
        TaskD();
        TaskE();
        TaskF();
        TaskG();
        TaskH();

    }

    private static void TaskA() {
        System.out.println("Hello");
    }

    private static void TaskB() {
        char ch = 'c';
        int i = 123323;
        short s = 12322;
        byte b = 1;
        long l = 1111111111L;
        boolean boolTrue = true;
        boolean boolFalse = false;
        String str = "12" + i;
        String str1 = "ab" + ch;
        String str2 = "12" + 1.2333;
        //byte bt = b + i; //type
        //int in = 1.234 + l; //type
        long lon = i + 2147483647;
        boolean blOne = boolTrue && boolFalse;
        boolean blTwo = boolTrue ^ boolFalse;
        //boolean blThree = boolFalse + boolTrue; //error
        long longNumber = 92233720368547758L;
        long longNumber2 = 0x7fff_ffff_fffL;
        char cha = 'a';
        char chb = '\u0061';
        char chc = 97;
        cha += chb + chc;
        double operation1 = 3.45 % 2.4;
        double operation2 = 1.0 / 0.0;
        double operation3 = 0.0 / 0.0;
        double operation4 = Math.log(-345);
        float operation5 = Float.intBitsToFloat(0x7F800000);
        float operation6 = Float.intBitsToFloat(0xFF800000);

        System.out.println(sint);
        System.out.println(cha);
    }

    private static void TaskD() {
        System.out.println(Math.round(Math.PI));
        System.out.println(Math.round(Math.E));
        System.out.println(Math.min(Math.E, Math.PI));
        System.out.println(Math.random());
    }

    private static void TaskE() {
        Double doubleObject = new Double(123.423);
        Integer integerObject = new Integer(123);
        Long longObject = new Long(123333333);
        Byte byteObject = new Byte((byte) 12);
        doubleObject += integerObject;
        longObject *= integerObject;
        System.out.println("Long: " + longObject.MIN_VALUE + " " + longObject.MAX_VALUE +
                " Double: " + doubleObject.MIN_VALUE + " " + doubleObject.MAX_VALUE);

        int boxingInt = integerObject;
        byte boxingByte = byteObject;
        Integer unboxingInt = 33333;
        Byte unboxingByte = 2;

        int parse = Integer.parseInt("123");
        String toHex = Integer.toHexString(parse);
        int compare = Integer.compare(parse, 125);
        String toString = Integer.toString(parse);
        int bitCount = Integer.bitCount(parse);
        boolean isNan = new Double(123.4).isNaN();
    }

    private static void TaskF() {
        String s = "1234";
        int aConstructor = new Integer(s);
        int bValueOf = Integer.valueOf(s);
        int cParse = Integer.parseInt(s);
        byte[] byteArray = s.getBytes();
        String str = new String(byteArray);
        String sTrue = "true";
        String sFalse = "false";
        Boolean b1 = Boolean.valueOf(sTrue);
        boolean b2 = Boolean.parseBoolean(sFalse);
        String a = "Oleg";
        String b = "Oleg";
        System.out.println(": " + a == b);
        System.out.println(" and " + a.equals(b));
        System.out.println(" and " + a.compareTo(b));
        b = null;
        System.out.println(": " + a == b);
        System.out.println(" and " + a.equals(b));
        //System.out.println(" and " + a.compareTo(b));

        for (String strt : a.split("le", 2)) {
            System.out.println(strt);
        }

        System.out.println(a.contains("eg") + "\n" +
                a.hashCode() + "\n" +
                a.indexOf("g") + "\n" +
                a.length() + "\n" +
                a.replace("g", "G") + "\n" +
                a);
    }

    private static void TaskH() {
        WrapperString wString = new WrapperString("str1") {
            public void replace(char oldchar, char newchar) {
                setString(getString().replace(oldchar, newchar));
            }

            public void delete(char newchar) {
                setString(getString().replace(newchar, '\0'));
            }

        };
        wString.replace('s', 'n');
        System.out.println(wString.getString());
        wString.delete('1');
        System.out.println(wString.getString());

    }

    private static void TaskG() {
        char[][] c1;
        char[] c2[];
        char c3[][];
        c1 = new char[3][];
        for (int i = 0; i < 3; i++) {
            c1[i] = new char[i + 1];
        }
        c2 = new char[][]{{'a', 'b'}, {'c', 'd'}};
        c3 = new char[][]{{'a', 'b'}, {'e', 'f'}};
        boolean comRez = c2 == c3;
        c2 = c3;
        System.out.println(comRez);
        for (char[] i : c2) {
            System.out.println(i);
        }
        //Exeption
        //for (int i = 0; i < c2.length + 1; i++) {
        //    for (int j = 0; j < c2[i].length + 1; j++) {
        //        System.out.print(c2[i][j] + "\t");
        //    }
        //}
    }
}

