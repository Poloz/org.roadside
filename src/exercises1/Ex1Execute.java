/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercises1;

/**
 *
 * @author poloz@home
 */
public class Ex1Execute {
    public void Execute(){
        
        Ex1Test exercise1;
        exercise1 = new Ex1Test();
        exercise1.Execute();
        
        System.out.println("");
        
        Ex2HelloDate exercise2;
        exercise2 = new Ex2HelloDate();
        exercise2.Execute();
        
        System.out.println("");
        
        Ex3ATypeName a = new Ex3ATypeName();
        
        Ex4DataOnly data = new Ex4DataOnly();
        data.b = true;
        data.d = 100500;
        data.i = 2000;
        
        System.out.println("Exercise 5 starting in ...");        
        System.out.println(data.b);
        System.out.println(data.d);
        System.out.println(data.i);
        System.out.println("Ex 5 finished.");
        
        System.out.println("");
        
        System.out.println("Exercise 6 - rocket science!");
        Ex6Storage s = new Ex6Storage();        
        System.out.println(s.storage("This string consists of chars."));
        System.out.println("Ex 6 RIP.");
        
        System.out.println("");  
        
        System.out.println("Exercise 7 - test of static fields");
        System.out.println(Ex7StaticTest.i);
        Ex7Incrementable.increment();
        System.out.println(Ex7StaticTest.i);
        Ex7Incrementable.increment();
        System.out.println(Ex7StaticTest.i);
        Ex7Incrementable.increment();
        System.out.println(Ex7StaticTest.i);
        System.out.println("End of Ex7."); 
        
        System.out.println("");  
        
        System.out.println("Exercise 8.");
        Ex7StaticTest e71 = new Ex7StaticTest();
        Ex7StaticTest e72 = new Ex7StaticTest();
        Ex7StaticTest e73 = new Ex7StaticTest();
        Ex7StaticTest e74 = new Ex7StaticTest();
        Ex7StaticTest e75 = new Ex7StaticTest();
        System.out.println(e71.i + "; " + 
                           e72.i + "; " + 
                           e73.i + "; " + 
                           e74.i + "; " + 
                           e75.i); 
        Ex7Incrementable.increment();
        System.out.println(e71.i + "; " + 
                           e72.i + "; " + 
                           e73.i + "; " + 
                           e74.i + "; " + 
                           e75.i); 
        Ex7Incrementable.increment();
        System.out.println(e71.i + "; " + 
                           e72.i + "; " + 
                           e73.i + "; " + 
                           e74.i + "; " + 
                           e75.i); 
        System.out.println("Exercise 8. Dismissed.");
        
        System.out.println(""); 
        
        return;
        
    }
    
}
