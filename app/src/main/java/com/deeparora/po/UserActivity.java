package com.deeparora.po;

/**
 * Created by Waheguru on 7/24/2018.
 */

public class UserActivity {
    String clu_id;
    String clu_name;
    String clu_district;
    String clu_licence;

    public UserActivity(){

    }

    public UserActivity(String clu_id,String clu_name,String clu_district,String clu_licence) {
        this.clu_id = clu_id;
        this.clu_name = clu_name;
        this.clu_district = clu_district;
        this.clu_licence = clu_licence;
    }

    public String getClu_id() {
        return clu_id;
    }

    public void setClu_id(String clu_id) {
        this.clu_id = clu_id;
    }

    public String getClu_name() {
        return clu_name;
    }

    public void setClu_name(String clu_name) {
        this.clu_name = clu_name;
    }

    public String getClu_district() {
        return clu_district;
    }

    public void setClu_district(String clu_district) {
        this.clu_district = clu_district;
    }

    public String getClu_licence() {
        return clu_licence;
    }

    public void setClu_licence(String clu_licence) {
        this.clu_licence = clu_licence;
    }
}
