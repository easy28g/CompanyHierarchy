package Megacom.Base;

public class Company {

    private String comName;
    private String adress;

    public Company(String comName, String adress) {
        this.comName = comName;
        this.adress = adress;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
