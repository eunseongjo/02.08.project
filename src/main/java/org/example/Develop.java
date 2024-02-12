package org.example;

import static org.example.Application.ability;
import static org.example.Application.property;

public class Develop extends Action {
    public Develop(int property) {
        super(property);
        ability = ability;
    }

    @Override
    public void execute() {
        if (property >= 500) {
            property -= 500;
            System.out.println("자기 개발을 하여 능력치가 1 증가하였습니다.");
            ability++;
        } else {
            System.out.println("재산이 부족하여 자기 개발을 할 수 없습니다.");
        }

    }
}