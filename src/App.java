import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("App.fxml"));
        
        Scene scene = new Scene(root);
        String css = this.getClass().getResource("AppStyle.css").toExternalForm(); 
        scene.getStylesheets().add(css);
        stage.setTitle("Hello World!");
        stage.setScene(scene);
        stage.show();
        
    }
}
