package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Controller {

    @FXML
    private TextField a;

    @FXML
    private TextField b;

    @FXML
    private TextField c;

    @FXML
    private Button knap;

    @FXML
    void save(ActionEvent event) throws IOException {
        Spildata spildata = new Spildata();
        spildata.a = a.getText();
        spildata.b = b.getText();
        spildata.c = c.getText();
        Filehandling filehandling = new Filehandling();
        filehandling.save(spildata);
    }

    @FXML
    void load(ActionEvent event) throws IOException {
        Filehandling filehandling = new Filehandling();
        Spildata spildata;
        spildata = filehandling.load();
        a.setText(spildata.a);
        b.setText(spildata.b);
        c.setText(spildata.c);
    }

}

