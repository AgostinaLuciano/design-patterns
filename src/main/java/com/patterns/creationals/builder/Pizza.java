package com.patterns.creationals.builder;

//CLASE PRODUCTO
public class Pizza {
    private String masa;
    private String salsa;
    private String condimentos;

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String getCondimentos() {
        return condimentos;
    }

    public void setCondimentos(String condimentos) {
        this.condimentos = condimentos;
    }
}
