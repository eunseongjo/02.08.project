package org.example;

import java.util.Random;

import static org.example.Application.businessAbility;
import static org.example.Application.property;

public class Business extends Action {

    public Business(int property) {
        super(property);
        businessAbility = businessAbility;
    }

    @Override
    public void execute() {
        if (property >= 2000) {
            property -= 2000;
            Random random = new Random();
            double chance = random.nextDouble();
            if (chance < 0.01 * businessAbility) {
                int profit = 200000;
                property += profit;
                System.out.println("사업에 성공하여 " + profit + " 만큼의 수익을 얻었습니다.");
                businessAbility++;
            } else {
                System.out.println("사업에 실패하였습니다.");
            }

        } else {
            System.out.println("재산이 부족하여 사업을 할 수 없습니다.");
        }
    }
}