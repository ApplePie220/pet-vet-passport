package com.example.javafx82;

import javafx.scene.image.Image;

import java.util.ArrayList;

public class Pets {
    private String name;
    private String age;
    private String birthday;
    private String vid;
    private Image avatarka;
    public ArrayList<Vaccine> vaccines = new ArrayList<>();

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public Image getAvatarka(){return avatarka;}
    public void setAvatarka(Image avatarka){this.avatarka=avatarka;}

    public String getAge(){return age;}
    public void setAge(String age){this.age=age;}

    public String getBirthday(){return birthday;}
    public void setBirthday(String birthday){this.birthday=birthday;}

    public String getVid(){return vid;}
    public void setVid(String vid){this.vid=vid;}

    public ArrayList<Vaccine> getVaccine(){return vaccines;}
    public void setVaccine(ArrayList<Vaccine> vaccines){this.vaccines =vaccines;}

    @Override
    public String toString() {
        return this.name;
    }

}
