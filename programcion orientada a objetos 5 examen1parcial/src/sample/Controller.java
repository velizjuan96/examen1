package sample;

import javafx.event.ActionEvent;

import java.awt.*;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.omg.CORBA.PUBLIC_MEMBER;

import javax.swing.border.TitledBorder;
import java.io.IOException;

import javafx.scene.control.Button;

public class Controller {

    public TextField usuario;
    public TextField contra;
    public Button enviar;
    public Label mensajess;

    int contador=0;

    public void enviar(ActionEvent actionEvent) {


        if (contra.getText().equals("123456")){
            System.out.println("Bienvenido");
            mensajess.setText("Bienvenido");

        }else{
                contador = contador + 1;
                if (contador == 3) {

                    System.out.println("Supero los intentos");
                    mensajess.setText("Supero los intentos");

                }

        }

    }
}
