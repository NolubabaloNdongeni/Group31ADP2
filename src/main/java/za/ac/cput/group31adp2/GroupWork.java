/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.group31adp2;

/**
 *
 * @author nndon
 */
public class GroupWork 
{

    static void main(String[] args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       public int square(int x)
       {
           return x*x;
       }
       public void countA(String word)
       {
           int count = 0;
           for(int i = 0; i < word.length(); i++)
           {
               if(word.charAt(i) =='a'|| word.charAt(i)=='A'){
                   count++;
               }
           }
       }
}
        


