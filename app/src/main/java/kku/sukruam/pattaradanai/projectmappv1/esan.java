package kku.sukruam.pattaradanai.projectmappv1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by patipan on 9/21/2016 AD.
 */

public class esan {
    private int esannId;
    private String esanfood;
    private String esanndescription;

    List<esan> esans = new ArrayList<>();

    esan() {

    }

    esan(int esannId, String esanfood, String esanndescription) {
        this.esannId = esannId;
        this.esanfood = esanfood;
        this.esanndescription = esanndescription;
    }
    esan(int esannId, String esanfood) {
        this.esannId = esannId;
        this.esanfood =esanfood;

    }


    public int getesannId() {
        return esannId;
    }

    public void setesannId(int esannId) {
        this.esannId = esannId;
    }

    public String getesanfood() {
        return esanfood;
    }

    public void setEsanfood(String esanfood) {this.esanfood= esanfood;
    }

    public String getesanndescription() {
        return esanndescription;
    }

    public void setesanndescription(String esanndescription) {
        this.esanndescription =esanndescription;
    }

    public List<esan> getEsans() {
        return esans;
    }

    public void setEsans(List<esan> esans) {
        this.esans = esans;
    }
}
