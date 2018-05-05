package kku.sukruam.pattaradanai.projectmappv1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by patipan on 9/21/2016 AD.
 */


//stir

public class Other {
    private int otherId;
    private String otherfood;
    private String otherdescription;

    List<Other> others = new ArrayList<>();

    Other() {

    }

    Other(int otherId, String otherfood, String otherdescription) {
        this.otherId =otherId;
        this.otherfood = otherfood;
        this.otherdescription = otherdescription;
    }
    Other(int otherId, String otherfood) {
        this.otherId = otherId;
        this.otherfood =otherfood;

    }


    public int getotherId() {
        return otherId;
    }

    public void setotherId(int otherId) {
        this.otherId = otherId;
    }

    public String getotherfood() {
        return otherfood;
    }

    public void setotherfood(String otherfood) {this.otherfood= otherfood;
    }

    public String getotherdescription() {
        return otherdescription;
    }

    public void setotherdescription(String otherdescription) {
        this.otherdescription =otherdescription;
    }

    public List<Other> getOthers() {
        return others;
    }

    public void setOthers(List<Other> others) {
        this.others = others;
    }
}
