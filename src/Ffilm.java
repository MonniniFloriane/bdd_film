public class Ffilm {
    public static Film creaFilm(int filmID, String filmName, String filmCategory, int filmDuration) {
        return new Film(filmID, filmName, filmCategory, filmDuration);
    }
}