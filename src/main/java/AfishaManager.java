public class AfishaManager {
    private String[] films = new String[0];
    private int limitation;

    public AfishaManager() {
        int limitation = 10;
    }

    public AfishaManager(int limitation) {
        this.limitation = limitation;
    }


    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] showAll() {
        return films;
    }


    public String[] findLast() {

        int resultLength;
        if (films.length < 10) {
            resultLength = films.length;
        } else {
            resultLength = 10;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
