package chapter6;

import java.util.Set;

import javax.swing.text.Position;

public enum Trial_implement implements Trial {
    Player1, Player2, Player3, Player4, Play5;

    public String name;
    private boolean state = true;
    // private String[] card = { "0", "0", "0", "0", "0" };
    private int num_card = 0;
    private static int round = 1;
    // private final int position;
    // private static int all_pos = 0;
    private final String[] critical_card = new String[Trial.MAX];
    {
        Deliver_card();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void giveup() {
        this.state = false;
    }
    // public Trial_implement(String name) {
    // this.name = name;
    // if (Trial_implement.all_pos <= 5) {
    // // position = all_pos;
    // // all_pos++;
    // } else {
    // position = 0;
    // }

    // }

    // private Trial_implement() {
    // // if (Trial_implement.all_pos <= 5) {
    // // // position = all_pos;
    // // // all_pos++;
    // // } else {
    // // position = 0;
    // // }
    // this.name = "null";
    // System.out.println("Not finish yet");
    // }

    public void out() {
        for (var card : critical_card)
            System.out.println(card);
    }

    @Override
    public String Show_card() {
        return "not complete";
    }

    @Override
    public void Deliver_card() {
        critical_card[0] = "2";
        num_card++;
    }

    public static void main(String[] args) {
        Trial_implement try1 = Enum.valueOf(Trial_implement.class, "Player1");
        try1.out();
    }

}
