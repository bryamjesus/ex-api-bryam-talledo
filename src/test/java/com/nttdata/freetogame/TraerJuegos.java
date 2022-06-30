package com.nttdata.freetogame;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class TraerJuegos {

    private static String URL_BASE = "https://www.freetogame.com/api/games";

    @Step
    public void traerJuegos(String plataforma, String categoria){
        SerenityRest
                .given()
                .contentType("application/json")
                .queryParams("platform", plataforma,"category",categoria )
                .get(URL_BASE);
    }


}
