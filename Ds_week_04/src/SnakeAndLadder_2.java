import java.util.Scanner;
import java.util.Random;

class Player {

    String name;
    int startPos;
    int endPos;
    int currentPos;
    int[] head = { 8, 19, 32, 97, 88, 56 };
    int[] tail = { 55, 76, 92, 59, 33, 4 };

    public Player(String name, int initialValue, int lastValue) {
        this.name = name;
        this.startPos = initialValue;
        this.endPos = lastValue;
        this.currentPos = this.startPos;
    }

    String printPlayerName() {
        return this.name;
    }

    void printPlayerInfo(String playerA, int currentPos_A, String PlayerB, int currentPos_B) {
        // 플레이어의 이름 현재값을A,B로 나누어서매개변수로 받아와서

        for (int i = 10; i > 0; i--) {
            for (int j = 1; j <= 10; j++) {
                if (currentPos_A == (i - 1) * 10 + j) { // 배열출력중 A와 같다면 A를
                    System.out.printf("A ");
                } else if (currentPos_B == (i - 1) * 10 + j) {
                    System.out.printf("B ");
                } else {
                    System.out.print("- ");// 아무것도 아니라면 - 을 출력했습니다.
                }

            }
            System.out.println();
        }
    }

    void movePlayer(int NumOfDice) {
        this.currentPos += NumOfDice;
    }

    int printPlayerPos() {
        return this.currentPos;
    }

    void resetPlayer() {
        this.currentPos = this.startPos;
    }

    int printAvgOfDice(int saveCount, int NumOfTimes) {
        if (NumOfTimes == 1) {
            return saveCount;
        } else {
            return saveCount / NumOfTimes;
        }
    }

    void sendPlayer() {
        for (int i = 0; i < this.head.length; i++) {

            if (this.currentPos == head[i]) {
                if (i <= 3)
                    System.out.print(this.name + " meets a Ladder!");
                else
                    System.out.print(this.name + " meets a Snake!");
                System.out.print(" -> ");
                this.currentPos = tail[i];
                System.out.println(this.name + " moved " + head[i] + " to " + tail[i] + "\n");
            }
        }
    }

}

public class SnakeAndLadder_2 {

    public void MainGame(int n) {

        int[] Arr100 = new int[100];
        int NumOfTimes;
        int NumOfDiceA;
        int NumOfDiceB;
        int count = 0;
        int saveCount = 0;
        int currentPos_A = 0; // 새로선언
        int currentPos_B = 0; // 새로선언

        for (int i = 0; i < Arr100.length; i++) {
            Arr100[i] = i + 1;
        }

        Player playerA = new Player("A", Arr100[0], Arr100[Arr100.length - 1]);
        Player playerB = new Player("B", Arr100[0], Arr100[Arr100.length - 1]);

        System.out.print("Enter the number of games to play : ");

        Scanner sc = new Scanner(System.in);

        NumOfTimes = sc.nextInt();

        System.out.println();

        for (int i = 1; i <= NumOfTimes; i++) {
            System.out.println("<<" + i + "th play>>");
            System.out.println();

            playerA.resetPlayer();
            playerB.resetPlayer();

            count = 0;
            while ((playerA.printPlayerPos() < Arr100[Arr100.length - 1])
                    && (playerB.printPlayerPos() < Arr100[Arr100.length - 1])) {

                count++;
                Random rd = new Random();

                NumOfDiceA = rd.nextInt(5) + 1;
                playerA.movePlayer(NumOfDiceA);
                NumOfDiceB = rd.nextInt(5) + 1;
                playerB.movePlayer(NumOfDiceB);

                System.out.println("<" + count + "th dice>");

                if (n == 1) {
                    playerA.sendPlayer();
                    playerB.sendPlayer();
                }

                System.out.println("");

                currentPos_A = playerA.printPlayerPos();// printPlayerPos을 통해서 각각 플레이어의 currentPos_A을 만들고 현재값을저장했습니다.
                currentPos_B = playerB.printPlayerPos(); // player.getcurrentPos_A로 만들려고했는데 코드 같아서 printPlayerPos사용했습니다.

                System.out.println("");
                System.out.println(
                        "Player " + playerA.name + " rolled a " + NumOfDiceA + " and moved to " + currentPos_A); // A와 B
                                                                                                                 // 나누기
                                                                                                                 // 위해
                                                                                                                 // sout
                                                                                                                 // main에서
                                                                                                                 // 출력하는
                                                                                                                 // 걸로했습니다.
                System.out.println(
                        "Player " + playerB.name + " rolled a " + NumOfDiceB + " and moved to " + currentPos_B); // 주사위를
                                                                                                                 // 돌려서
                                                                                                                 // 나온값과
                                                                                                                 // 현재
                                                                                                                 // 위치
                                                                                                                 // 출력
                System.out.println("");

                playerA.printPlayerInfo(playerA.name, currentPos_A, playerB.name, currentPos_B);
                // 플레이어의 각각의 이름과 현재 위치를 printPlayerInfo()로 전달해서 이부분에서 배열형식로 출력되게 만들었습니다.
                // 만약 위에서 사다리나 뱀을 만났다면 만난것까지 적용해서 배열로 출력했습니다.

                System.out.println();

                if (playerA.printPlayerPos() >= Arr100[Arr100.length - 1]) {
                    System.out.println("The winner is " + "player" + playerA.printPlayerName() + " who rolled the dice "
                            + count + " times!");
                    System.out.println();
                    saveCount += count;
                    continue;
                }

                else if (playerB.printPlayerPos() >= Arr100[Arr100.length - 1]) {
                    System.out.println("The winner is " + "player" + playerB.printPlayerName() + " who rolled the dice "
                            + count + " times!");
                    System.out.println();
                    saveCount += count;
                    continue;
                }
            }
        }
        System.out.println("Total number of dice rolled per game : " + saveCount);
        System.out.println("Average number of dice rolled per game : " + playerA.printAvgOfDice(saveCount, NumOfTimes));
        System.out.println();
    }

    public static void main(String[] args) {

        int Enter0or1;
        int Enter1_0or1;
        SnakeAndLadder_2 s = new SnakeAndLadder_2();

        System.out.println("Welcome to the Snake & Ladder game!");
        System.out.println();

        System.out.print("Enter 0 if you want to play the tutorial, " + "or 1 : ");

        Scanner Input0or1 = new Scanner(System.in);

        Enter0or1 = Input0or1.nextInt();

        System.out.println();

        if (Enter0or1 == 0) {

            System.out.println("Play the tutorial");
            System.out.println();

            System.out.print("The tutorial is over. Want to play themin game?\n"
                    + "Enter 0 if you want to play this game, or 1 : ");

            Scanner Input1_0or1 = new Scanner(System.in);

            Enter1_0or1 = Input1_0or1.nextInt();

            System.out.println();

            if (Enter1_0or1 == 0) {
                System.out.println("Play the main game");
                System.out.println();

                s.MainGame(1);
            }
        }

        else {
            System.out.println("Play the main game");
            System.out.println();

            s.MainGame(1);
        }

        System.out.println("Game Over. Thank you for playing");
    }
}
