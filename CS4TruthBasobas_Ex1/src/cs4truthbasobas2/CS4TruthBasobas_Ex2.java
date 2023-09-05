/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4truthbasobas2;

/**
 *
 * @author einstein
 */
public class CS4TruthBasobas_Ex2 {
    
    public class Sibling {
        String name;
        int age;
        String hobby;
        String snackPref;
        
        public Sibling(String n, int a, String h, String s) {
            name = n;
            age = a;
            hobby = h;
            snackPref = s;
    }
    }
    public class SibTester{
        public static void main(String[] args){
            Sibling yvette = new Sibling("Yvette", 19, "Reading", "Savory");
            Sibling sandy = new Sibling("Sandy", 15, "Binge-watching", "Sweet");
            Sibling julia = new Sibling("Julia", 12, "Gaming", "Savory");
        }
    }
}
