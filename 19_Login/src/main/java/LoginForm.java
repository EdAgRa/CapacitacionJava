import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JPanel panelPrincipal;
    private JLabel Login;
    private JTextField usuarioTexto;
    private JPasswordField passwordTexto;
    private JButton enviarBoton;

    public LoginForm() {
        inicializadorForma();
        enviarBoton.addActionListener(e -> validar());

    }

    private void inicializadorForma() {
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
    }

    private void validar() {
        var usuario = this.usuarioTexto.getText();//Recupera la información de la caja de usuario
        var password = new String(this.passwordTexto.getPassword());//Recupera la información de la caja de password
        if("root".equals(usuario) && "admin".equals(password))
            mostarMensaje("Datos correctos, bienvenido");
        else if("root".equals(usuario))
            mostarMensaje("Passwords incorrecto, corregirlo");
        else
            mostarMensaje("Usuario Incorrecto, corregirlo ");
    }

    private void mostarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }
}
