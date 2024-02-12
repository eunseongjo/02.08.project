package org.example;

import static org.example.Application.ability;
import static org.example.Application.property;

public class Work extends Action {

    public Work(int property) {
        super(property);
        ability = ability;
    }

    @Override
    public void execute() {
        System.out.println("일을 시작합니다...");
        property += ability * 100;
        System.out.println("일을 마치고 재산이 " + (ability * 100) + " 만큼 증가했습니다.");
    }
}