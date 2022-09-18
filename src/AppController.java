import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class AppController {

    @FXML
    private Label helloLabel;

    @FXML
    private AnchorPane pane;

    @FXML
    void showHelloWorld(ActionEvent event) {
        helloLabel.setText("Hello, World!");
    }

}
