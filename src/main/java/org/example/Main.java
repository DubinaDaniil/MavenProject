package org.example;

import com.google.gson.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Gson gson = new Gson();
        System.out.println(gson.toJson(List.of(new PrintMyName("Daniil", "Dubina"))));
    }
}