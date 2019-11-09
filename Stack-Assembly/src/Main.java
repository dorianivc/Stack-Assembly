
import GUI.Controller;
import GUI.Model;
import GUI.View;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Monica
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola");
        Model model= new Model();
        View view = new View();
        Controller controller= new Controller(model,view);
        view.cargar();
        System.out.println("Hola");
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }
    
}
