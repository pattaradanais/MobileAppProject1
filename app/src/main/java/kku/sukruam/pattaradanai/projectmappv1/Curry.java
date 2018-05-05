package kku.sukruam.pattaradanai.projectmappv1;

import java.util.ArrayList;
import java.util.List;

public class Curry {
    private int curryId;
    private String curryfood;
    private String currydescription;

    List<Curry> Curries = new ArrayList<>();

    Curry() {

    }

    Curry(int curryfriedId, String curryfood, String currydescription) {
        this.curryId =curryId;
        this.curryfood = curryfood;
        this.currydescription = currydescription;
    }
    Curry(int curryId, String curryfood) {
        this.curryId = curryId;
        this.curryfood =curryfood;

    }


    public int getcurryId() {
        return curryId;
    }

    public void setcurryId(int friedId) {
        this.curryId = curryId;
    }

    public String getcurryfood() {
        return curryfood;
    }

    public void setcurryfood(String curryfood) {this.curryfood= curryfood;
    }

    public String getcurrydescription() {
        return currydescription;
    }

    public void setcurrydescription(String currydescription) {
        this.currydescription =currydescription;
    }

    public List<Curry> getCurries() {
        return Curries;
    }

    public void setCurries(List<Curry> curries) {
        this.Curries = curries;
    }
}

