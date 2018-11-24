package editoreliminar;

import java.awt.event.KeyEvent;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Grupo 3 version 1
 * @parametros
 * @comentarios: falta la funcion por medio de combinacion de teclas
 */
public class Datos {

    //Constructor
    public Datos() {

    }//Fin constructor

    //Creando atributo c de tipo Character
    Character c;
    //Creando LinkedList almacenadora del texto digitado
    LinkedList<String> texto = new LinkedList<>();

//Metodo que captura el texto digitado por palabras, y las almacena en la LinkedList
    public void capturarDatos(KeyEvent evt) {
        //Variable que captura cada caracter
        c = evt.getKeyChar();
        //Condicion que almacena el texto en la LinkedList separado por espacios
        if (c == KeyEvent.VK_SPACE) {
            texto.add(CuadroDialogo.AreaTexto.getText());
        }//Fin if

    }//Fin metodo capturarDatos

//Metodo que elimina el ultimo texto almacenado en la LinkedList
    public void eliminarDatos() {

        texto.removeLast();

    }//Fin metodo eliminarDatos

//Metodo que devuelve en el JTextField el contenido de la LinkedList siempre que esta no este vacia
    public void imprimirDatos() {

        if (texto.size() > 0) {
            CuadroDialogo.AreaTexto.setText(texto.getLast());
        }//Fin if 
        else {
            CuadroDialogo.AreaTexto.setText(" ");
        }//Fin else

    }//Fin metodo imprimirDatos

}//Fin class Datos
