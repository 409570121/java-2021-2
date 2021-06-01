package com.kevin.box;


public  class Box3 extends Box{
    public Box3(){
        length = 15;
        height = 15;
        width = 15;
    }
    @Override
    public String getName(){
        return "Box3";
    }@Override
    public int getPrice(){
        return 50;
    }

}
