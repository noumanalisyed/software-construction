package com.data;

public class Arrays{

    private int arr[] = {1,2,3,4,5};

    public Arrays(){
        System.out.println("Costructor ");
    }
    public void print(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
