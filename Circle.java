
/**
 * クラス Circle の注釈をここに書きます.
 * 
 * @author (2018243144 노무라타카미치 2018190042 모리모토 케이)
 * @version (20190902)
 */
public class Circle implements Shape
{
    public int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    public void draw(){
        redrew();
    }
    public double getArea(){
        return this.radius * this.radius * PI;
    }
    public void redrew(){
        System.out.println("반지름이 "+ this.radius +"인 원입니다.");
    }
}
