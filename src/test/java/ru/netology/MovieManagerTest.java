package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.MovieManager;

public class MovieManagerTest {

    @Test
    public void shouldNoAdd() {
    MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAdd() {
        MovieManager manager = new MovieManager();

        manager.add("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddLast() {
        MovieManager manager = new MovieManager();

        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        manager.add("Человек-невидимка");

        String[] expected = {"Человек-невидимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddLastBelow() {
        MovieManager manager = new MovieManager();

        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентельмены");

        String[] expected = {"Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddLastAbove() {
        MovieManager manager = new MovieManager();

        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли. Мировой тур");

        String[] expected = {"Тролли. Мировой тур", "Человек-невидимка", "Джентельмены", "Отель Белград", "Вперед"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldNoAddLast() {
        MovieManager manager = new MovieManager();


        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

}
