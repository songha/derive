/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciseoop;

/**
 *
 * @author kana
 */
public class ExerciseOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float a,b,e=(float) 0.00001,p,k=81;
        a=k;p=a*a;
      while(p-k>=e)
       {
        b=(a+(k/a))/2;
        a=b;
        p=a*a;
       }
      System.out.println("a="+a);
      System.out.println("hello world");
    }
    
}
