package robot_window_inteface;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Copy_Actions_to_Clipboard 
{

	public static void main(String[] args) throws Exception
	{
		
		 //Open Notepad file at runtime
		 Runtime.getRuntime().exec("notepad.exe");
		 Thread.sleep(5000);
		 
		 //Create object for Robot class
		 Robot robot=new Robot();
		 robot.setAutoDelay(500);
		 
		 
		 String text="Selenium automates browsers. That's it! " + 
		 		"What you do with that power is entirely up to you.";
		 
		 //Seleting Required String
		 StringSelection Stext=new StringSelection(text);
		 //Get System Clipboard
		 Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		 //Selected text transfer to clipboard
		 clipboard.setContents(Stext, Stext);
		 
		 
		 //Copy String to Any writable file using keyboard shortcut 
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 
		 
		 //Releasing Down Key
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 
		 

	}

}
