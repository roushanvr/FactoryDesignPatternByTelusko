package org.example;

public class Factory {
    public OS getInstance(String str){
        if(str.equals("Android")){
            return new Android();
        }
        else if(str.equals("Ios")){
            return new Ios();
        }
        else{
            return new Windows();
        }
    }
}
