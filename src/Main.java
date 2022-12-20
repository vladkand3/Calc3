import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] rimMas = new String[101];
        rimMas[1] = "I";
        rimMas[2] = "II";
        rimMas[3] = "III";
        rimMas[4] = "IV";
        rimMas[5] = "V";
        rimMas[6] = "VI";
        rimMas[7] = "VII";
        rimMas[8] = "VIII";
        rimMas[9] = "IX";
        rimMas[10] = "X";
        rimMas[11] = "XI";
        rimMas[12] = "XII";
        rimMas[13] = "XIII";
        rimMas[14] = "XIV";
        rimMas[15] = "XV";
        rimMas[16] = "XVI";
        rimMas[17] = "XVII";
        rimMas[18] = "XVIII";
        rimMas[19] = "XIX";
        rimMas[20] = "XX";
        rimMas[21] = "XXI";
        rimMas[22] = "XXII";
        rimMas[23] = "XXIII";
        rimMas[24] = "XXIV";
        rimMas[25] = "XXV";
        rimMas[26] = "XXVI";
        rimMas[27] = "XXVII";
        rimMas[28] = "XXVIII";
        rimMas[29] = "XXIX";
        rimMas[30] = "XXX";
        rimMas[31] = "XXXI";
        rimMas[32] = "XXXII";
        rimMas[33] = "XXXIII";
        rimMas[34] = "XXXIV";
        rimMas[35] = "XXXV";
        rimMas[36] = "XXXVI";
        rimMas[37] = "XXXVII";
        rimMas[38] = "XXXVIII";
        rimMas[39] = "XXXIX";
        rimMas[40] = "XL";
        rimMas[41] = "XXXI";
        rimMas[42] = "XXXII";
        rimMas[43] = "XXXIII";
        rimMas[44] = "XXXIV";
        rimMas[45] = "XXXV";
        rimMas[46] = "XXXVI";
        rimMas[47] = "XXXVII";
        rimMas[48] = "XXXVIII";
        rimMas[49] = "XXXIX";
        rimMas[50] = "L";
        rimMas[51] = "LI";
        rimMas[52] = "LII";
        rimMas[53] = "LIII";
        rimMas[54] = "LIV";
        rimMas[55] = "LV";
        rimMas[56] = "LVI";
        rimMas[57] = "LVII";
        rimMas[58] = "LVIII";
        rimMas[59] = "LIX";
        rimMas[60] = "LX";
        rimMas[61] = "LI";
        rimMas[62] = "LII";
        rimMas[63] = "LIII";
        rimMas[64] = "LIV";
        rimMas[65] = "LV";
        rimMas[66] = "LVI";
        rimMas[67] = "LVII";
        rimMas[68] = "LVIII";
        rimMas[69] = "LIX";
        rimMas[70] = "LXX";
        rimMas[71] = "LXXI";
        rimMas[72] = "LXXII";
        rimMas[73] = "LXXIII";
        rimMas[74] = "LXXIV";
        rimMas[75] = "LXXV";
        rimMas[76] = "LXXVI";
        rimMas[77] = "LXXVII";
        rimMas[78] = "LXXVIII";
        rimMas[79] = "LXXIX";
        rimMas[80] = "LXXX";
        rimMas[81] = "LXXXI";
        rimMas[82] = "LXXXII";
        rimMas[83] = "LXXXIII";
        rimMas[84] = "LXXXIV";
        rimMas[85] = "LXXXV";
        rimMas[86] = "LXXXVI";
        rimMas[87] = "LXXXVII";
        rimMas[88] = "LXXXVIII";
        rimMas[89] = "LXXXIX";
        rimMas[90] = "XC";
        rimMas[91] = "XCI";
        rimMas[92] = "XCII";
        rimMas[93] = "XCIII";
        rimMas[94] = "XCIV";
        rimMas[95] = "XCV";
        rimMas[96] = "XCVI";
        rimMas[97] = "XCVII";
        rimMas[98] = "XCVIII";
        rimMas[99] = "XCIX";
        rimMas[100] = "C";

        Scanner in = new Scanner(System.in);
        System.out.println("Input: ");
        String inString = in.nextLine();
        in.close();

        String[] words = inString.split(" ");

        if (words.length != 3){
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Синтаксис: два операнда разделенные оператором");}
        }

        if (words[1].equals("+") || words[1].equals("-") || words[1].equals("*") || words[1].equals("/")){}
        else {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Несуществующяя операция");
            }
        }

        boolean num1 = isNumeric(words[0]);
        boolean num2 = isNumeric(words[2]);

       if (num1 == true && num2 == true && (Integer.parseInt(words[0])>-1 && Integer.parseInt(words[0]) <11 && Integer.parseInt(words[2])>-1 && Integer.parseInt(words[2]) <11) ){
            goArab(words);
        } else if (num1 == false && num2 == false && findIndex(rimMas, words[0])>0 && findIndex(rimMas, words[2])>0 && findIndex(rimMas, words[0])<11 && findIndex(rimMas, words[2])>0 ){
            goRim(words,rimMas); }
        else {
           try {
               throw new IOException();
           } catch (IOException e) {
               System.out.println("Недопустимые операнды");
           }
            ;}
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void goArab(String[] words) {
        int i = Integer.parseInt(words[0]);
        int j = Integer.parseInt(words[2]);
        int res;
        System.out.println("Output: ");
        switch (words[1]) {
            case "*":
                res = i * j;
                System.out.println(res);
                break;
            case "/":
                res = i / j;
                System.out.println(res);
                break;
            case "+":
                res = i + j;
                System.out.println(res);
                break;
            case "-":
                res = i - j;
                System.out.println(res);
                break;
        }


    }

    public static void goRim( String[] words, String[] rimMas) {

        int i = findIndex(rimMas, words[0]);
        int j = findIndex(rimMas, words[2]);
        int res;
        System.out.println("Output: ");
        switch (words[1]) {
            case "*":
                res = i * j;
                System.out.println(rimMas[res]);
                break;
            case "/":
                res = i / j;
                System.out.println(rimMas[res]);
                break;
            case "+":
                res = i + j;
                System.out.println(rimMas[res]);
                break;
            case "-":
                res = i - j;
                if (res<1) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("Результат в римских цифрах меньше 1");
                    }
                }
                else
                {
                System.out.println(rimMas[res]);}
                break;
        }
    }

    public static int findIndex(String[] rimMas, String target) {
        for (int k = 1; k < rimMas.length; k++) {
            if ( target.equals(rimMas[k])) {
                 return k;
            }

        }
        return 0;
    }
}