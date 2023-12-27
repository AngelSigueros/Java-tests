package com.company.poo.encapsulacion;

public class Main {
    public static void main(String[] args) {

        Smartphone oneplus = new Smartphone();
        Smartphone apple =
                new Smartphone("Apple", "iphone", 40, 8);
        System.out.println(apple);

        // apple.ram = 200;

        System.out.println(apple.getRam()); // 8
        apple.setRam(14);
        System.out.println(apple.getRam()); // 14
        apple.setRam(200);
        System.out.println(apple.getRam()); // 14

        System.out.println(apple);

    }
}
