package Flyweight;

import sun.plugin.dom.core.CoreConstants;

/**
 * Created by xdcao on 2017/8/31.
 */
public abstract class IgoChessman {

    public abstract String getColor();

    public void display(Coordinates coordinates){
        System.out.println("棋子颜色： "+this.getColor()+" ,棋子位置： "+coordinates.getX()+":"+coordinates.getY());
    }

}
