package main.ua.lviv.iot.lab1;



public class Main {

    public static void main(String[] args) {
        Vase vase1 = new Vase(10, 20, 2022, 100, "Porcelain", "Green");

        System.out.println(vase1.toString());
        System.out.println(vase1.getLastVaseName());

        Vase vase2 = new Vase();

        System.out.println(vase2.toString());
        System.out.println(vase2.getLastVaseName());

        Vase vase3 = new Vase("Black", "Iron", 2020);

        System.out.println(vase3.toString());
        System.out.println(vase3.getLastVaseName());
        vase1.mainColour();

    }

}
