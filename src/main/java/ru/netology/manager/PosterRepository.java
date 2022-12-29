package ru.netology.manager;
import ru.netology.domain.PosterItems;
public class PosterRepository {
    private PosterItems[] items = new PosterItems[0];
    public void save(PosterItems item) {
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

    public PosterItems findById(int id) {
        for (int i = 0; i < items.length; i++) {
            if(id == items[i].getId()) {
                return items[i];
            }
        }
        return null;
    }
}
