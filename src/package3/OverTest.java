package package3;

class Dog{ 
    public String name;
    public int age;
    
    
    public void info(){
        System.out.println("강아지의 이름은 "+name+", 나이는 "+age+"살입니다.");
    }
    
}
 
class Food extends Dog{ 
 
    String food;
    
    public void info() {
    	super.info();
        System.out.println("강아지가 가장 좋아하는 음식은 "+food+"입니다.");
    }
}
 
public class OverTest {
 
    public static void main(String[] args) {
        
        Food f = new Food();
        
        f.name = "흰둥이";
        f.age = 3;
        f.food = "사과";
        
        f.info();
        
    }
 
}
