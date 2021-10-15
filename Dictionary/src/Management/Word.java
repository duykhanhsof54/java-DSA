/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Management;

import java.io.Serializable;

/**
 *
 * @author Dell
 */
public class Word implements Serializable{
    private String Word_target ;
    private String Word_explane ;
    
     public Word(String word_target,String word_explane){
         this.Word_explane = word_explane;
         this.Word_target = word_target;
     }


    public String getWord_target() {
        return Word_target;
    }

    public void setWord_target(String Word_target) {
        this.Word_target = Word_target;
    }

    public String getWord_explane() {
        return Word_explane;
    }

    public void setWord_explane(String Word_explane) {
        this.Word_explane = Word_explane;
    }
    
    
}

    
    
