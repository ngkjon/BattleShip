/*====================================================================
|File Name:				Board.java													|
|Class:					ICS3U															|
|Date Last Modified:	02/06/15														|
|Description:			creates and manages the window for the program	|
|===================================================================*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Board extends JFrame
{
   static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();//receive dimensions of screen
   final static int WIDTH = (int)screenSize.getWidth()/100*100;//rounded to lower 100 in order to fix minor allignment problems
   final static int HEIGHT = (int)screenSize.getHeight()/100*100;
   static JFrame f=new JFrame();//new JFrame
   /*====================================================================
   |drawboard()                  													|
	|--------------------------------------------------------------------|
	|--------------------------------------------------------------------|
	|creates a JFrame and adds the graphics from draw onto it   			|
	====================================================================*/
   public static void drawBoard()
   {
      if(BattleShip.game==1)//mouse listener didnt get disposed so it would register multiple clicks after re running
      {
         f.addMouseListener(new Mouse());    //used to get mouse input
      }
      if(BattleShip.turn==0)
      {
         f.setTitle("BattleShip");
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         f.setSize(WIDTH+10,2*HEIGHT/3);  //windows will scale according to display size
      
      }                                   //height is smaller to allow user to read message from console
      Draw d=new Draw();                  
      f.add(d);                           //add the board to frame
      f.setVisible(true);                 //show frame
   }
}
