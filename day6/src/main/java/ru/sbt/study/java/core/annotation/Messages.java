package ru.sbt.study.java.core.annotation;

@Print(style = "arrow", color = Colors.RED)
public class Messages {

    @Print(style = "hurray", color = Colors.PURPLE)
    public String happyBirthday() {
        return "С днём рождения!";
    }

    @Print(style = "!", color = Colors.YELLOW)
    public String warning() {
        return "Предупреждение";
    }

    public String error() {
        return "Ошибка";
    }
}
