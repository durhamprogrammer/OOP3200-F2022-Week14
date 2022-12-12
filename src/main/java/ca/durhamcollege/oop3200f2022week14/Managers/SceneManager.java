package ca.durhamcollege.oop3200f2022week14.Managers;

import ca.durhamcollege.oop3200f2022week14.Main;
import ca.durhamcollege.oop3200f2022week14.core.Line;
import ca.durhamcollege.oop3200f2022week14.core.Vector2;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* Singleton */
public class SceneManager
{
    /**************************** SINGLETON SECTION ********************************/
    // Step 1. Private static instance member variable
    private static SceneManager m_instance = null;
    // Step 2. make the default constructor private
    private SceneManager(){
        vector2List = new ArrayList<Vector2>();
    };
    // Step 3. create a public static entry point / instance method
    public static SceneManager Instance()
    {
        // Step 4. Check if the private instance member variable is null
        if(m_instance == null)
        {
            // Step 5. Instantiate a new SceneManager instance
            m_instance = new SceneManager();
        }
        return m_instance;
    }
    /*******************************************************************************/

    // static instance members
    public static List<Vector2> vector2List = null;
    public static Line line = null;


    public void changeScene(ActionEvent event, String FXMLFileName) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(FXMLFileName));
        Scene scene = new Scene(fxmlLoader.load());

        // derive the stage (window) from the action event (button press)
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void changeScene(ActionEvent event, String FXMLFileName, List<Vector2> vector2List) throws IOException
    {
        SceneManager.vector2List = vector2List;

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(FXMLFileName));
        Scene scene = new Scene(fxmlLoader.load());
        // derive the stage (window) from the action event (button press)
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void changeScene(ActionEvent event, String FXMLFileName, Line line) throws IOException
    {
        SceneManager.line = line;

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(FXMLFileName));
        Scene scene = new Scene(fxmlLoader.load());
        //scene.getStylesheets().add(getClass().getResource("app.css").toExternalForm());
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
