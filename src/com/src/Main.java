/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src;

/**
 *
 * @author hs
 */
public class Main {
    public static void main(String[] args){
        House h = new House();
        h.addAnimals(new Human());
        h.addAnimals(new Cat());
        h.addAnimals(new Fish());
        h.addAnimals(new Spider());
        h.addAnimals(new Cat(true));
        h.addAnimals(new Spider(true));
        h.addAnimals(new Spider(false));
        System.out.println("Tong so chan la " + h.getTongSoChan());
        System.out.println("Tong so vat nuoi dang choi la " + h.countPlayingPet());
        System.out.println("Tong so nhen dang di la " + h.countWalkingSpider());
    }
}
