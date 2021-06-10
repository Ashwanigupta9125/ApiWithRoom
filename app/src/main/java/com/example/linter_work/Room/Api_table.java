package com.example.linter_work.Room;


import android.graphics.Bitmap;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Api_table{

    @PrimaryKey (autoGenerate = true)
    int stuId;



     String Cname;
     String Ccapital;
     String Cregion;
     String Cpopulation;
     String Csubregion;
     String Cboundry;
     String Clangguage;
     @Ignore
     Bitmap Flage_Cou;


    public Api_table() {
    }

    public Api_table(String cname, String ccapital, String cregion, String cpopulation, String csubregion, String cboundry, String clangguage, Bitmap flage_Cou) {
        Cname = cname;
        Ccapital = ccapital;
        Cregion = cregion;
        Cpopulation = cpopulation;
        Csubregion = csubregion;
        Cboundry = cboundry;
        Clangguage = clangguage;
        Flage_Cou = flage_Cou;
    }

/*    public Api_table(String cname, String ccapital, String cregion, String cpopulation, String csubregion, String cboundry, String clangguage) {
        this.Cname = cname;
        this.Ccapital = ccapital;
        this.Cregion = cregion;
        this.Cpopulation = cpopulation;
        this.Csubregion = csubregion;
        this.Cboundry = cboundry;
        this.Clangguage = clangguage;
    }*/

    /*public int getStuId() {
        return stuId;
    }

    public String getCname() {
        return Cname;
    }

    public String getCcapital() {
        return Ccapital;
    }

    public String getCregion() {
        return Cregion;
    }

    public String getCpopulation() {
        return Cpopulation;
    }

    public String getCsubregion() {
        return Csubregion;
    }

    public String getCboundry() {
        return Cboundry;
    }

    public String getClangguage() {
        return Clangguage;
    }

*//*    public byte[] getFlage() {
        return Flage;
    }*//*

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public void setCcapital(String ccapital) {
        Ccapital = ccapital;
    }

    public void setCregion(String cregion) {
        Cregion = cregion;
    }

    public void setCpopulation(String cpopulation) {
        Cpopulation = cpopulation;
    }

    public void setCsubregion(String csubregion) {
        Csubregion = csubregion;
    }

    public void setCboundry(String cboundry) {
        Cboundry = cboundry;
    }

    public void setClangguage(String clangguage) {
        Clangguage = clangguage;
    }
*//*
    public void setFlage(byte[] flage) {
        Flage = flage;
    }*/
}



