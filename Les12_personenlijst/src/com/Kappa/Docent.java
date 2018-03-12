package com.Kappa;

public class Docent extends Persoon {
    protected String code;

    public Docent(String naam, String voornaam, String code) {
        super(naam, voornaam);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Docent getSLBer() {
        return null;
    }

    @Override
    public String toString() {
        return "Docent{" +
                "code='" + code + '\'' +
                "} " + super.toString();
    }
}
