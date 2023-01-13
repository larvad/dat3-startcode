package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dtos.HarbourDto;
import dtos.OwnerDto;
import dtos.BoatDto;
import facades.BoatFacade;
import utils.EMF_Creator;

import javax.persistence.EntityManagerFactory;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("boat")
public class BoatResource {
    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory();

    private static final BoatFacade facade =  BoatFacade.getInstance(EMF);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }


    @Path("owner")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllOwners(){
        List<OwnerDto> ownerDtoList = facade.getAllOwners();
        return GSON.toJson(ownerDtoList);
    }


    @Path("harbour")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllHarbours(){
        List<HarbourDto> harbourDtoList = facade.getAllHarbours();
        return GSON.toJson(harbourDtoList);
    }

    @Path("boats")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getAllBoats(){
        List<BoatDto> boatDtoList = facade.getAllBoats();
        return GSON.toJson(boatDtoList);
    }


}