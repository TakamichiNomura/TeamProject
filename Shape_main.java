
/**
 * クラス Shape_main の注釈をここに書きます.
 * 
 * @author (2018243144 노무라타카미치 2018190042 모리모토 케이)
 * @version (20190902)
 */
public class Shape_main{
    public static void main(String[] args){
        Shape[] list = new Shape[3];
        list[0] = new Circle(10);
        list[1] = new Oval(20, 30); 
        list[2] = new Rect(10, 40);
        for(int i = 0; i < list.length; i++){
            list[i].redraw(); 
        }
        for(int i = 0; i < list.length; i++){
            System.out.println("면적은"+ list[i].getArea());
        }
    }
}
