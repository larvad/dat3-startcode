package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import facades.FacadeExample;
import facades.MovieFacade;
import utils.EMF_Creator;

import javax.persistence.EntityManagerFactory;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;

@Path("movie")
public class MovieResource {

    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory();

    private static final MovieFacade FACADE =  MovieFacade.getInstance(EMF);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

//
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public String getAllMvoies() {
//        List<MovieDTO> movieDTOList = facade.getAllMvoies();
//        return GSON.toJson(movieDTOList);
//    }
}