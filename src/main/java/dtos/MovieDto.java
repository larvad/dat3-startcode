package dtos;

import entities.Actor;
import entities.Movie;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
 * A DTO for the {@link Movie} entity
 */
public class MovieDto implements Serializable {
//    private final Integer id;
//    @Size(max = 45)
//    private final String title;
//    @Size(max = 45)
//    private final int year;
////    private final Set<ActorInnerDTO> actors;
//
//    public MovieDto(Integer id, String title, int year, Set<ActorInnerDTO> actors) {
//        this.id = id;
//        this.title = title;
//        this.year = year;
//        this.actors = actors;
//    }
//
//    public MovieDto(Movie movie) {
//        this.id = movie.getId();
//        this.title = movie.getTitle();
//        this.year = movie.getYear();
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public Set<ActorInnerDTO> getActors() {
//        return actors;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        MovieDto entity = (MovieDto) o;
//        return Objects.equals(this.id, entity.id) &&
//                Objects.equals(this.title, entity.title) &&
//                Objects.equals(this.year, entity.year) &&
//                Objects.equals(this.actors, entity.actors);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, title, year, actors);
//    }
//
//    @Override
//    public String toString() {
//        return getClass().getSimpleName() + "(" +
//                "id = " + id + ", " +
//                "title = " + title + ", " +
//                "year = " + year + ", " +
//                "actors = " + actors + ")";
//    }
//
//    /**
//     * A DTO for the {@link Actor} entity
//     */
//    public static class ActorInnerDTO implements Serializable {
//        private final Integer id;
//        @Size(max = 45)
//        @NotNull
//        private final String name;
//        private final Integer birthyear;
//
//        public ActorInnerDTO(Integer id, String name, Integer birthyear) {
//            this.id = id;
//            this.name = name;
//            this.birthyear = birthyear;
//        }
//
//        public ActorInnerDTO (ActorInnerDTO actorInnerDTO) {
//            this.id = actorInnerDTO.getId();
//            this.name = actorInnerDTO.getName();
//            this.birthyear = actorInnerDTO.getBirthyear();
//        }
//
//        public Integer getId() {
//            return id;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public Integer getBirthyear() {
//            return birthyear;
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            ActorInnerDTO entity = (ActorInnerDTO) o;
//            return Objects.equals(this.id, entity.id) &&
//                    Objects.equals(this.name, entity.name) &&
//                    Objects.equals(this.birthyear, entity.birthyear);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(id, name, birthyear);
//        }
//
//        @Override
//        public String toString() {
//            return getClass().getSimpleName() + "(" +
//                    "id = " + id + ", " +
//                    "name = " + name + ", " +
//                    "birthyear = " + birthyear + ")";
//        }
//    }
}