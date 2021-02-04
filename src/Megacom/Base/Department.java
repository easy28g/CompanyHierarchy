package Megacom.Base;

import Megacom.InterfaceBase.DirInterface;

public class Department extends Names {

    private String depName;
    private Directorate directorate;

    public Department(String depName, String namep,  Directorate directorate) {
        super(namep);
        this.depName = depName;
        this.directorate = directorate;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Directorate getDirectorate() {
        return directorate;
    }

    public void setDirectorate(Directorate directorate) {
        this.directorate = directorate;
    }


}
