/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gittyone;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gunnar
 */
public class Gittyone {
    interface Predicate<String> {
        boolean test(String s);
    } 
    
    public final ArrayList<String> items= new ArrayList<String>();
    

    public Gittyone() {
        items.add("oink");
        items.add("burp");
        items.add("blah");
        items.add("crap");
        items.add("fahrt");
        items.add("sevenEleven");
    }
    
    public void printIf(List<String> items, Predicate<String> p) {
        for(String item: items)
            if ( p.test(item) )
                System.out.println(item);
    }
    
    public static void main(String[] args) {
        Gittyone lt= new Gittyone();
        lt.printIf(lt.items, p -> p.contains("a"));

    }    
}
