/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;



import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author sergi
 */
public class stackTableModel extends AbstractTableModel {
    
    List<Integer> valores;   

    public stackTableModel(List<Integer> valores) {
        this.valores = valores;
    }

    public List<Integer> getValores() {
        return valores;
    }

    public void setValores(List<Integer> valores) {
        this.valores = valores;
    }

  
    
    @Override
    public int getRowCount() {
        return valores.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }
    
    @Override    
    public String getColumnName(int columnIndex){
        switch(columnIndex){
            case 0: return "Valor Decimal";
            case 1: return "Valor Hexadecimal";
            case 2: return "Valor Binario";
            default: return "";
        }        
    }
	public static Integer decimalbinario(Integer numero) {
  ArrayList<String> binario = new ArrayList<String>();
   int resto;
   String binarioString = "";

   do{
      resto = numero%2;
      numero = numero/2;
      binario.add(0, Integer.toString(resto));
   }while(numero > 2); //Haremos el bucle hasta que el cociente no se pueda dividir mas

   binario.add(0, Integer.toString(numero)); //Cogeremos el ultimo cociente

   //Cogemos cada uno de los elementos del ArrayList y los juntamos en un String
   for(int i = 0; i < binario.size(); i++){
       binarioString += binario.get(i);
   }
   return Integer.parseInt(binarioString);

	}
        
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         Integer  u =valores.get(rowIndex);
         String bin=Integer.toBinaryString(u);
         String cero="";
         if(u==0){
             for(int i=0;i<32;i++){
                 cero="0"+cero;
             }
             
             switch(columnIndex){
            case 0: return cero;
            case 1: return cero;
            case 2: return cero;
            default: return "";
             }}else
             {
        switch(columnIndex){
            case 0: return u.toString();
            case 1: return toUpperCase(Integer.toHexString(u));
            case 2: return bin.toString();
            default: return "";
        }
    }
    }
    
    @Override
    public Class<?> getColumnClass(int i){
        switch(i){
            default: return super.getColumnClass(i);
        }
    }
    
}
    