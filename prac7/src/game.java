import java.util.ArrayDeque;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        ArrayDeque<Integer> playerOne = new ArrayDeque<Integer>();
        ArrayDeque<Integer> playerTwo = new ArrayDeque<Integer>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i<5;i++)
        {
            int num = scan.nextInt();
            playerOne.addLast(num);
        }


        for (int i = 0; i<5;i++)
        {
            int num = scan.nextInt();
            playerTwo.addLast(num);
        }


        int turn = 0;
        while(turn<=1000000)
        {
            turn++;
            int playerOneCard = playerOne.removeFirst();
            int playerTwoCard = playerTwo.removeFirst();

            if (Math.abs(playerTwoCard-playerOneCard)==9)
            {
                if (playerOneCard==0)
                {
                    playerOne.addLast(playerOneCard);
                    playerOne.addLast(playerTwoCard);
                }
                else
                {
                    playerTwo.addLast(playerOneCard);
                    playerTwo.addLast(playerTwoCard);
                }
            }
            else
            {
                if(playerOneCard<playerTwoCard)
                {
                    playerTwo.addLast(playerOneCard);
                    playerTwo.addLast(playerTwoCard);
                }
                else
                {
                    playerOne.addLast(playerOneCard);
                    playerOne.addLast(playerTwoCard);
                }
            }


            if (playerOne.isEmpty())
            {
                System.out.println("second " + turn);
                return;
            }

            if (playerTwo.isEmpty())
            {
                System.out.println("first  " + turn);
                return;
            }


        }
        System.out.println("botva");
        return;
    }

}
