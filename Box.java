import java.io.*;

public class Box implements Serializable{

	private int width;
	private int height;
	
	public void setWidth(int x){
		width = x;
	}
	
	public void setHeight(int y){
		height = y;
	}
	
	public static void main(String[] args){
		Box myBox = new Box();
		myBox.setWidth(50);
		myBox.setHeight(20);
		
		try{
			FileOutputStream fs = new FileOutputStream("foo.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(myBox);
			os.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}