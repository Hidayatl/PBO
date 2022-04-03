package com.java;

public class Main {
    public static void main(String[] args) {
        restoran data = new restoran();

        data.setMenu("Ayam Goreng");
        data.setharga(17000.0);
        data.setSpesial(true);

        System.out.println("Menu Makanan: "+data.getMenu());
        System.out.println("Harga Makanan: Rp."+data.getHarga());
        System.out.println("Menu Spesial: "+data.getSpesial());
    }
}
