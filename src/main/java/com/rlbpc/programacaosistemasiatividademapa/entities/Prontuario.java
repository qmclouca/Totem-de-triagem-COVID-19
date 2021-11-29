/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rlbpc.programacaosistemasiatividademapa.entities;
import java.io.Serializable;

/**
 *
 * @author Rodolfo Bortoluzzi
 */
public class Prontuario extends Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    private Boolean temFeb = false; //Tem Febre?
    private Boolean temDorCab = false; //Tem dor de cabeça?
    private Boolean temSecrNasalEsp = false; //Tem secreção nasal ou espirros?
    private Boolean temDorIrrGarg = false; //Tem dor/irritação na garganta? 
    private Boolean temTosse = false; //Tem tosse seca? 
    private Boolean temDifResp = false; //Tem dificuldade respiratória?
    private Boolean temDorCorp = false; //Tem dores no corpo?
    private Boolean temDiarr = false; //Tem diarreia?
    private Boolean temContCOVID = false; //Esteve em contato, nos últimos 14 dias, com um caso diagnosticado com COVID-19?
    private Boolean temLocGA = false; //Esteve em locais com grande aglomeração?

    public Prontuario() {
    }
    
    public Prontuario(
            String nome,
            String sexo,
            String cpf,
            Integer idade,
            Boolean temFeb, 
            Boolean temDorCab, 
            Boolean temSecrNasalEsp,
            Boolean temDorIrrGarg,
            Boolean temTosse,
            Boolean temDifResp,
            Boolean temDorCorp,
            Boolean temDiarr,
            Boolean temContCOVID,
            Boolean temLocGA){
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.idade = idade;
        this.temFeb = temFeb;
        this.temDorCab = temDorCab;
        this.temSecrNasalEsp = temSecrNasalEsp;
        this.temDorIrrGarg = temDorIrrGarg;
        this.temTosse = temTosse;
        this.temDifResp = temDifResp;
        this.temDorCorp = temDorCorp;
        this.temDiarr = temDiarr;
        this.temContCOVID = temContCOVID;
        this.temLocGA = temLocGA;        
    }

    @Override
    public String toString() {
        return "Prontuario{"
                + "Nome: " + nome +
                ", sexo: " + sexo +
                ", idade: " + idade +
                ", CPF: " + cpf +
                ", tem febre: " + temFeb +
                ", tem dor de cabeça: " + temDorCab + 
                ", tem secreção nasal ou espirros: " + temSecrNasalEsp + 
                ", tem dor/irritaçao na garganta: " + temDorIrrGarg + 
                ", tem tosse seca: " + temTosse + 
                ", tem dificuldade respiratória: " + temDifResp + 
                ", tem dores no corpo: " + temDorCorp + 
                ", tem diarreia: " + temDiarr + 
                ", esteve em contato, nos últimos 14 dias, com um caso diagnosticado com COVID-19: " + temContCOVID + 
                ", esteve em locais com grande aglomeração: " + temLocGA + '}';
    }

    
 

    public Boolean getTemFeb() {
        return temFeb;
    }

    public Boolean getTemDorCab() {
        return temDorCab;
    }

    public Boolean getTemSecrNasalEsp() {
        return temSecrNasalEsp;
    }

    public Boolean getTemDorIrrGarg() {
        return temDorIrrGarg;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Boolean getTemTosse() {
        return temTosse;
    }

    public Boolean getTemDifResp() {
        return temDifResp;
    }

    public Boolean getTemDorCorp() {
        return temDorCorp;
    }

    public Boolean getTemDiarr() {
        return temDiarr;
    }

    public Boolean getTemContCOVID() {
        return temContCOVID;
    }

    public Boolean getTemLocGA() {
        return temLocGA;
    }

    public void setTemFeb(Boolean temFeb) {
        this.temFeb = temFeb;
    }

    public void setTemDorCab(Boolean temDorCab) {
        this.temDorCab = temDorCab;
    }

    public void setTemSecrNasalEsp(Boolean temSecrNasalEsp) {
        this.temSecrNasalEsp = temSecrNasalEsp;
    }

    public void setTemDorIrrGarg(Boolean temDorIrrGarg) {
        this.temDorIrrGarg = temDorIrrGarg;
    }

    public void setTemTosse(Boolean temTosse) {
        this.temTosse = temTosse;
    }

    public void setTemDifResp(Boolean temDifResp) {
        this.temDifResp = temDifResp;
    }

    public void setTemDorCorp(Boolean temDorCorp) {
        this.temDorCorp = temDorCorp;
    }

    public void setTemDiarr(Boolean temDiarr) {
        this.temDiarr = temDiarr;
    }

    public void setTemContCOVID(Boolean temContCOVID) {
        this.temContCOVID = temContCOVID;
    }

    public void setTemLocGA(Boolean temLocGA) {
        this.temLocGA = temLocGA;
    }  
    
}
