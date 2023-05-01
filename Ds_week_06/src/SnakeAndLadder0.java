import java.util.Scanner;
import java.util.Random;

class Player {
	String name; // 플레이어의 이름
	int startPos; // 게임 내의 플레이어의 시작 지점
	int endPos; // 게임 내의 플레이어의 끝 지점
	int currentPos; // 게임 내의 플레이어의 현재 위치
	int[] head = {8, 19, 32, 97, 88, 56}; // 사다리 아랫 부분의 숫자들과 뱀의 머리 부분의 숫자들의 배열
	int[] tail = {55, 76, 92, 59, 33, 4}; // 사다리 윗 부분의 숫자들과 뱀의 꼬리 부분의 숫자들의 배열
	
	public Player(String name, int initialValue, int lastValue) { // 플레이어 생성자
		this.name = name;
		this.startPos = initialValue;
		this.endPos = lastValue;
		this.currentPos = this.startPos;
	}
	public String getPlayerName() { // 플레이어의 이름을 반환
		return this.name;
	}
	public void printPlayerInfo(int NumOfDice) { // 플레이어의 정보(굴린 주사위의 숫자와 현재 위치)
		System.out.println("Player " + this.name + " rolled " + "\'" + NumOfDice
				+ "\'" + " and moved to " + this.currentPos);
	}
	public static void printPlayerPosition(Player player1, Player player2) { // 각 플레이어의 상세 위치
		for(int i = 10; i > 0; i--) {
			for(int j = 1; j <= 10; j++) {
				if(player1.currentPos == (i - 1) * 10 + j) {
					System.out.print(player1.getPlayerName() + " ");
				} 
				else if(player2.currentPos == (i - 1) * 10 + j) {		
					System.out.print(player2.getPlayerName() + " ");
				} 
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
	}
	public void movePlayer(int NumOfDice) { // 주사위의 숫자를 받아 플레이어의 위치를 움직임
		this.currentPos += NumOfDice;
	}
	public int printPlayerPos() { // 플레이어의 현재 위치 반환
		return this.currentPos;
	}
	public void resetPlayer() { // 플레이어의 현재 위치를 시작 지점으로 초기화
		this.currentPos = this.startPos;
	}
	public static int printAvgOfDice(int saveCount, int NumOfTimes) { // 게임 내에서 굴린 주사위의 횟수의 평균값 반환
		if(NumOfTimes == 1) {
			return saveCount;
		} 
		else {
			return saveCount / NumOfTimes;
		}
	}
	// 튜토리얼일 경우에는 사용되지 않고 메인 게임에서만 사용됨
	public void sendPlayer() { // 플레이어가 사다리 또는 뱀을 만났을 경우 플레이어의 위치 전환
		for(int i = 0; i < this.head.length; i++) {
			if(this.currentPos == head[i]) {
				if(i <= 3) {
					System.out.print(this.name + " meets a ladder!");
				} 
				else {
					System.out.print(this.name + " meets a snake!");
				}
				System.out.print(" -> ");
				
				this.currentPos = tail[i];
				
				System.out.println(this.name + " moved " + head[i] + 
						" to " + tail[i] + "\n");
			}
		}
	}
}
public class SnakeAndLadder0 {
	public static void MainGame(int num) { 
		int[] Arr100 = new int[100]; // 배열의 크기가 100인 배열 생성
		int NumOfTimes; // 진행할 게임의 횟수
		int NumOfDiceA; // 플레이어 A가 굴린 주사위의 숫자
		int NumOfDiceB; // 플레이어 B가 굴린 주사위의 숫자
		int count = 0; // 게임 당 각 플레이어가 굴린 주사위의 횟수. 게임이 끝나면 saveCount에 저장
		int saveCount = 0; // 모든 게임을 진행하는 동안 각 플레이어가 굴린 주사위의 횟수
		
		for(int i = 0; i < Arr100.length; i++) { // 배열에 1부터 100까지의 자연수를 넣음
			Arr100[i] = i + 1;
		}
		Player playerA = new Player("A", Arr100[0], Arr100[Arr100.length - 1]); // 플레이어 A 생성
		Player playerB = new Player("B", Arr100[0], Arr100[Arr100.length - 1]); // 플레이어 B 생성
		
		System.out.print("Enter the number of games to play : ");
		
		Scanner inputNumOfTimes = new Scanner(System.in);
		NumOfTimes = inputNumOfTimes.nextInt(); // 진행할 게임의 횟수를 입력받음
		System.out.println();
		
		for(int i = 1; i <= NumOfTimes; i++) {
			System.out.println("<<" + i + "th play>>");
			System.out.println();
			
			playerA.resetPlayer();
			playerB.resetPlayer();
			
			count = 0;
			
			// 각 플레이어의 위치가 100보다 작을 동안 진행
			while((playerA.printPlayerPos() < Arr100[Arr100.length - 1]) && 
					(playerB.printPlayerPos() < Arr100[Arr100.length - 1])) {
				count++;
				
				Random rand = new Random();
				// 플레이어 A가 굴린 주사위의 숫자를 1~6의 랜덤 숫자로 받음
				NumOfDiceA = (rand.nextInt(5)+1); 
				playerA.movePlayer(NumOfDiceA);
				// 플레이어 B가 굴린 주사위의 숫자를 1~6의 랜덤 숫자로 받음
				NumOfDiceB = (rand.nextInt(5)+1);
				playerB.movePlayer(NumOfDiceB);
				
				System.out.println("<" + count + "th dice>");
				
				if(num == 1) { // 튜토리얼이 아닌 메인 게임일 경우 실행됨
					playerA.sendPlayer();
					playerB.sendPlayer();
				}
				playerA.printPlayerInfo(NumOfDiceA);
				playerB.printPlayerInfo(NumOfDiceB);
				
				Player.printPlayerPosition(playerA, playerB);
				System.out.println();
				
				// 플레이어 A의 위치가 100이상이 되었을 경우 승자는 플레이어 A
				if(playerA.printPlayerPos() >= Arr100[Arr100.length - 1]) {
					System.out.println("The winner is player" + 
							playerA.getPlayerName());
					System.out.println();
					
					saveCount += count;
					
					continue;
				} 
				// 플레이어 B의 위치가 100이상이 되었을 경우 승자는 플레이어 B
				else if(playerB.printPlayerPos() >= Arr100[Arr100.length - 1]) {
					System.out.println("The winner is player" + 
							playerB.getPlayerName());
					System.out.println();
					
					saveCount += count;
					
					continue;
				}
			}
		}
		System.out.println("Total number of dice rolled per game : " +
				saveCount);
		System.out.println("Average number of dice rolled per game : " + 
		Player.printAvgOfDice(saveCount, NumOfTimes));
		System.out.println();
	}
	public static void main(String[] args) {
		int Enter0or1; // 튜토리얼의 진행 여부에 따른 0 또는 1을 입력받을 변수
		int Enter1_0or1; // 튜토리얼이 끝나고 메인 게임의 진행 여부에 따른 0 또는 1을 입력받을 변수
		
		System.out.println("Welcome to the Snake & Ladder game!");
		System.out.println();
		System.out.print("Enter 0 if you want to play the tutorial, " +
				"or 1 : ");
		
		Scanner input0or1 = new Scanner(System.in);
		Enter0or1 = input0or1.nextInt();
		System.out.println();
		
		if(Enter0or1 == 0) {
			System.out.println("Play the tutorial");
			System.out.println();
		
			MainGame(Enter0or1);
			
			System.out.print("The tutorial is over. Want to play the "
					+ "main game?\n" + "Enter 0 if you want to play "
							+ "main game, or 1 : ");
			
			Scanner input1_0or1 = new Scanner(System.in);
			Enter1_0or1 = input1_0or1.nextInt();
			System.out.println();
			
			if(Enter1_0or1 == 0) {
				System.out.println("Play the main game");
				System.out.println();
				
				MainGame(1);
			} 		
		} 
		else {
			System.out.println("Play the main game");
			System.out.println();
			
			MainGame(1);
		}
		System.out.println("Game Over. Thank you for playing");
	}
}