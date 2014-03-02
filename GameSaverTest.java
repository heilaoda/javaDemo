import java.io.*;

public class GameSaverTest{
	public static void main(String[] args){
	GameCharacter one = new GameCharacter(50, "Elf", new String[]{"bow", "sword", "dust"});
	GameCharacter two = new GameCharacter(200,"Troll",new String[]{"bare hands","big ax"});
	GameCharacter three = new GameCharacter(120,"magician", new String[]{"spells", "invisibility"});
	try{
		ObjectOutputStream os = new ObjectOutputStream (new FileOutputStream("GAme.ser"));
		os.writeObject(one);
		os.writeObject(two);
		os.writeObject(three);
		os.close();
	}catch(Exception ex){
		ex.printStackTrace();
	}
	
	one = null;
	two = null;
	three = null;
	
	try{
		ObjectInputStream is = new ObjectInputStream(new FileInputStream("GAme.ser"));
		GameCharacter one1 = (GameCharacter)is.readObject();
		GameCharacter two2 = (GameCharacter)is.readObject();
		GameCharacter three3 = (GameCharacter)is.readObject();
		
		System.out.println("One's type : "+ one1.getType());
		System.out.println("Two's type : "+ two2.getType());
		System.out.println("Three's type : "+ three3.getType());
	}catch(Exception ex){
		ex.printStackTrace();
	}
	}
}