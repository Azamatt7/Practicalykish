package peaksoft;

import peaksoft.inyterface.*;
import peaksoft.inyterface.Runnable;

public class Main {

    public static void main(String[] args) {

        Swimable dolphin = new Dolphin("Dolphin",(byte)4,300.0,"Black and White");
        System.out.println(dolphin);
        dolphin.swim();
        dolphin.breath();
        Animals dolphinn = new Dolphin();
        dolphinn.makeSound();
        dolphinn.sense();
        System.out.println();

        Animals eagle = new Eagle("Eagle",(byte)5,10.1,"Darkbrown");
        System.out.println(eagle);
        eagle.makeSound();
        eagle.sense();
        Flyable eagle1 = new Eagle();
        eagle1.eat();
        eagle1.fly();
        System.out.println();

        Animals cheetah = new Cheetah("Cheetah",(byte)1,21.1,"Yellowish");
        System.out.println(cheetah);
        cheetah.sense();
        cheetah.makeSound();
        Runnable cheetah1 = new Cheetah();
        cheetah1.run();
        cheetah1.stop();


        Animals[] animals={new Eagle(),new Dolphin(),new Cheetah()};
        Cheetah cheetah2 = new Cheetah();


        Animals[] Animals = new Animals[0];
        for (Animals Cheetah: Animals) {
           if  ( cheetah instanceof Cheetah );
            ((Runnable)Cheetah).run();
            cheetah.makeSound();

        }



    }
}
