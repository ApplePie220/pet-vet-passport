package com.example.javafx82;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class HelloController {
    public Stage stage1 = new Stage();
    public static ArrayList<Pets> pets = new ArrayList<>();
    @FXML
    private ResourceBundle resources;

    @FXML
    private ListView<Pets> ListOfPets;

    @FXML
    private TextField ageTextField;

    @FXML
    private TextField birthdayTextField;

    @FXML
    private TextField dateFour;

    @FXML
    private TextField dateOne;

    @FXML
    private TextField dateThree;

    @FXML
    private TextField dateTwo;

    @FXML
    private TextField nameFour;

    @FXML
    private TextField nameOne;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField nameThree;

    @FXML
    private TextField nameTwo;

    @FXML
    private TextField typeFour;

    @FXML
    private ImageView AvaImage;

    @FXML
    private TextField typeOne;

    @FXML
    private TextField typeThree;

    @FXML
    private TextField typeTwo;
    @FXML
    void addNewPet(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("createPet.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage1.setTitle("Мед книжка питомцев.");
        Image icon1 = new Image("https://i.pinimg.com/originals/96/e2/b6/96e2b6bc6bc57fd20a1e8d280d2995b2.jpg");
        stage1.getIcons().add(icon1);
        stage1.setResizable(false);
        stage1.setScene(scene);
        stage1.show();
    }

    @FXML
    public void reloadList(ActionEvent event) {
        ObservableList<Pets> elements = FXCollections.observableArrayList();
        for (Pets pet:
             pets) {
            elements.add(pet);
        }
        ListOfPets.setItems(elements);

    }
    @FXML
    void removePet(ActionEvent event) {
        pets.remove(ListOfPets.getSelectionModel().getSelectedItem());
        ListOfPets.getItems().remove(ListOfPets.getSelectionModel().getSelectedItem());
        nameTextField.setText("");
        ageTextField.setText("");
        birthdayTextField.setText("");
        typeOne.setText("");
        typeTwo.setText("");
        typeThree.setText("");
        typeFour.setText("");
        nameOne.setText("");
        nameTwo.setText("");
        nameThree.setText("");
        nameFour.setText("");
        dateOne.setText("");
        dateTwo.setText("");
        dateThree.setText("");
        dateFour.setText("");
        AvaImage.setImage(null);
    }
    @FXML
    void clicked(MouseEvent event) {
        nameTextField.setText(ListOfPets.getSelectionModel().getSelectedItem().getName());
        ageTextField.setText(ListOfPets.getSelectionModel().getSelectedItem().getAge());
        birthdayTextField.setText(ListOfPets.getSelectionModel().getSelectedItem().getBirthday());
        AvaImage.setImage(ListOfPets.getSelectionModel().getSelectedItem().getAvatarka());
        typeOne.setText(ListOfPets.getSelectionModel().getSelectedItem().vaccines.get(0).getType());
        typeTwo.setText(ListOfPets.getSelectionModel().getSelectedItem().vaccines.get(1).getType());
        typeThree.setText(ListOfPets.getSelectionModel().getSelectedItem().vaccines.get(2).getType());
        typeFour.setText(ListOfPets.getSelectionModel().getSelectedItem().vaccines.get(3).getType());
        nameOne.setText(ListOfPets.getSelectionModel().getSelectedItem().vaccines.get(0).getName());
        nameTwo.setText(ListOfPets.getSelectionModel().getSelectedItem().vaccines.get(1).getName());
        nameThree.setText(ListOfPets.getSelectionModel().getSelectedItem().vaccines.get(2).getName());
        nameFour.setText(ListOfPets.getSelectionModel().getSelectedItem().vaccines.get(3).getName());
        dateOne.setText(ListOfPets.getSelectionModel().getSelectedItem().vaccines.get(0).getDateofVaccine());
        dateTwo.setText(ListOfPets.getSelectionModel().getSelectedItem().vaccines.get(1).getDateofVaccine());
        dateThree.setText(ListOfPets.getSelectionModel().getSelectedItem().vaccines.get(2).getDateofVaccine());
        dateFour.setText(ListOfPets.getSelectionModel().getSelectedItem().vaccines.get(3).getDateofVaccine());

    }
    @FXML
    void confirmEdit(ActionEvent event) {
        ListOfPets.getSelectionModel().getSelectedItem().setName(nameTextField.getText());
        ListOfPets.getSelectionModel().getSelectedItem().setBirthday(birthdayTextField.getText());
        ListOfPets.getSelectionModel().getSelectedItem().setAge(ageTextField.getText());
        ListOfPets.getSelectionModel().getSelectedItem().vaccines.get(0).setName(nameOne.getText());
        ListOfPets.getSelectionModel().getSelectedItem().vaccines.get(0).setDatOfVaccine(dateOne.getText());
        ListOfPets.getSelectionModel().getSelectedItem().vaccines.get(0).setType(typeOne.getText());
        ListOfPets.getSelectionModel().getSelectedItem().vaccines.get(1).setName(nameTwo.getText());
        ListOfPets.getSelectionModel().getSelectedItem().vaccines.get(1).setDatOfVaccine(dateTwo.getText());
        ListOfPets.getSelectionModel().getSelectedItem().vaccines.get(1).setType(typeTwo.getText());
        ListOfPets.getSelectionModel().getSelectedItem().vaccines.get(2).setName(nameThree.getText());
        ListOfPets.getSelectionModel().getSelectedItem().vaccines.get(2).setDatOfVaccine(dateThree.getText());
        ListOfPets.getSelectionModel().getSelectedItem().vaccines.get(2).setType(typeThree.getText());
        ListOfPets.getSelectionModel().getSelectedItem().vaccines.get(3).setName(nameFour.getText());
        ListOfPets.getSelectionModel().getSelectedItem().vaccines.get(3).setDatOfVaccine(dateFour.getText());
        ListOfPets.getSelectionModel().getSelectedItem().vaccines.get(3).setType(typeFour.getText());
    }

}
