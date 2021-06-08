/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

class Hero{
    String name;
    
    void display(){
        System.out.println("Nama : "+this.name);
        
    }
}
class HeroStrength extends Hero{
    
}

public class Inheritance {

    
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Saitama";
        hero1.display();
        
        HeroStrength hero2 = new HeroStrength();
        hero2.name = "Rimuru Tempest";
        hero2.display();
    }
} 
