package Megacom.Base;

import Megacom.InterfaceBase.DirInterface;

public class Directorate extends Names implements DirInterface{

    private String dirName;
    private Company company;

    public Directorate(String namep, String dirName, Company company) {
        super(namep);
        this.dirName = dirName;
        this.company = company;
    }


    public String getDirName() {
        return dirName;
    }

    public void setDirName(String dirName) {
        this.dirName = dirName;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String getNameDir() {
        return getNamep();
    }
}
