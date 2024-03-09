package com.example.kite.model;

public class CompanyModel {
    public String CompanyName;
    public String type;
    public String Value;
    public String percentage;

    public CompanyModel(String companyName, String type, String value, String percentage) {
        CompanyName = companyName;
        this.type = type;
        Value = value;
        this.percentage = percentage;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "CompanyModel{" +
                "CompanyName='" + CompanyName + '\'' +
                ", type='" + type + '\'' +
                ", Value='" + Value + '\'' +
                ", percentage='" + percentage + '\'' +
                '}';
    }
}
