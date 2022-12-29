package ru.netology.manager;

import ru.netology.domain.PosterItems;

public class PosterManager {

    private PosterRepository repo =  new PosterRepository();


    private int resultLength = 10;

    public PosterManager() {

    }

    public PosterManager(int resultLength) {
        this.resultLength = resultLength;
    }


    public void add(PosterItems item) {
        repo.save(item);




    public PosterItems[] findAll() {
        return repo.findAll();
    }


    public PosterItems[] findLast() {
        public void findAll;
        if (repo.findAll().length > resultLength) {
            resultLength = resultLength;

        } else {
            resultLength = repo.findAll().length;
        }
        PosterItems[] result = new PosterItems[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = repo.findAll().length - i - 1;
            result[i] = repo.findAll() [index];
        }
        return result;
    }
}