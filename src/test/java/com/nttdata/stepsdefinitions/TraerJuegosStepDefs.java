package com.nttdata.stepsdefinitions;

import com.nttdata.freetogame.TraerJuegos;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class TraerJuegosStepDefs {

    @Steps
    TraerJuegos traerJuegos;

    @When("traemos los juegos de {string} y la categoria es de {string}")
    public void traerJuegos(String plataforma, String categoria) {
        traerJuegos.traerJuegos(plataforma, categoria);
    }


    @Then("el codigo de respuesta es {int}")
    public void elCodigoDeRespuestaEs(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }

    @And("y la respuesta tiene un {string} y {string}")
    public void yLaRespuestaTieneUnIdYTitulo(String id, String titulo) {
        System.out.println(SerenityRest.lastResponse().body().path(id).toString());
        System.out.println(SerenityRest.lastResponse().body().path(titulo).toString());
    }
}
