package JavaBasic;

import java.util.Random;


public class VerificationCode {
    public static void main(String[] args) {
        char[] chs =new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <=25) {
                chs[i]=(char)(97+i);

            }else { chs[i]=(char)(65+i-26);}

        }
//        for (int c = 0; c < chs.length; c++) {
//            System.out.print(chs[c]);
//
//        }
        Random r =new Random();
        String result ="";
        for (int i = 0; i <4 ; i++) {
            int randomIndex= r.nextInt(chs.length);
//            System.out.println(chs[randomIndex]);
            result=result+chs[randomIndex];
        }
        int number = r.nextInt(10);
        result=result+number;
        System.out.println(result);
    }
}
