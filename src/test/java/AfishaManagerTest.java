import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {

    @Test

    public void addFilm() {


        AfishaManager manager = new AfishaManager();

        manager.addFilm("Баладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");

        String[] expected = {"Баладшот", "Вперед", "Отель Белград"};
        String[] actual = manager.showAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFilm() {

        AfishaManager manager = new AfishaManager();
        manager.addFilm("Баладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");

        String[] expected = {"Отель Белград", "Вперед", "Баладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void findLastIfMoreTen() {

        AfishaManager manager = new AfishaManager();
        manager.addFilm("Баладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");
        manager.addFilm("Джентельмены");
        manager.addFilm("Человек - невидимка");
        manager.addFilm("Тролли. Мировой тур");
        manager.addFilm("Номер один");
        manager.addFilm("Джентельмены -2");
        manager.addFilm("Джентельмены - 3");
        manager.addFilm("Джентельмены - 4");
        manager.addFilm("Джентельмены -5");
        String[] expected = {"Джентельмены -5", "Джентельмены - 4", "Джентельмены - 3", "Джентельмены -2", "Номер один", "Тролли. Мировой тур", "Человек - невидимка", "Джентельмены", "Отель Белград", "Вперед"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
