package com.example.hongtao.beeradviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongtao on 2017/9/11.
 */

public class BeerExpert {
    List<String> getBrands(String beerType){
        //新建一个集合用来存放得到的beerType
        List<String>brands = new ArrayList<String>();
        if(beerType.equals("amber")==true){
            brands.add("Jack Amber");
            brands.add("Red Moose");
            }
        else{
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
