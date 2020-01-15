package jp.ac.uryukyu.ie.e195720;

import java.awt.*;

public class Enemy extends Battle {
    Enemy(String name, int maximumHP, int attack, Image img, int x) {
        super(name, maximumHP, attack, img, x);
    }

    @Override
    public void wounded(int damage) {
        String name = getName();
        int hp = getHp();
        hp -= damage;
        setHp(hp);
        if (hp <= 0) {
            setDead(true);
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}