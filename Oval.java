import java.math.BigDecimal;
/**
 * クラス Oval の注釈をここに書きます.
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
    BigDecimal bd1 = new BigDecimal(this.first);
    BigDecimal bd2 = new BigDecimal(this.secound);
    BigDecimal bd3 = new BigDecimal(PI);
    BigDecimal sum = bd1.multiply(bd2);
    BigDecimal result = sum.multiply(bd3);
    public void draw(){
        redrew();
    }
    public double getArea(){
        return result;
    }
    public void redrew(){
        System.out.println(this.first +"x"+ this.secound +"에 내접하는 타원입니다.");
    }
}
