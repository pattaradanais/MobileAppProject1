package kku.sukruam.pattaradanai.projectmappv1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by patipan on 9/21/2016 AD.
 */

public class Grill {
    private int GrillId;
    private String grillbake;
    private String grilldescription;

    List<Grill> Grills = new ArrayList<>();

    Grill() {

    }

    Grill(int GrillId, String grillbake, String grilldescription) {
        this.GrillId = GrillId;
        this.grillbake = grillbake;
        this.grilldescription = grilldescription;
    }
    Grill(int GrillId, String grillbake) {
        this.GrillId = GrillId;
        this.grillbake =grillbake;

    }


    public int getGrillId() {
        return GrillId;
    }

    public void setGrillId(int GrillId) {
        this.GrillId = GrillId;
    }

    public String getgrillbake() {
        return grillbake;
    }

    public void setgrillbake(String grillbake) {this.grillbake= grillbake;
    }

    public String getgrilldescription() {
        return grilldescription;
    }

    public void setgrilldescription(String grilldescription) {
        this.grilldescription = grilldescription;
    }

    public List<Grill> getGrills() {
        return Grills;
    }

    public void setGrills(List<Grill> grills) {
        this.Grills = grills;
    }
}
