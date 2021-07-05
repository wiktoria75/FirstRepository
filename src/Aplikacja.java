import  javafx.application.Application;
import  javafx.scene.Scene;
import  javafx.scene.layout.StackPane;
import  javafx.stage.Stage;
import  javafx.scene.control.Label;

public  class  Aplikacja  extends  Application {

    @Override
    public  void  start(Stage  primaryStage) {
        System.out.println("njnjkn");

//        StackPane  root = new  StackPane ();
        
        Label  label = new  Label("Hello  World");
        StackPane  root = new  StackPane ();
        root.getChildren ().add(label);
        Scene  scene = new  Scene(root , 250, 50);
        primaryStage.setTitle("Hello  World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public  static  void  main(String [] args) {
        launch(args);
    }

}

