/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler7;

/**
 *
 * @author Fernando Baladi
 */
public class ProjectEuler7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long num=0, num1=2;
        boolean bool=false;
        while(num!=10001){
            bool = false;
            for (long i = 2; i < num1; i++) {
                if (num1%i==0) {
                    i= num1;
                    bool = true;
                }
            }
            if(!bool){
                System.out.println(num1 +" es primo.");
                num++;
            }
            num1++;
        }
    }
    
}
