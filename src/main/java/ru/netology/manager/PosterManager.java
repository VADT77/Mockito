package ru.netology.manager;

import ru.netology.domain.PosterItems;

public class PosterManager {

    private PosterRepository repo = new PosterRepository();


    private int resultLength = 10;

    public PosterManager() {

    }

    public PosterManager(int resultLength) {
        this.resultLength = resultLength;
    }


    public void add(PosterItems item) {
        repo.save(item);
    }

    public PosterItems[] findAll() {
        return repo.findAll();
    }


    public PosterItems[] findLast() {
        PosterItems[] source = repo.findAll();
        Integer resultLength = this.resultLength;
        if (source.length <= resultLength) {
            resultLength = source.length;
        }
        PosterItems[] result = new PosterItems[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = source.length - i - 1;
            result[i] = source[index];
        }
        return result;
    }
}