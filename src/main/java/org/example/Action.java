package org.example;


public abstract class Action {

    public Action(int property) {
        Application.property = property;
    }

    // 행동을 실행하는 추상 메서드
    abstract void execute();

}
