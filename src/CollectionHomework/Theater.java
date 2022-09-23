package CollectionHomework;

import java.util.*;
public class Theater implements MovieService {
    Map<Integer, List<Movie>> map = new TreeMap<>();
    @Override
    public Movie add(Movie movie) {
        if (map.containsKey(movie.getReleaseYear())){
            List<Movie> movieList = map.get(movie.getReleaseYear());
            movieList.add(movie);
        }
        else {
            List<Movie> list = new ArrayList<>();
            list.add(movie);
            map.put(movie.getReleaseYear(), list);
        }
        return movie;
    }
    @Override
    public List<Movie> getByYear(Integer year) {
        List<Movie> list = new ArrayList<>();
        if (!map.containsKey(year)) {
            return list;
        }
        return map.get(year);
    }
    @Override
    public List<Movie> getByYearAndMonth(Integer year, Integer releaseMonth) {
        List<Movie> list = new ArrayList<>();
        List<Movie> byYear = getByYear(year);
        for (Movie movie : byYear) {
            if (movie.getReleaseMonth() == releaseMonth) {
                list.add(movie);
            }
        }
        return list;
    }
    @Override
    public List<Movie> getByGenre(String genre) {
        List<Movie> list = new ArrayList<>();
        Collection<List<Movie>> movieValues = map.values();
        for (List<Movie> value : movieValues) {
            for (Movie movie : value) {
                if (genre.equals(movie.getGenre())) {
                    list.add(movie);
                }
            }
        }
        return list;
    }

    @Override
    public List<Movie> getTop10ByRating() {
        List<Movie> total = new ArrayList<>();
        Collection<List<Movie>> values = map.values();
        for (List<Movie> movieList : values) {
            total.addAll(movieList);
        }
        Collections.sort(total);
        List<Movie> top10List = new ArrayList<>();
        int length = Math.min(total.size(), 10);
        for (int i = 0; i < length; i++) {
            top10List.add(total.get(i));

        }
        return top10List;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "map=" + map +
                '}';
    }
}
