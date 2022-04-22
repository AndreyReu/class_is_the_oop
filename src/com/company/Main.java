package com.company;

import java.util.Arrays;

public class Main {

    public static void findBestMagicianG(Gryffindor magician, Gryffindor secondMagician) {
        for (int i = 0; i < magician.getNobility() + magician.getHonor() + magician.getCourage(); i++) {
            if (magician.getNobility() + magician.getHonor() + magician.getCourage()
                    > secondMagician.getNobility() + secondMagician.getHonor() + secondMagician.getCourage()) {
                System.out.println(magician.getMagician() + " лучший гриффиндорец, чем " + secondMagician.getMagician());
            } else {
                System.out.println(secondMagician.getMagician() + " лучший гриффиндорец, чем " + magician.getMagician());
            }
            break;
        }
    }

    public static void findBestMagicianS(Slytherin magician, Slytherin secondMagician) {
        for (int i = 0; i < magician.getLustForPower() + magician.getResourcefulness()
                + magician.getAmbition() + magician.getCunning() + magician.getDetermination(); i++) {
            if (magician.getLustForPower() + magician.getResourcefulness()
                    + secondMagician.getAmbition() + secondMagician.getCunning() + secondMagician.getDetermination()
                    > secondMagician.getLustForPower() + secondMagician.getResourcefulness()
                    + secondMagician.getAmbition() + secondMagician.getCunning() + secondMagician.getDetermination()) {
                System.out.println(magician.getMagician() + " лучший слизаринец, чем " + secondMagician.getMagician());
            } else {
                System.out.println(secondMagician.getMagician() + " лучший слизаринец, чем " + magician.getMagician());
            }
            break;
        }
    }

    public static void findBestMagicianR(Ravenclaw magician, Ravenclaw secondMagician) {
        for (int i = 0; i < magician.getFullOfCreativity() + magician.getWitty()
                + magician.getWise() + magician.getSmart(); i++) {
            if (magician.getFullOfCreativity() + magician.getWitty()
                    + magician.getWise() + magician.getSmart()
                    > secondMagician.getSmart() + secondMagician.getWise()
                    + secondMagician.getWitty() + secondMagician.getFullOfCreativity()) {
                System.out.println(magician.getMagician() + " лучший когтевранец, чем " + secondMagician.getMagician());
            } else {
                System.out.println(secondMagician.getMagician() + " лучший когтевранец, чем " + magician.getMagician());
            }
            break;
        }
    }

    public static void findBestMagicianH(Hufflepuff magician, Hufflepuff secondMagician) {
        for (int i = 0; i < magician.getHonest() + magician.getLoyal()
                + magician.getHardworking(); i++) {
            if (magician.getHonest() + magician.getLoyal()
                    + magician.getHardworking() > secondMagician.getHardworking() + secondMagician.getLoyal()
                    + secondMagician.getHonest()) {
                System.out.println(magician.getMagician() + " лучший пуффендуец, чем " + secondMagician.getMagician());
            } else {
                System.out.println(secondMagician.getMagician() + " лучший пуффендуец, чем " + magician.getMagician());
            }
            break;
        }
    }

    public static void findBestMagicianHog(Hogwarts magician, Hogwarts secondMagician) {
        for (int i = 0; i < magician.getTransgress() + magician.getSorcery(); i++) {
            if (magician.getTransgress() + magician.getSorcery()
                    > secondMagician.getTransgress() + secondMagician.getSorcery()) {
                System.out.println(magician.getMagician() + " лучший в Хогвартсе, чем " + secondMagician.getMagician());
            } else {
                System.out.println(secondMagician.getMagician() + " лучший в Хогвартсе, чем " + magician.getMagician());
            }
            break;
        }
    }

    public static void main(String[] args) {

        Hogwarts[] magicians = new Hogwarts[]{
                new Hogwarts("Гарри Поттер ", 75, 75),
                new Hogwarts("Гермиона Грейнджер ", 55, 90),
                new Hogwarts("Рон Уизли ", 35, 35),
                new Hogwarts("Драко Малфой ", 85, 40),
                new Hogwarts("Грэхэм Монтегю ", 25, 35),
                new Hogwarts("Грегори Гойл ", 25, 30),
                new Hogwarts("Захария Смит ", 15, 30),
                new Hogwarts("Седрик Диггори ", 35, 90),
                new Hogwarts("Джастин Финч-Флетчли ", 55, 65),
                new Hogwarts("Чжоу Чанг ", 45, 75),
                new Hogwarts("Падма Патил ", 55, 95),
                new Hogwarts("Маркус Белби ", 10, 15),
        };

        Gryffindor[] gryffindors = new Gryffindor[]{
                new Gryffindor("Гарри Поттер ", 75, 75, 25, 55, 65),
                new Gryffindor("Гермиона Грейнджер ", 55, 90, 20, 25, 35),
                new Gryffindor("Рон Уизли ", 35, 35, 35, 45, 65),
        };

        Slytherin[] slytherins = new Slytherin[]{
                new Slytherin("Драко Малфой ", 85, 40, 90, 85, 100, 55, 75),
                new Slytherin("Грэхэм Монтегю ", 25, 35, 55, 65, 45, 85, 85),
                new Slytherin("Грегори Гойл ", 25, 30, 25, 15, 85, 95, 85),
        };

        Hufflepuff[] hufflepuffs = new Hufflepuff[]{
                new Hufflepuff("Захария Смит ", 15, 30, 65, 85, 85),
                new Hufflepuff("Седрик Диггори ", 35, 90, 15, 45, 5),
                new Hufflepuff("Джастин Финч-Флетчли ", 55, 65, 45, 85, 75),
        };

        Ravenclaw[] ravenclaws = new Ravenclaw[]{
                new Ravenclaw("Чжоу Чанг ", 45, 75, 25, 45, 95, 85),
                new Ravenclaw("Падма Патил ", 55, 95, 25, 75, 85, 75),
                new Ravenclaw("Маркус Белби ", 10, 15, 15, 25, 5, 85),
        };


        PrintService.print(gryffindors);
        PrintService.print(slytherins);
        PrintService.print(hufflepuffs);
        PrintService.print(ravenclaws);
        findBestMagicianG(gryffindors[1], gryffindors[2]);
        findBestMagicianS(slytherins[1], slytherins[2]);
        findBestMagicianR(ravenclaws[0], ravenclaws[2]);
        findBestMagicianH(hufflepuffs[1], hufflepuffs[2]);
        findBestMagicianHog(magicians[0], magicians[9]);
    }
}
