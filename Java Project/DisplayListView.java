package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.Serializable;

public class DisplayListView implements Serializable {
    //public static final ObservableList names = FXCollections.observableArrayList();
    public static final ObservableList data = FXCollections.observableArrayList();
    DisplayListView(){
        Stage primaryStage=new Stage();



        VBox layout = new VBox();
        data.clear();
        final ListView listView = new ListView(data);
        for (Employee emp: Main.uc.employees ) {
            data.add("Name: "+emp.getName()+": "+"Id: "+emp.getId()+": "+"Designation: "+emp.getDesignation()+": "+"Salary: "+emp.getSalary());
        }

        //listView.setPrefSize(200, 250);
        listView.setEditable(true);
//        layout.setPadding(new Insets(10, 0, 0, 130));
//        layout.setSpacing(5);
        layout.getChildren().addAll(listView);
        Scene scene = new Scene(layout,500,300);
        listView.getStylesheets().add(getClass().getResource("Viper.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
