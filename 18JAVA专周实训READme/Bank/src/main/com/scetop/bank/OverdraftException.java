package com.scetop.bank;

public class OverdraftException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    private double deficit;

    public double getDeficit(){
        return deficit;
    }
    public OverdraftException(String msg, double deficit){
        super(msg);
        deficit=deficit;
    }


}
