package org.eirture.javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Created on 2017/11/20.
 *
 * @author Jie Liu
 */
public class App extends Application {

    public void start(Stage primaryStage) throws Exception {

        Label lbMessage = new Label("Hello World!");
        HBox container = new HBox(lbMessage);
        container.setAlignment(Pos.CENTER);
        primaryStage.setScene(new Scene(container));
        primaryStage.setWidth(300);
        primaryStage.setHeight(240);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
