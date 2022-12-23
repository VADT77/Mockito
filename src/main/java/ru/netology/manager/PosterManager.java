package ru.netology.manager;

import ru.netology.domain.PosterItems;

public class PosterManager {

    private PosterItems[] items = new PosterItems[0];
    private int resultLength = 10;

    public PosterManager() {

    }

    public PosterManager(int resultLength) {
        this.resultLength = resultLength;
    }


    public void add(PosterItems item) {
        int length = items.length + 1;
        PosterItems[] tmp = new PosterItems[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }


    public PosterItems[] findAll() {
        return items;
    }


    public PosterItems[] findLast() {
        if (items.length > resultLength) {
            resultLength = resultLength;

        } else {
            resultLength = items.length;
        }
        PosterItems[] result = new PosterItems[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}