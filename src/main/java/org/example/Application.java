package org.example;

import java.util.Scanner;

public class Application {

    public static int property = 10000;
    public static int ability = 1;
    public static int businessAbility = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "============================= 지금부터 100만원 벌기 게임을 시작합니다. ================================";
        String str2 = "============================ 당신이 가진 것은 오직 1만원과 몸뚱아리 뿐 =================================";
        String str3 = "== 정해진 방법따윈 없습니다. 수단과 방법을 가리지 말고 가장 빠르게 100만원을 벌어주시기 바랍니다. 그럼 시작합니다. ==";
        Opening.printStringByCharacter(str);
        System.out.println();
        Opening.printStringByCharacter(str2);
        System.out.println();
        Opening.printStringByCharacter(str3);
        System.out.println();

        long startTime = System.currentTimeMillis();

        while (true) {
            System.out.println("==== 현재 상태 ====");
            System.out.println("재산: " + property);
            System.out.println("능력치: " + ability);
            System.out.println("사업능력: " + businessAbility);
            System.out.println("==================");

            if(property >= 1000000){
                long elapsedTime = System.currentTimeMillis() - startTime;
                long hours = elapsedTime / (1000 * 60 * 60);
                long minutes = (elapsedTime % (1000 * 60 * 60)) / (1000 * 60);
                long seconds = ((elapsedTime % (1000 * 60 * 60)) % (1000 * 60)) / 1000;
                System.out.println("축하드립니다. "+ hours + "시간 " + minutes + "분 " + seconds + "초만에 백만원을 달성하셨습니다.");
                break;
            }


            System.out.println("1. 일하기");
            System.out.println("2. 자기 개발하기");
            System.out.println("3. 사업하기");
            System.out.println("4. 복권 구매하기");
            System.out.println("9. 포기 하기");
            System.out.print("선택하세요: ");
            int choice = sc.nextInt();

            Action action = null;

            switch (choice) {
                case 1:
                    action = new Work(property);
                    break;
                case 2:
                    action = new Develop(property);
                    break;
                case 3:
                    action = new Business(property);
                    break;
                case 4:
                    action = new BuyLottery(property);
                    break;
                case 9:
                    System.out.println("게임을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
                    continue;
            }

            action.execute();
        }
    }
}

