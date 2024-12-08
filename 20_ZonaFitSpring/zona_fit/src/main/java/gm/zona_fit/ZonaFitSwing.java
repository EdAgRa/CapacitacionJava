package gm.zona_fit;


import com.formdev.flatlaf.FlatDarculaLaf;
import gm.zona_fit.gui.ZonaFitForma;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class ZonaFitSwing {
    public static void main(String[] args) {
        FlatDarculaLaf.setup();//Tema Oscuro
        ConfigurableApplicationContext contextSpring = //Instancia de la fabrica de Spring
                new SpringApplicationBuilder(ZonaFitSwing.class)//Inyecta el servicio a la clase
                        .headless(false)//Para decir que NO es web
                        .web(WebApplicationType.NONE)//Para decir que NO es web
                        .run(args);

        SwingUtilities.invokeLater(() -> { //Crea el Objto Swing
            ZonaFitForma zonaFitForma = contextSpring.getBean(ZonaFitForma.class);
            zonaFitForma.setVisible(true);
        });

    }
}
