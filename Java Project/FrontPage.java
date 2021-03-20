package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;
import java.io.*;

import static sample.Main.uc;

public class FrontPage implements Serializable {

    FrontPage(){
        Stage primaryStage=new Stage();
        TextField tfEmail=new TextField();
        TextField tfPas=new TextField();
        Label label = new Label("Enter Your Mail");
        Label label1 = new Label("Enter Your Password");
        Button sign_in=new Button("sign in");

        VBox layout = new VBox();
        tfEmail.setMaxWidth(160);
        tfPas.setMaxWidth(160);
        tfEmail.setAlignment(Pos.CENTER);
        tfPas.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(40, 0, 0, 130));
        sign_in.setPrefSize(80,20);
        layout.setSpacing(5);
        layout.getChildren().addAll(label,tfEmail,label1,tfPas,sign_in);
        Scene secondScene = new Scene(layout, 500, 250);
        secondScene.getStylesheets().add(getClass().getResource("Viper.css").toExternalForm());
        Stage newWindowEmp = new Stage();
        newWindowEmp.setTitle("Welcome To Employee Project");
        newWindowEmp.setScene(secondScene);
        newWindowEmp.setX(primaryStage.getX()+350);
        newWindowEmp.setY(primaryStage.getY() +0);

        newWindowEmp.show();
        sign_in.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage primaryStage=new Stage();
                Button AddEmp;
                Button SEmployeeSalary;
                Button IncreaseSal;
                Button SEmployeeDis;
                Button AllEmployeeDis;
                Button Exit;
                AddEmp = new Button("Add Employee");
                SEmployeeSalary = new Button("Specific Employee Salary");
                IncreaseSal = new Button("Increase Salary");
                SEmployeeDis = new Button("Specific Employee Information");
                AllEmployeeDis = new Button("All Employee Information");
                Exit = new Button("Exit");
                AddEmp.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        new AddEmployee();
                    }
                });
                SEmployeeSalary.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        new SpecificEmployeeSalary();
                    }
                });
                IncreaseSal.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        new AddIncreaseSalary();
                    }
                });
                SEmployeeDis.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        new AddSpecificEmployeeDis();

                    }
                });
                AllEmployeeDis.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {

                        //uc.display();
                        new DisplayListView();


                    }
                });
                Exit.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {


                        Main.saveData(uc);
                        System.exit(0);
                    }
                });




                VBox layout = new VBox();
               AddEmp.setPrefSize(160,40);
               SEmployeeSalary.setPrefSize(160,40);
              IncreaseSal.setPrefSize(160,40);
               SEmployeeDis.setPrefSize(160,40);
               AllEmployeeDis.setPrefSize(160,40);
               Exit.setPrefSize(160,40);
                layout.setSpacing(10);
                layout.setPadding(new Insets(20, 0, 0, 170));

                layout.getChildren().addAll(AddEmp,SEmployeeSalary,IncreaseSal,SEmployeeDis,AllEmployeeDis,Exit);
                Scene secondScene = new Scene(layout, 550, 400);
                secondScene.getStylesheets().add(getClass().getResource("Viper.css").toExternalForm());
                Stage newWindow = new Stage();
                newWindow.setTitle("Enter Requires Data");
                newWindow.setScene(secondScene);

                newWindow.setX(primaryStage.getX() + 350);
                newWindow.setY(primaryStage.getY() + 0);

                newWindow.show();
                newWindowEmp.close();

            }
        });
    }

}
