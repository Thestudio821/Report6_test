package jp.ac.uryukyu.ie.e195720;

import java.awt.*;
import javax.swing.*;

public class Main extends JFrame {
    public Main() {
        // タイトルを設定
        setTitle("ワンワン戦線");

        // メインパネルを作成してフレームに追加
        Paint panel = new Paint();
        Container contentPane = getContentPane();
        contentPane.add(panel);

        // パネルサイズに合わせてフレームサイズを自動設定
        pack();
    }

    public static void main(String[] args) {
        int M = 780;
        int E = 20;
        String pass = "/Users/e195720/Image/";
        Wanwan wanwan = new Wanwan("ワンワン",15,5,Toolkit.getDefaultToolkit().getImage(pass + "boss.png"),M);
        Enemy Enemy = new Enemy("スライム",10,3,Toolkit.getDefaultToolkit().getImage(pass + "boss.png"),E);

        Main frame = new Main();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        System.out.printf("%s vs. %s\n", wanwan.getName(), Enemy.getName());

        int turn = 0;
        while( Enemy.getDead() && wanwan.getDead()){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            wanwan.fight(Enemy);
            Enemy.fight(wanwan);
        }
        System.out.println("戦闘終了");
    }
}