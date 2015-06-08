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
abstract public class Pet extends Animal{
    protected boolean isPlaying = false;
    public void play(){
        isPlaying = true;
    }
    public boolean isPlaying(){
        if(isPlaying) return true;
        return false;
    }
}
