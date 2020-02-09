import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Employee");
        Scene myScene = new Scene(root, 300, 275);
        primaryStage.setScene(myScene);
        primaryStage.show();
    }
    public static void main(String[] args){ launch(args); }
}