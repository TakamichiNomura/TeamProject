
/**
 * 四角形のクラス
 * 
 * @author (2018243144 노무라타카미치 2018190042 모리모토 케이)
 * @version (20190902)
 */
public class Rect implements Shape
{
    public int length,side;
    public Rect(int length,int side){
        this.length = length;
        this.side = side;
    }
    public void draw(){
        System.out.println(this.length +"x"+ this.side +"크기의 사각형입니다.");
    }
    public double getArea(){
        return this.length * this.side;
    }
}
