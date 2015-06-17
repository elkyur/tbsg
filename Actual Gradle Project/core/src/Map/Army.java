/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;

/**
 *
 * @author alexey
 */
import java.util.List;
import  java.util.ArrayList;
import Unit.UnitStack;
import Unit.Unit; 
public class Army {
    private UnitStack[] stacks;

    public Army(int size) {
        
        stacks=new UnitStack[size];
    }
    
    
    
    
    
    public UnitStack sendStack(int stack, ArrayList<Integer> places){
        if(stacks[stack]==null){
            System.out.println("This stack is null");
            return null;
        }
        if(places.size()==stacks[stack].returnCount()){
            return this.sendWholeStack(stack);
        }
        return stacks[stack].sendStack(places);
    }
    
    
    public UnitStack sendWholeStack(int stack){
        UnitStack returner=new UnitStack(stacks[stack]);
        stacks[stack]=null;
        return returner;
    }
    
    public boolean receiveStack(int stack, UnitStack incoming){
        if(stacks[stack]==null){
            stacks[stack]=incoming;
        }else
        if(incoming.equals(stacks[stack])){
          stacks[stack].receiveStack(incoming);
          return true;
        }
        return false;
    }
    
    public boolean splitStack(int from, int to, ArrayList<Integer> places){
        if(stacks[from].equals(stacks[to])||stacks[to]==null){
            return false;
        }
        this.receiveStack(to, this.sendStack(from, places));
        return true;
    }
    
    public void testHoutput(){
       int i=7;
       while(i>=0){
           if(stacks[i]==null){
               System.out.println("null");
           }else{
               stacks[i].testo();
           }
           System.out.println("*");
           i--;
       }
    }
}
