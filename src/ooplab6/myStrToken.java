package ooplab6;

import java.util.StringTokenizer;

public class myStrToken {
    public static void main (String[] args) {
//        StringTokenizer
        String msg = "Hello Welcome MT RMUTSV 2017";
        StringTokenizer mytoken = new StringTokenizer(msg);
        //counToken()
        System.out.println(mytoken.countTokens());
        while (mytoken.hasMoreTokens()){
            StringBuffer buffer = new StringBuffer (mytoken.nextToken());
            System.out.print(buffer.reverse()+" ");
        }//while
    }//main
}//class
