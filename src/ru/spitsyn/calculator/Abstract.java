package ru.spitsyn.calculator;


public abstract class Abstract {
    public  int value;

    public Abstract(int value){
        this.value = value;
    }

    protected Abstract() {
    }


    abstract public String Vyvod();



}
