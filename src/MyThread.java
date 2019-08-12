import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyThread extends Thread{
	/**@author Chandler Hiatt
	 * @version last updated 4-7-17
	 * @class MyThread - extends Thread.
	 */
	private String fileName, text;
	private int wordCount, letterCount;
	private Scanner in, in2;
	
	public MyThread(String fileName){
		this.fileName = fileName;
	}
	
	public void run(){
		//Scanner console = new Scanner(System.in);           
		text = "";
        File file = new File(fileName + ".txt");
        
        try {
			in = new Scanner(file);
			in2 = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//custom title, error icon
			JOptionPane.showMessageDialog(new JFrame(),
			    "File not Found.",
			    "Error",
			    JOptionPane.ERROR_MESSAGE);
		}
        while(in2.hasNextLine()){
        	text += in2.nextLine();
        }
		    while(in.hasNext()){
		    	String line = in.next();
		    	//text += line;
		    	//System.out.println(line);
		    	wordCount++;
		    	
		    	for(int i = 0; i < line.length(); i++){
		    		if(Character.isLetter(line.charAt(i))){
		    			letterCount++;
		    		}
		    	}
        	
        	
        	//
		    }
		    
        //System.out.println(letterCount + "\n " + wordCount + "\n" + text);
        OutputFrame output = new OutputFrame(text, letterCount, wordCount);
        //output.pack();
        output.setVisible(true);
        //System.out.println(letterCount);
	}
	
}
