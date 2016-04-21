import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application{
	public static void main(String[] args){
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception{
		Label label = new Label("Texto da label");
		Scene scene = new Scene(label, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Minha app javafx");
		primaryStage.show();
	}
}
