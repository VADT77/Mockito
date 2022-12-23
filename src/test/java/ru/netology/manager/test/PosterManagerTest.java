package ru.netology.manager.test;

mport org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterItems;
import ru.netology.manager.PosterManager;


public class PosterManagerTest {
    PosterItems first = new PosterItems(404, "Bloodshot", "action movie");
    PosterItems second = new PosterItems(902, "Forward", "cartoon");
    PosterItems third = new PosterItems(311, "Hotel Belgrade", "comedy");
    PosterItems fourth = new PosterItems(26, "Gentlemen", "action movie");
    PosterItems fifth = new PosterItems(298, "The Invisible Man", " horror");
    PosterItems sixth = new PosterItems(756, "Number one", " comedy");
    PosterItems seventh = new PosterItems(310, "Coati", "cartoon ");
    PosterItems eighth = new PosterItems(418, "Amanat", "history ");
    PosterItems ninth = new PosterItems(745, "21 bridges", "action movie");
    PosterItems tenth = new PosterItems(278, "Gauguin", "documentary ");

    @Test
    public void findAll() {
        PosterManager manager = new PosterManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        manager.findAll();
        manager.findLast();


        PosterItems[] actual = manager.findLast();
        PosterItems[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(actual,expected);
    }
    @Test
    public void findAll1() {
        PosterManager manager = new PosterManager(5);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        manager.findAll();
        manager.findLast();


        PosterItems[] actual = manager.findLast();
        PosterItems[] expected = {tenth, ninth, eighth, seventh, sixth};

        Assertions.assertArrayEquals(actual,expected);
    }
    @Test
    public void findAll2() {
        PosterManager manager = new PosterManager(15);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        manager.findAll();
        manager.findLast();


        PosterItems[] actual = manager.findLast();
        PosterItems[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(actual,expected);
    }

    @Test
    public void findLast() {
        PosterManager manager = new PosterManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        manager.findAll();

        PosterItems[] actual = manager.findAll();
        PosterItems[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};

        Assertions.assertArrayEquals(actual,expected);

    }
}
