package com.company;

public class PrintService {

    public static void print(Gryffindor[] gryffindor) {
        for (int i = 0; i < gryffindor.length; i++) {
            Gryffindor magicians = gryffindor[i];
            System.out.println(magicians.getMagician()
                    + " Сила волшебства: " + magicians.getSorcery()
                    + " Дальность трансгрессии: " + magicians.getTransgress()
                    + " Благородство: " + magicians.getNobility()
                    + " Честь: " + magicians.getHonor()
                    + " Храбрость: " + magicians.getCourage());
        }
        System.out.println();
    }

    public static void print(Slytherin[] slytherin) {
        for (int i = 0; i < slytherin.length; i++) {
            Slytherin magicians = slytherin[i];
            System.out.println(magicians.getMagician()
                    + " Сила волшебства: " + magicians.getSorcery()
                    + " Дальность трансгрессии: " + magicians.getTransgress()
                    + " Хитрость: " + magicians.getCunning()
                    + " Решительность: " + magicians.getDetermination()
                    + " Амбициозность: " + magicians.getAmbition()
                    + " Находчивость: " + magicians.getResourcefulness()
                    + " Жажда власти: " + magicians.getLustForPower());
        }


        System.out.println();
    }

    public static void print(Hufflepuff[] hufflepuff) {
        for (int i = 0; i < hufflepuff.length; i++) {
            Hufflepuff magicians = hufflepuff[i];
            System.out.println(magicians.getMagician()
                    + " Сила волшебства: " + magicians.getSorcery()
                    + " Дальность трансгрессии: " + magicians.getTransgress()
                    + " Трудолюбие: " + magicians.getHardworking()
                    + " Верность: " + magicians.getLoyal()
                    + " Честность: " + magicians.getHonest());
        }
        System.out.println();
    }

    public static void print(Ravenclaw[] ravenclaw) {
        for (int i = 0; i < ravenclaw.length; i++) {
            Ravenclaw magicians = ravenclaw[i];
            System.out.println(magicians.getMagician()
                    + " Сила волшебства: " + magicians.getSorcery()
                    + " Дальность трансгрессии: " + magicians.getTransgress()
                    + " Ум: " + magicians.getSmart()
                    + " Мудрость: " + magicians.getWise()
                    + " Остроумие: " + magicians.getWitty()
                    + " Творчество: " + magicians.getFullOfCreativity());
        }
        System.out.println();
    }
}
