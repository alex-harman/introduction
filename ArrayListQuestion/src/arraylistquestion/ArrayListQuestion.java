/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistquestion;

/**
 *
 * @author Alexandra
 */
import java.util.*;
public class ArrayListQuestion {

    static ArrayList<Integer> trial = new ArrayList<>();
    
    public static void main(String[] args) {
        
        arrayMaker(10);
        oddsArray(trial);
        
    }
    
    public static void arrayMaker(int n) {
        for (int i = 1; i <= n; i++) {
            trial.add(i);
        }
    }
    
    public static void oddsArray(ArrayList<Integer> n) {
        for (int i = 0; i < n.size(); i++) {
            //System.out.println(n.size());
            if (trial.get(i) % 2 == 0) {
                n.remove(i);
            }
            System.out.println(n.size());
        }
    } 
}
