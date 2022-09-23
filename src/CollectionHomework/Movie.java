package CollectionHomework;

import java.util.Objects;

public class Movie implements Comparable<Movie> {

    private int id;
    private static int counter = 1;
    private int releaseYear;
    private int releaseMonth;
    private String genre;
    private int rating;

    public Movie(int releaseYear, int releaseMonth, String genre, int rating) {
        this.id = counter++;
        this.releaseYear = releaseYear;
        this.releaseMonth = releaseMonth;
        this.genre = genre;
        this.rating = rating;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return releaseYear == movie.releaseYear && releaseMonth == movie.releaseMonth && rating == movie.rating && genre.equals(movie.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(releaseYear, releaseMonth, genre, rating);
    }
    public int getId() {
        return id;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", releaseYear=" + releaseYear +
                ", releaseMonth=" + releaseMonth +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(Movie o) {
        if (rating == o.rating) {
            return 0;
        }
        else if (rating > o.rating){
            return -1;
        }
        else {
            return 1;
        }
    }

}
