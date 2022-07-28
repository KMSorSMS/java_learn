package chapter6;
/**
 * 这里是牌的信息
 * 因为牌的总量是54张，无法更改
 * 共有4种花色每种13张和大小王
 * 没有大小王在梭哈里面
 */

public enum Cards {
    FANG_KUAI(new int[] {0,1,1,1,1,1,1,1,1,1,1,1,1,1}),MEI_HUA(new int[] {0,1,1,1,1,1,1,1,1,1,1,1,1,1}),HONG_TAO(new int[] {0,1,1,1,1,1,1,1,1,1,1,1,1,1}),HEI_TAO(new int[] {0,1,1,1,1,1,1,1,1,1,1,1,1,1});
    //需要的牌种类
    //按照这样的顺序设置长度为14的数组，不要0，private String[] cards = {"A","2","3","4","5","6","7","8","9","10","J","Q","k"};
    private int[] cards;
    private Cards(int[] cards){
        this.cards = cards;
    }
    /**
     * 和玩家配合，它调用成功为true后，桌面会用giveCards方法设置玩家手牌，调用玩家的setcards进行玩家信息改动
     * @param color 发给玩家的牌的颜色
     * @param card 发给玩家的牌的数字
     * @return 是否能够完成出牌
     */
    public static boolean popCards(Cards color,int card){
        if(color.cards[card]==1){
            color.cards[card] = 0;
            return true;
        }
        else{
            return false;
        }
    }
}
