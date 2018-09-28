package com.example.vitikcorp.shopitserver.Common;

public class Common {
    public static final String UPDATE="Update";
    public static final String DELETE="Delete";

    public static String convertCodeToStatus(String code){
        if(code.equals("0"))
            return "Placed";
        else if(code.equals("1"))
            return "Order On its Way";
        else
            return "Shipped";
    }
}
