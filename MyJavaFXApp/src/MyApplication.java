
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyApplication extends Application {

	@Override
	public void start(Stage primaryStage) {
		BorderPane p = new BorderPane();
		Text t = new Text("Hello Karen");
		t.setFont(Font.font(90));
		//t.setEffect(new DropShadow(2,3,3,Color.RED));
		p.setCenter(t);
		primaryStage.setScene(new Scene(p));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
