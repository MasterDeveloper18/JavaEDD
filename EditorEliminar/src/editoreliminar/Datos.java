package editoreliminar;

import java.awt.event.KeyEvent;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class Datos {

    public Datos() {
    }

Character c;
LinkedList<String> texto = new LinkedList<>();

public void capturarDatos(KeyEvent evt){
    
    c = evt.getKeyChar();
    
    if (c == KeyEvent.VK_SPACE) {
    texto.add(CuadroDialogo.AreaTexto.getText());
    }
    
}

public void eliminarDatos(){
    
    texto.removeLast();
    
}

public void imprimirDatos(){
    
    if(texto.size() > 0){
    CuadroDialogo.AreaTexto.setText(texto.getLast());
    }
    else{
    CuadroDialogo.AreaTexto.setText(" ");
    }

}

}
