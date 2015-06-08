/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src;

import java.util.ArrayList;

/**
 *
 * @author hs
 */
public class House {
    private ArrayList<Animal> animals = new ArrayList();
    public int getTongSoChan(){
        int sum = 0;
        int i = 0;
        for(i= 0; i < animals.size(); i++ ){
            sum += animals.get(i).getSoChan();
        }
        return sum;
    }
    public void addAnimals(Animal a){
        if(getTongSoChan() + a.getSoChan() <= 120)
            animals.add(a);
        else{
            System.err.println("Vuot qua tong so chan");
        }
    }
    public void subAnimals(){
        
    }
    
    public int countPlayingPet(){
        int sum = 0;
        int i = 0;
        Pet p;
        for(i= 0; i < animals.size(); i++ ){
            if(animals.get(i) instanceof Pet){
                p = (Pet)animals.get(i);
                if(p.isPlaying()){
                    sum += 1;
                }
            }
        }
        return sum;
    }
    
    public int countWalkingSpider(){
        int sum = 0;
        int i = 0;
        Spider s;
        for(i= 0; i < animals.size(); i++ ){
            if(animals.get(i) instanceof Spider){
                s = (Spider)animals.get(i);
                if(s.isWalking()){
                    sum += 1;
                }
            }
        }
        return sum;
    }
}
