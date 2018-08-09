import java.util.*;
public class MineField{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int counter = 0;
        char[][] mineField = new char[17][32];
        for(int i = 0; i < 32; i++){
            mineField[0][i] = 'A';
            mineField[16][i] = 'A';
        }
        for(int i = 1; i <= 15; i++){
            String line = kb.nextLine();
            char[] dummy = line.toCharArray();
            mineField[i][0] = 'A';
            mineField[i][31] = 'A';
            for(int m = 1; m <= 30; m++)
                mineField[i][m] = dummy[m - 1];
        }
        System.out.println(Arrays.deepToString(mineField).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        for(int i = 1; i < 16; i++){
            counter = 0;
            for(int j = 1; j < 31; j++){
                if(mineField[i][j] == '.'){
                    if(mineField[i - 1][j + 1] == '*')
                        counter++;
                    if(mineField[i - 1][j] == '*')
                        counter++;
                    if(mineField[i - 1][j - 1] == '*')
                        counter++;
                    if(mineField[i][j - 1] == '*')
                        counter++;
                    if(mineField[i][j + 1] == '*')
                        counter++;
                    if(mineField[i + 1][j - 1] == '*')
                        counter++;
                    if(mineField[i + 1][j] == '*')
                        counter++;
                    if(mineField[i + 1][j + 1] == '*')
                        counter++;
                    mineField[i][j] = (char)counter;
                }
            }
        }
        System.out.println(Arrays.deepToString(mineField).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        String dummy = "A";
        for(int i = 1; i <= 15; i++){
            for(int j = 1; j <= 30; j++){
                dummy += mineField[i][j];
            }
            System.out.println(dummy.substring(1));
            dummy = "";
        }
    }
}
      