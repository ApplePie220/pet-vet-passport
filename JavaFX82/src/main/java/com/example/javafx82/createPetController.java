package com.example.javafx82;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;

public class createPetController{

    @FXML
    private TextField petAge;

    @FXML
    private TextField petBirthday;

    @FXML
    private TextField petName;

    @FXML
    private ToggleGroup selection;


    @FXML
    void addNewPet(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Успешно!");
        alert.setHeaderText("Питомец очень успешно добавлен");
        alert.setContentText("Закройте немедленно окно и нажмите на кнопку обновить.");
        Pets pets = new Pets();
        pets.setName(petName.getText());
        pets.setAge(petAge.getText());
        pets.setBirthday(petBirthday.getText());
        RadioButton select = (RadioButton)selection.getSelectedToggle();
        pets.setVid(select.getText());
        for(int i=0;i<4;i++){
            pets.vaccines.add(new Vaccine());
        }
        if(pets.getVid().equals("Кошка")){
            Image image = new Image(getClass().getResourceAsStream("avaforcat1.png"));
            pets.setAvatarka(image);
        } else{
            Image image = new Image(getClass().getResourceAsStream("avafordog.png"));
            pets.setAvatarka(image);
        }
        HelloController.pets.add(pets);
        alert.show();
    }

}
