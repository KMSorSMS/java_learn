package chapter7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 问题：
 * 1、没有对手
 * 2、没有判断输赢
 * 3、没有防止重复下棋
 */

public class Wuzi {
    // 定义棋盘的大小
    private static int Board_Size = 15;
    // 定义一个二维数组来充当棋盘
    private String[][] board;

    public void initBoard() {
        // 初始化棋盘数组
        board = new String[Board_Size][Board_Size];
        // 把每个元素都赋为'十';用于在控制台画出棋盘
        for (int i = 0; i < Board_Size; i++) {
            for (int j = 0; j < Board_Size; j++) {
                board[i][j] = "十";
            }
        }
    }

    // 在控制台输出棋盘的方法
    public void printBoard() {
        // 打印每个数组元素
        for (int i = 0; i < Board_Size; i++) {
            for (int j = 0; j < Board_Size; j++) {
                // 打印数组元素后不换行，因为是一行行的打印
                System.out.print(board[i][j]);
            }
            // 每打印完一行数组元素后输出一个换行符
            System.out.print("\n");
        }
    }

    // 检测有无一方获胜
    /**
     * 思路：
     * 对每一行进行遍历，遇到有子的就开始比较判断,从四个方向判断：横、竖、左斜、右斜
     * 
     * @return 是否获胜
     * @param chess:是去判断哪类棋子是否获胜了
     * @param wz:对应的棋盘
     */
    public boolean Check_board(String chess, Wuzi wz) {
        // 记录有几个连子
        int count = 1;
        // 先遍历找有这个chess的
        for (int i = 0; i < Board_Size; i++) {
            for (int j = 0; j < Board_Size; j++) {
                // 说明找到了一个棋子，开始要进入判断了
                if (wz.board[i][j] == chess) {
                    // 不能改变j、i的值，去向右查找时要用temp1、向下temp2
                    // 而且每次使用temp时都要归位
                    int temp1 = j;
                    int temp2 = i;

                    // 横方向，因为我是从左到右从上到下去遍历的，所以只用向右边去检测就可以
                    // 首先此时j要离边界有5格，然后再去横向索引判断
                    if ((Board_Size - 1) - j + 1 >= 5) {
                        while (wz.board[i][++temp1] == chess) {
                            count++;
                            // count代表了有多少是连着的
                            if (count >= 5) {
                                return true;
                            }
                        }
                    }
                    // count 归零,temp归位
                    count = 1;
                    temp1 = j;
                    temp2 = i;

                    // 竖方向，与横类似
                    // 首先此时i要离边界有5格，然后向下去检测
                    if ((Board_Size - 1) - i + 1 >= 5) {
                        while (wz.board[++temp2][j] == chess) {
                            count++;
                            if (count >= 5) {
                                return true;
                            }
                        }
                    }
                    count = 1;
                    temp1 = j;
                    temp2 = i;
                    // 左斜方向
                    // 应该是向右下去探索，即i++,j++往右下走
                    // 同样首先一定有往下能有5格，往右能有5格
                    if ((Board_Size - 1) - j + 1 >= 5 && (Board_Size - 1) - i + 1 >= 5) {
                        while (wz.board[++temp2][++temp1] == chess) {
                            count++;
                            if (count >= 5) {
                                return true;
                            }
                        }
                    }
                    count = 1;
                    temp1 = j;
                    temp2 = i;
                    // 右斜方向
                    // 应该是向左探向下探，即i++,j--往左下走
                    if ((Board_Size - 1) - i + 1 >= 5 && j + 1 >= 5) {
                        while (wz.board[++temp2][--temp1] == chess) {
                            count++;
                            if (count >= 5) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        Wuzi wz = new Wuzi();
        wz.initBoard();
        wz.printBoard();
        // 这是用于获取键盘输入的方法
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = null;
        // br.readLine():每当在键盘上输入一行内容后按回车建，刚输入的内容将被br读取到
        // 加入两个人对下：那么要做到交替可以想成一个轮回
        do {
            int xPos;
            int yPos;
            String[] posStrArr;
            // String regex = "\\d+,\\d+";
            // 保证必须输出在没有下棋的点
            // do {
            // System.out.println("请龘方输入下棋的坐标，应以x,y的格式:");
            // do{
            // System.out.println("请输入正确的格式：");
            // inputStr = br.readLine();
            // }while(!(inputStr.matches(regex)));
            // // 将用户输入的字符串以逗号(,)作为分隔符，分割为两个字符串
            // posStrArr = inputStr.split(",");
            // // 将2个字符串转换成用户下棋的坐标
            // xPos = Integer.parseInt(posStrArr[0]);
            // yPos = Integer.parseInt(posStrArr[1]);
            // } while (xPos>Board_Size||yPos>Board_Size||wz.board[yPos - 1][xPos - 1] !=
            // "十");

            // 采用异常处理来规范点
            boolean flag = false;
            do {
                try {
                    System.out.println("请龘方输入下棋的坐标，应以x,y的格式:");
                    inputStr = br.readLine();
                    posStrArr = inputStr.split(",");
                    xPos = Integer.parseInt(posStrArr[0]);
                    yPos = Integer.parseInt(posStrArr[1]);
                    // 把对应的数组元素赋值为"龘"
                    wz.board[yPos - 1][xPos - 1] = "龘";
                    flag = false;

                } catch (Exception e) {
                    flag = true;
                }
            } while (flag);
            wz.printBoard();
            // 判断获胜没有
            if (wz.Check_board("龘", wz)) {
                System.out.println("龘win!");
                break;
            }
            // 第二方下棋
            // do {
            //     System.out.println("请龜方输入下棋的坐标，应以x,y的格式:");
            //     do {
            //         System.out.println("请输入正确的格式：");
            //         inputStr = br.readLine();
            //     } while (!(inputStr.matches(regex)));
            //     // 同样将用户输入的字符串以逗号(,)分隔为两个字符串
            //     posStrArr = inputStr.split(",");
            //     // 将2个字符串转换成int型的坐标
            //     xPos = Integer.parseInt(posStrArr[0]);
            //     yPos = Integer.parseInt(posStrArr[1]);
            // } while (xPos > Board_Size || yPos > Board_Size || wz.board[yPos - 1][xPos - 1] != "十");
            // // 将对应的数组元素赋值为"龜"
            // wz.board[yPos - 1][xPos - 1] = "龜";

            do {
                try {
                    System.out.println("请龜方输入下棋的坐标，应以x,y的格式:");
                    inputStr = br.readLine();
                    posStrArr = inputStr.split(",");
                    xPos = Integer.parseInt(posStrArr[0]);
                    yPos = Integer.parseInt(posStrArr[1]);
                    // 把对应的数组元素赋值为"龘"
                    wz.board[yPos - 1][xPos - 1] = "龜";
                    flag = false;

                } catch (Exception e) {
                    flag = true;
                }
            } while (flag);

            wz.printBoard();
            // 判断获胜没有
            if (wz.Check_board("龜", wz)) {
                System.out.println("龜win!");
                break;
            }

        } while (true);
    }
}
