
/**
 * インターフェース Shape のための注釈をここに書きます.
 * 
 * @author (2018243144 노무라 타카미치) 
 * @version (20190902)
 */
interface Shape{ 
    final double PI = 3.14; 
    void draw(); 
    double getArea(); 
    default public void redraw(){ 
        System.out.print("--- 다시 그립니다. "); 
        draw(); 
    }
}

