package gm.tareas.persentacion;

import gm.tareas.TareasApplication;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class SistemasTareasFx extends Application {
    private ConfigurableApplicationContext applicationContext;

//    public static void main(String[] args) {
//        launch(args);
//    }

    @Override
    public void init() throws Exception {
        this.applicationContext = new SpringApplicationBuilder(TareasApplication.class).run();
    }

    @Override
    public void start(Stage stage) throws Exception {//Es la asociación de la scene con el stage
        FXMLLoader loader = new FXMLLoader(TareasApplication.class.getResource("/templates/index.fxml"));//Vincula el Archivo *.fxml
        loader.setControllerFactory(applicationContext::getBean);//vincula la fabrica de Spring
        Scene escena = new Scene(loader.load());
        stage.setScene(escena);
        stage.show();
    }
    public void stop(){
        applicationContext.close();//Cierra la Fabrica de Spring
        Platform.exit();//Sale de la aplicación
    }
}
