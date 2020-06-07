
public class Triangle 
{
 private String type;
 int num;
 Triangle(int num)
 {
	 this.num=num;
 }
 Triangle(String type, int num)
 {
	 this.type=type;
	 this.num=num;
 }
 Triangle(String type)
 {
	 this.type=type;
 }
 
 public void draw()
 {
	 System.out.println( getType()+"triangle drawn"+getNum());
 }
public String getType() {
	return type;
}
/*public void setType(String type) {
	this.type = type;
}*/

public int getNum() {
	return num;
}

public void setNum(int num) {
	this.num = num;
}
 
}
