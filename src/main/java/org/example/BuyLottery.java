package org.example;

import java.util.Random;
import static org.example.Application.property;

public class BuyLottery extends Action {
    public BuyLottery(int property) {
        super(property);
    }

    @Override
    public void execute() {
        if (property >= 1000) {
            property -= 1000;
            Random random = new Random();
            double chance = random.nextDouble();
            if (chance < 0.05) {
                property += 5000;
                System.out.println("축하합니다! 복권에 당첨되어 5000 만큼의 상금을 획득하셨습니다.");
            } else {
                System.out.println("아쉽지만 복권에 당첨되지 않았습니다.");
            }
        } else {
            System.out.println("재산이 부족하여 복권을 구매할 수 없습니다.");
        }
    }
}