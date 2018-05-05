package kku.sukruam.pattaradanai.projectmappv1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by patipan on 9/21/2016 AD.
 */

public class Spicy {
    private int spicyId;
    private String spicyfood;
    private String spicydescription;

    List<Spicy> spicys = new ArrayList<>();

    Spicy() {

    }

    Spicy(int  spicyfriedId, String spicyfood, String spicydescription) {
        this.spicyId =spicyId;
        this.spicyfood = spicyfood;
        this.spicydescription = spicydescription;
    }
    Spicy(int spicyId, String spicyfood) {
        this.spicyId = spicyId;
        this.spicyfood =spicyfood;

    }


    public int getspicyId() {
        return spicyId;
    }

    public void setspicyId(int spicyId) {
        this.spicyId =spicyId;
    }

    public String getspicyfood() {
        return spicyfood;
    }

    public void setspicyfood(String spicyfood) {this.spicyfood= spicyfood;
    }

    public String getspicydescription() {
        return spicydescription;
    }

    public void setspicydescription(String spicydescription) {
        this.spicydescription =spicydescription;
    }

    public List<Spicy> getspicys() {
        return spicys;
    }

    public void setspicys(List<Spicy> spicys) {
        this.spicys = spicys;
    }
}
