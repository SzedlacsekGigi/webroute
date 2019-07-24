package com.codecool.webroute;

public class Routes {

    @WebRoute(urlPatterns = {"/test1"})
    public String test1() {
        return "This is test1";
    }

    @WebRoute(urlPatterns = {"/test2"})
    public String test2() {
        return "This is test2";
    }

}
