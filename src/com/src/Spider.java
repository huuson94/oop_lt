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
public class Spider extends Animal implements Walk{
    
    private boolean isWalking =false;
    public Spider(){
        soChan = 8;
    }
    public Spider(boolean isWalking){
        this.isWalking = isWalking;
    }
    @Override
    public void walk() {
        isWalking  = true;
    }
    public boolean isWalking(){
        if(isWalking) return true;
        return false;
    }
    
}
