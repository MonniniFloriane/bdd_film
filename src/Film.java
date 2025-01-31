public class Film {
    private int filmID          = 0;
    private String filmName     = "";
    private String filmCategory = "";
    private int filmDuration    = 0;

    public Film(int filmID, String filmName, String filmCategory, int filmDuration) {
        this.filmID       = filmID;
        this.filmName     = filmName;
        this.filmCategory = filmCategory;
        this.filmDuration = filmDuration;
    }

    public int getFilmID() {
        return filmID;
    }

    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmCategory() {
        return filmCategory;
    }

    public void setFilmCategory(String filmCategory) {
        this.filmCategory = filmCategory;
    }

    public int getFilmDuration() {
        return filmDuration;
    }

    public void setFilmDuration(int filmDuration) {
        this.filmDuration = filmDuration;
    }

    @Override
    public String toString() {
        return "ListFilm :" +
                "ID='" + filmID + '\n' +
                "Titre='" + filmName + '\n' +
                "Category='" + filmCategory + '\n' +
                "Duration=" + filmDuration + '\n';
    }
}