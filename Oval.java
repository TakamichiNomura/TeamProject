
/**
 * 内接円のクラス
 * 
 * @author (2018243144 노무라타카미치 2018190042 모리모토 케이)
 * @version (20190902)
 */
public class Oval implements Shape
{
    public double first,secound;
    public Oval(double first,double secound){
        this.first = first;
        this.secound = secound;
    }
    public void draw(){
        System.out.println(this.first +"x"+ this.secound +"에 내접하는 타원입니다.");
    }
    public double getArea(){
        return this.first * this.secound * PI;
    }
}
