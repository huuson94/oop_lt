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
public class Cat extends Pet implements Walk{
    
    public Cat(){
        soChan = 4;
    }
    public Cat(boolean isPlaying){
        this.isPlaying = isPlaying;
    }
    
    @Override
    public void walk() {
    }
    
}
