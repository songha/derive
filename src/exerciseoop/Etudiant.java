/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciseoop;

/**
 *
 * @author kana
 */
public class Etudiant {
    private String id;
    private String name;
    private int age;
    
    public Etudiant(String id_, String name_, int age_){
        id=id_;
        name=name_;
        age=age_;
    }
    
    public String getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
}
