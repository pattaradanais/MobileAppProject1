package kku.sukruam.pattaradanai.projectmappv1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by patipan on 9/21/2016 AD.
 */

public class Dessert {
    private int dessertId;
    private String dessertfood;
    private String dessertdescription;

    List<Dessert> Desserts = new ArrayList<>();

    Dessert() {

    }

    Dessert(int dessertId, String dessertfood, String dessertdescription) {
        this.dessertId = dessertId;
        this.dessertfood = dessertfood;
        this.dessertdescription = dessertdescription;
    }
    Dessert(int dessertId, String dessertfood) {
        this.dessertId = dessertId;
        this.dessertfood =dessertfood;

    }


    public int getdessertId() {
        return dessertId;
    }

    public void setdessertId(int dessertId) {
        this.dessertId = dessertId;
    }

    public String getdessertfood() {
        return dessertfood;
    }

    public void setdessertfood(String dessertfood) {this.dessertfood= dessertfood;
    }

    public String getdessertdescription() {
        return dessertdescription;
    }

    public void setdessertdescription(String dessertdescription) {
        this.dessertdescription =dessertdescription;
    }

    public List<Dessert> getDesserts() {
        return Desserts;
    }

    public void setDesserts(List<Dessert> desserts) {
        this.Desserts = desserts;
    }
}
