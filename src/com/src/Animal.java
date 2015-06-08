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
abstract public class Animal {
    protected int soChan;
    protected String name;
    public int getSoChan() {
        return soChan;
    }

    public void setSoChan(int soChan) {
        if(soChan < 0 || soChan > 8){
            System.err.println("Loi so chan");
            System.exit(0);
        }
        this.soChan = soChan;
    }
    
    
    public void eat(){
        
    }
    public void die(){
        
    }
    
}
