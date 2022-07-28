package chapter6;

public class Gamer {
    // 花色按照：方、梅、红、黑、大王、小王定义
    private String[] cards;
    private static String[] colors, cards_sort;
    // 玩家当前的手牌数量
    private int now_number;
    //定义玩家当前的状态，是否放弃，放弃了就是false，继续就是true
    private boolean Now_state = true;
    //游戏人数
    private static int gamerNumsMax;
    //把玩家实例包括他们的位置信息放在数组里面，数组从1开始
    private static Gamer[] gamers;
    private static int gamerNumsPre = 0;
    // /*实例初始化块，每个人的手牌都是这样最开始为空,
    // 普通花色为14个空间，第一个0项不要
    // */
    // {
    // cards = new int[7][];
    // for(int i=1;i<=4;i++){
    // cards[i] = new int[14];
    // }
    // //大小王只存在有没有
    // cards[5] = new int[2];
    // cards[6] = new int[2];
    // }不需要了，因为梭哈里面根本就没有大小王,4种花色每种13张牌
    static {
        colors = new String[] { "方块", "梅花", "红桃", "黑桃" };
        cards_sort = new String[] { "0", "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k" };
        gamerNumsMax = 6;
        gamers = new Gamer[gamerNumsMax+1]; 
    }

    {
        // 存储5张牌，每张牌都有花色和大小,奇数时花色，偶数是大小
        // 即now_number*2是当前最前面的大小，-1是对应花色
        cards = new String[10];
        now_number = 0;
        
    }
/**
 * 将加入在私有的gamer数组里面的实例按照index的次序返回
 * @param index
 * @return
 */
    public Gamer GetGamerInTurn(int index){
       return Gamer.gamers[index];
    }
    /**
     * 得到现在有多少的玩家
     * @return
     */
    public int GetGamersNumber(){
        return Gamer.gamerNumsPre;
    }

    public Gamer returnGamer(){
        if(Gamer.gamerNumsPre+1<=gamerNumsMax){
            return new Gamer();
            }
        else{
            System.out.println("人已经满了");
            return null;
        }
    }

    private Gamer(){
        Gamer.gamerNumsPre++;
        gamers[gamerNumsPre] = this;
    }
/**
 * 表示玩家放弃加注，撤退了
 */
    public void GiveUp(){
        this.Now_state = false;
    }

    /**
     * 用户实例接受到牌的方法，在手上牌的颜色和数量
     * 
     * @param color
     * @param send_card
     */
    public boolean setCards(Cards color, int send_card) {
        if (now_number <= 5) {
            switch (color) {
                case FANG_KUAI:
                    now_number++;
                    this.cards[2 * now_number - 1] = "方块";
                    this.cards[2 * now_number] = cards_sort[send_card];
                    return true;
                case MEI_HUA:
                    now_number++;
                    this.cards[2 * now_number - 1] = "梅花";
                    this.cards[2 * now_number] = cards_sort[send_card];
                    return true;
                    case HONG_TAO:
                    now_number++;
                    this.cards[2 * now_number - 1] = "红桃";
                    this.cards[2 * now_number] = cards_sort[send_card];
                    return true;
                case HEI_TAO:
                    now_number++;
                    this.cards[2 * now_number - 1] = "黑桃";
                    this.cards[2 * now_number] = cards_sort[send_card];
                    return true;
            }
        }
        return false;
    }

}
