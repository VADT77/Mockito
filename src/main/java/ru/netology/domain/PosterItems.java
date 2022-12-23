package ru.netology.domain;

public class PosterItems {


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

    }
