
        package ru.netology.domain;

        import lombok.AllArgsConstructor;
        import lombok.Data;
        import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PosterItems {
    private int id;
    private String filmName;
    private String genre;

    public int getId() {
        return id;
    }
}

