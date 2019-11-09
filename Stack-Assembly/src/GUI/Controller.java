/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;



import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Gabriel
 */
public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        view.setModel(model);
        view.setController(this);
    }
    
    public void show(){
        view.setVisible(true);
    }
    public void cargar(){
        this.view.cargar();
    }
    
    List<Integer> getStack() {
         List<Integer> list= new ArrayList<>();
         for(int i=model.stack.size()-1;i>=0;i--){
            list.add(model.stack.get(i));
         }
        return list;
    }

    
    
  
}
