package ru.netology.domain;

public class PostComment {

    private int count; //количество комментариев
    private boolean canPost; //информация о возможности комментирования пользователем поста (true - может, false - не может)
    private int canOpen; // может ли текущий пользователь открыть комментарии к записи
    private int canClose; //может ли текущий пользователь закрыть комментарии к записи

}
