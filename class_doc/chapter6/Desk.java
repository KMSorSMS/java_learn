package chapter6;

public class Desk implements GameDesk {


   /**
    * @param gamer
    * @param color 牌的花色
    * @param card  牌的牌面
    */
    public boolean sendCards(Gamer gamer,Cards color,int card) {
        //如果牌内自己有的话，就能发出来, 并且调用Gamer的方法
        if(Cards.popCards(color, card)&&gamer.setCards(color, card)){
            return true;
        }
        return false;
    }
    public void deskSendAmongGamer(){
        
    }
}
