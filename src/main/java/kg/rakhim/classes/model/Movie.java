package kg.rakhim.classes.model;

public class Movie {
    private String movie_id;

    private String director;
    private String  name;
    private int yearOfProduction;
    private String description;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }



    public String getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(String id) {
        this.movie_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
