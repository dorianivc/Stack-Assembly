/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;




import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Model extends Observable{
    public List<Integer> stack;
    public Integer ax=0;
    public Integer bx=0;
    public Integer cx=0;
    public Integer dx=0;
    public Integer stack_pointer=256;

   

    public Integer getAx() {
        return ax;
    }

    public void setAx(Integer ax) {
        this.ax = ax;
    }

    public Integer getBx() {
        return bx;
    }

    public void setBx(Integer bx) {
        this.bx = bx;
    }

    public Integer getCx() {
        return cx;
    }

    public void setCx(Integer cx) {
        this.cx = cx;
    }

    public Integer getDx() {
        return dx;
    }

    public void setDx(Integer dx) {
        this.dx = dx;
    }

    public Integer getStack_pointer() {
        return stack_pointer;
    }

    public void setStack_pointer(Integer stack_pointer) {
        this.stack_pointer = stack_pointer;
    }

    public List<Integer> getStack() {
        return stack;
    }

    public void setStack(Stack<Integer> stack) {
        this.stack = stack;
         this.setChanged();
        this.notifyObservers();
    }
    public Model() {
        this.stack= new Stack<>();

        //stack.add(100);
    }
    
 
    @Override
    public void addObserver(Observer o){
        super.addObserver(o);
        this.setChanged();
        this.notifyObservers();   
    }
    
}