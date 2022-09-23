package CollectionHomework;

import java.util.List;
public interface MovieService {

    Movie add(Movie movie);
    Object getByYear(Integer year);
    List<Movie> getByYearAndMonth(Integer year, Integer releaseMonth);
    List<Movie> getByGenre(String genre);
    List<Movie> getTop10ByRating();
}
