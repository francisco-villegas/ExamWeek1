package com.example.francisco.examweek1;

import java.util.Stack;

/**
 * Created by FRANCISCO on 07/08/2017.
 */

public class CodingTest {

    public static void main(String[] args) {
        System.out.println(PalindromeM("aba"));
        System.out.println(Armstrong(153));

        // instantiating Singleton class with variable x
        SingletonClass x = SingletonClass.getInstance();

        // instantiating Singleton class with variable y
        SingletonClass y = SingletonClass.getInstance();

        // changing variable of instance x
        x.s = (x.s).toUpperCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("\n");

        // changing variable of instance y
        y.s = (y.s).toLowerCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);

        //Stac
        Stack st = new Stack();

        // populating stack
        st.push("Java");
        st.push("Source");
        st.push("code");
        st.push("test");

        // removing top object
        while(st.size()>0)
            System.out.println("Removed object is: "+st.pop());
    }

    public static boolean PalindromeM(String palinndrome){
        for (int i=0;i<palinndrome.length()/2;i++){
            if(palinndrome.charAt(i)!=palinndrome.charAt(palinndrome.length()-1-i))
                return false;
        }
        return true;
    }

    public static boolean Armstrong(int number){
        String numberS = ""+number;

        int nt = 0;
        for(int i =0;i<numberS.length();i++)
            nt += Math.pow(Integer.parseInt(""+numberS.charAt(i)),3);

        return (nt==number);
    }
}
