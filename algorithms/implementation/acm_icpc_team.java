import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.math.BigInteger;

class Solution {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numOfPeople = scanner.nextInt();
    int numOfTopics = scanner.nextInt();
    BigInteger[] familiarity = new BigInteger[numOfPeople];
    int maxBitCount = 0;
    int maxScoreCount = 0;
    BigInteger score;

    for(int i=0; i<numOfPeople; i++) {
        familiarity[i] = scanner.nextBigInteger(2);
    }

    for(int i=0; i<familiarity.length-1; i++) {
        for(int j=i+1; j<=familiarity.length-1; j++) {
            score = familiarity[i].or(familiarity[j]);
            int bitCount = score.bitCount();
            if(bitCount > maxBitCount) {
                maxBitCount = bitCount;
                maxScoreCount = 1;
            } else if(bitCount == maxBitCount) {
                maxScoreCount++;
            }
        }
    }
    System.out.println(maxBitCount);
    System.out.println(maxScoreCount);
}
}