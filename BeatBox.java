import java.awt.*;
import javax.swing.*;
import javax.sound.midi.*;
import java.util.*;
import java.awt.event.*;

public class BeatBox {

	JPanel mainPanel;
	ArrayList<JCheckBox> checkboxList;
	Sequencer sequencer;
	Sequence sequence;
	Track track;
	JFrame theFrame;
	
	String[] instrumentNames = {"Barss_1","Barss_1","Barss_1","Barss_1",
	"Barss_1","Barss_1","Barss_1","Barss_1","Barss_1","Barss_1","Barss_1","Barss_1","Barss_1","Barss_1","Barss_1","Barss_1"};
	
	int [] instruments = {35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63};
}