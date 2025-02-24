
public class sparseArray {
    public static void main(String[] args) {
        //生成原始数组
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][4] = 2;
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1[0].length; j++) {
                System.out.printf("%d\t",chessArr1[i][j]);
            }
            System.out.println();
        }
        //计算sum
        int sum = 0;
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1[0].length; j++) {
                if (chessArr1[i][j]!=0) {
                    sum++;
                }
            }
        }
        //创建稀疏数组并赋值
        int sparseArray[][] = new int[sum+1][3];
        sparseArray[0][0] = chessArr1.length;
        sparseArray[0][1] = chessArr1[0].length;
        sparseArray[0][2] = sum;
        int count = 1;
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1[0].length; j++) {
                if (chessArr1[i][j]!=0) {
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = chessArr1[i][j];
                    count++;
                }
            }
        }

        //打印稀疏数组
        for (int i = 0; i < sparseArray.length; i++) {
            for (int j = 0; j < sparseArray[0].length; j++) {
                System.out.printf("%d\t",sparseArray[i][j]);   
            }
            System.out.println();
        }

        //恢复原始数组
        int row = sparseArray[0][0];
        int col = sparseArray[0][1];
        int chessArr2[][] = new int[row][col];
        for (int i = 1; i < sparseArray.length; i++) {
            int r = sparseArray[i][0];
            int c = sparseArray[i][1];
            int val = sparseArray[i][2];
            chessArr2[r][c] = val;
        }
        
        //打印原始数组
        for (int i = 0; i < chessArr2.length; i++) {
            for (int j = 0; j < chessArr2[0].length; j++) {
                System.out.printf("%d\t",chessArr2[i][j]);
            }
            System.out.println();
        }
    }
    
}