package Exercice1.presentation;

import Exercice1.metier.Talkative;

public class APP {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Talkative talkativeInstance = new Talkative(i);
            Thread threadInstance = new Thread(talkativeInstance);
            threadInstance.start();
        }
        /*
        Talkative t1=new Talkative(5);
        Thread th1=new Thread(t1);
        Talkative t2=new Talkative(5);
        Talkative t3=new Talkative(5);
        Talkative t4=new Talkative(5);
        Talkative t5=new Talkative(5);
        Talkative t6=new Talkative(5);
        Talkative t7=new Talkative(5);
        Talkative t8=new Talkative(5);
        Talkative t9=new Talkative(5);
        Talkative t10=new Talkative(5);
        Talkative t11=new Talkative(5); */

    }
}
