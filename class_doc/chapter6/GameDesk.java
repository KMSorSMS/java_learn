package chapter6;

public interface GameDesk {
    /**
     * 发牌
     * 需要实现：
     * 控制从谁开始发牌，不要发牌给放弃的人，并修改桌上剩下的牌
     */
    boolean sendCards(Gamer gamer,Cards color,int card);
    // /**
    //  * 获取桌上剩下的牌的信息
    //  * @return 返回桌上还有的所有牌和花色
    //  */
    // Cards[] getCards();
    // /**
    //  * 改变桌面的牌的数量，（因为发牌或者出牌；
    //  */
    // void setCards();
    public void deskSendAmongGamer();


}
