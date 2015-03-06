import javax.swing.JOptionPane;
public class ClassExercise {
public static void main(String[] args) {

int Numpeople, Numplayer, groupsize1, groupsize2;
String people = JOptionPane.showInputDialog("Enter number of people: ");
String player = JOptionPane.showInputDialog("Enter number of players: ");
Numpeople = Integer.parseInt(people);
Numplayer = Integer.parseInt(player);
groupsize1 = Numpeople/2;
groupsize2 = Numpeople/3;

if(Numpeople>10){
JOptionPane.showMessageDialog(null,"Number of people :" + Numpeople + "\nGroupsize: " + groupsize1 );		
}
else if(Numpeople>3){
JOptionPane.showMessageDialog(null, "Number of people :" + Numpeople + "\nGroupsize: " + groupsize2 );
}
else{
JOptionPane.showMessageDialog(null,"The number of people has to be at least 3");
}
if(Numplayer>=11 && Numplayer<=55){
JOptionPane.showMessageDialog(null,"The number of players: "+ Numplayer + "\nTeam size: " + Numplayer/11);
}
else{
JOptionPane.showMessageDialog(null, "The number of players: "+ Numplayer +"\nTeam size: 1");
}	
}
}