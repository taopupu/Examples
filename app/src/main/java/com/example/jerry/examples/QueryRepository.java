package com.example.jerry.examples;

public class QueryRepository {

    public void addModel(String pic,String number){
        QueryModel model=new QueryModel();
        model.number=number;
        model.pic=pic;
        model.save();
    }

}
