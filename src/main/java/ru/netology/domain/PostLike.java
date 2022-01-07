package ru.netology.domain;

public class PostLike {
    private int count; //количество лайков
    private boolean userLike; // наличие отметки «Мне нравится» от текущего пользователя (true - есть отметка, false - нет отметки)
    private boolean canLike; //информация о том, может ли текущий пользователь поставить отметку «Мне нравится» (true - может, false - не может)
}
