package jp.ac.uryukyu.ie.e195720;

import javax.swing.JPanel;
import java.awt.*;

public class Paint extends JPanel {
    //画像のパス
    String pass = "/Users/e195720/Image/";
    Image slime = Toolkit.getDefaultToolkit().getImage(pass + "boss.png");
    Image dog = Toolkit.getDefaultToolkit().getImage(pass + "kerube.png");
    Image pokasuka = Toolkit.getDefaultToolkit().getImage(pass + "pokasuka.jpg");
    // パネルサイズ
    private static final int WIDTH = 800;
    private static final int HEIGHT = 240;
    //画像の座標
    int M = 780;  //Mの初期座標
    int E = 20;   //Eの初期座標
    int Mw = 780; //Mの勝利条件
    int Ew = 20;  //Eの勝利条件

    public Paint() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(E != M - 120){
            g.drawImage(slime,E,50,100,100,this);
            g.drawImage(dog,M,50,-100,100,this);
            sleep();
        }else{
            g.drawImage(pokasuka,E,50,100,100,this);

        }
    }
    public void sleep() {
        repaint();
        E = E + 1;
        M = M -1;
        try {
            Thread.sleep(10); //　アニメーションらしくするため
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

