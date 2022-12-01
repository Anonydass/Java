/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursions;

/**
 *
 * @author E
 */
public class looping {
    String name = "Esakkiappan";
    int num = 0;
    void dom(){
        System.out.println("I am " +name);
        System.out.println("WE ARE ANONYMOUS");
        num = num+1;
        if (num<25){
            dom();
        }
    }
    
}
