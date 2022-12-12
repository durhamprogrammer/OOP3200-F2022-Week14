package ca.durhamcollege.oop3200f2022week14;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import de.jensd.fx.glyphs.GlyphsDude;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("shape-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(getClass().getResource("app.css").toExternalForm());
        stage.setTitle("Shape Renderer");
        stage.setResizable(false);
        Image icon = new Image(getClass().getResourceAsStream("icon.png"));
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest((windowEvent -> {
            windowEvent.consume();
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Closing Application");
            alert.setContentText("Are you sure you want to close your application?");
            alert.show();

            alert.setOnCloseRequest((dialogEvent ->{
                ButtonType result= alert.getResult();
                if(result.getText().contentEquals("OK"))
                {
                    stage.close();
                }
            }));
        }));




    }

    public static void main(String[] args) {
        launch();
    }
}