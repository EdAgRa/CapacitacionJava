import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Forma extends JFrame {
    private JPanel panelPrincipal;
    private JTextField campoTexto;
    private JLabel replicadorLebel;

    public Forma() {
        inicializarForma();
//        campoTexto.addActionListener(e -> {//Crea un objeto con la propiedad de seguir el evento cuando se da enter
//            replicarTexto();
//        });
        campoTexto.addKeyListener(new KeyAdapter() {//crea un nuevo objeto, pero ahora cada que escribimos una letra
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                replicarTexto();//se debe adicionar el llamado al metodo creado
            }
        });
    }

    private void inicializarForma() {
        setContentPane(panelPrincipal);//COnecta el panael principal en este caso de Forma.from
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cuado cierra la ventana finaliza la aplicación
        setSize(600, 400);//Dimensiones de la ventana en pixel
        setLocationRelativeTo(null);//Centra la ventana en la pantalla
    }

    private void replicarTexto() {
        this.replicadorLebel.setText(this.campoTexto.getText());//toma el valor agregado lo reemplaza en el label de replicado

    }

    public static void main(String[] args) {
//        FlatLightLaf.setup();//Una forma de poner tema claro la ventana o aplicación
        FlatDarculaLaf.setup();//Una forma de poner tema oscuro la ventana o aplicación
        Forma forma = new Forma();
        forma.setVisible(true);

    }
}
