package jp.ac.uryukyu.ie.e195720;

import java.awt.*;

public class Battle {
    private String name;
    private int hp;
    private int attack;
    Image img;
    private int Coordinate;
    private boolean dead;

    Battle(String name, int maximumHP, int attack, Image img,int Coordinate){
        this.name = name;
        hp = maximumHP;
        this.attack = attack;
        this.img = img;
        this.Coordinate = Coordinate;
        dead = false;
    }
    boolean getDead() { return !dead; }
    void setDead(boolean dead){ this.dead = dead;}
    String getName() { return name;}
    int getHp() { return hp;}
    void setHp(int hp){ this.hp = hp;}

    public void fight(Battle opponent){
        int damage = (int) (Math.random() * attack);
        if (hp > 0){
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        String name = getName();
        hp -= damage;
        if (hp <= 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
    public void move(){
        Coordinate--;
    }

}

