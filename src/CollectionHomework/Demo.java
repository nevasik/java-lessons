package CollectionHomework;
public class Demo {
    public static void main(String[] args) {
        Movie movie1 = new Movie(2015, 10, "Comedy", 4);
        Movie movie2 = new Movie(2016, 6, "Romantic", 5);
        Movie movie3 = new Movie(2015, 12, "Horror", 6);
        Movie movie4 = new Movie(2019, 1, "Science fiction", 10);
        Movie movie5 = new Movie(2009, 4, "Documentary", 8);
        Movie movie6 = new Movie(2021, 2, "Animated film", 1);
        Movie movie7 = new Movie(2018, 7, "Thriller", 9);
        Movie movie8 = new Movie(2022, 1, "Drama", 7);
        Movie movie9 = new Movie(2000, 11, "Adventure", 4);
        Movie movie10 = new Movie(2014, 8, "Detective", 3);
        Movie movie11 = new Movie(2003, 9, "Vestern", 6);
        Movie movie12 = new Movie(2016, 7, "History theater", 5);
        Theater theater = new Theater();

        System.out.println(theater.add(movie1));
        System.out.println(theater.add(movie2));
        System.out.println(theater.add(movie3));
        System.out.println(theater.add(movie4));
        System.out.println(theater.add(movie5));
        System.out.println(theater.add(movie6));
        System.out.println(theater.add(movie7));
        System.out.println(theater.add(movie8));
        System.out.println(theater.add(movie9));
        System.out.println(theater.add(movie10));
        System.out.println(theater.add(movie11));
        System.out.println(theater.add(movie12));

        System.out.println(theater.getByYear(2015));
        System.out.println(theater.getByYear(2003));
        System.out.println(theater.getByYear(2009));

        System.out.println(theater.getByYearAndMonth(2015, 10));
        System.out.println(theater.getByYearAndMonth(2014, 8));
        System.out.println(theater.getByYearAndMonth(2021, 2));

        System.out.println(theater.getByGenre("Horror"));
        System.out.println(theater.getByGenre("Science fiction"));
        System.out.println(theater.getByGenre("Vestern"));

        System.out.println(theater.getTop10ByRating());
    }
}
