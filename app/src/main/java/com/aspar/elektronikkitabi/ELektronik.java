package com.aspar.elektronikkitabi;

import java.io.Serializable;

public class ELektronik implements Serializable {

    String name;
    String tanim;
    int image;

    public ELektronik( String name, String tanim,int image){

        this.name =name;
        this.tanim = tanim;
        this.image = image;

    }

}
