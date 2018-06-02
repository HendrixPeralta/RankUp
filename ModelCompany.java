package com.hdx.rankup;

public class ModelCompany {

    private int image;
    private String name, address, salaryRank, ambientRank;


    public ModelCompany(int image, String name, String address, String salaryRank, String ambientRank) {
        this.image = image;
        this.name = name;
        this.address = address;
        this.salaryRank = salaryRank;
        this.ambientRank = ambientRank;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSalaryRank() {
        return salaryRank;
    }

    public void setSalaryRank(String salaryRank) {
        this.salaryRank = salaryRank;
    }

    public String getAmbientRank() {
        return ambientRank;
    }

    public void setAmbientRank(String ambientRank) {
        this.ambientRank = ambientRank;
    }
}
