package ru.netology.domain;

public class PostComment {

    private int count; //количество комментариев
    private boolean canPost; //информация о возможности комментирования пользователем поста (true - может, false - не может)
    private boolean canOpen; // может ли текущий пользователь открыть комментарии к записи (true - может, false - не может)
    private boolean canClose; //может ли текущий пользователь закрыть комментарии к записи (true - может, false - не может)

}
