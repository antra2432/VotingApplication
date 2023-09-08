
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


public class SecondForm  extends JFrame implements ActionListener{
  JMenuBar mb;
  ImageIcon i;
  JLabel l1;
JMenu m1,m2,m3,m4,m5,m6;
JMenuItem procedure1,enroll1;
JMenuItem lead1,lead2,lead3;
JMenuItem enrollMe;
JMenuItem vote,exit,show;
JPanel p1;
 public SecondForm()
 {
     this.setVisible(true);
     this.setSize(1950,1950);
//     this.setLayout(null);
     
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      Color c=new Color(102,102,190);
      Font f=new Font("Times New Roman",Font.BOLD, 30);
     //menuItem
     procedure1=new JMenuItem("how to vote");
     procedure1.setFont(f);
     enroll1=new JMenuItem("how to enroll");
     enroll1.setFont(f);
     lead1=new JMenuItem("know about leader 1");
     lead1.setFont(f);
     lead2=new JMenuItem("know about leader 2");
     lead2.setFont(f);
     lead3=new JMenuItem("know about leader 3");
     lead3.setFont(f);
     enrollMe=new JMenuItem("enroll Myself");
     enrollMe.setFont(f);
     vote=new JMenuItem("move to voting platform");
     vote.setFont(f);
     exit=new JMenuItem("exit this page");
     exit.setFont(f);
     show=new JMenuItem("Report");
    show.setFont(f);
// Image
i=new ImageIcon("D:\\animation\\v1.jpg");

//menu
  
m1=new JMenu("Find") ;
m1.setSize(80, 40);
m1.setFont(f);
m2=new JMenu("Details");
m2.setSize(130,40);
m2.setFont(f);
m3=new JMenu("Enroll");
m3.setSize(40,40);
m3.setFont(f);
m4=new JMenu("Vote");
m4.setSize(40,40);
m4.setFont(f);
m5=new JMenu("Exit");
m5.setSize(40,40);
m5.setFont(f);
m6=new JMenu("Show ");
m6.setFont(f);
mb=new JMenuBar();
mb.setBounds(0,10,700,80);
mb.setBackground(c);
l1=new JLabel(i);
l1.setBounds(0, 100, 800, 800);
p1=new JPanel();
p1.setBounds(0,0,800,800);
p1.setBackground(c);
p1.add(l1);
m1.add(procedure1);  //   adding item to menu
m1.add(enroll1);
m2.add(lead1);     
m2.add(lead2);
m2.add(lead3);
m3.add(enrollMe);
m4.add(vote);
m5.add(exit);
m6.add(show);
mb.add(m1);
mb.add(m2);
mb.add(m3);
mb.add(m4);
mb.add(m5);
mb.add(m6);
this.add(mb);
this.add(p1);
lead1.addActionListener(this);
enrollMe.addActionListener(this);
lead2.addActionListener(this);
exit.addActionListener(this);
procedure1.addActionListener(this);
enroll1.addActionListener(this);
vote.addActionListener(this);
lead3.addActionListener(this);
show.addActionListener(this);
 }
    public static void main(String[] args) {
        SecondForm sf=new SecondForm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getActionCommand()=="enroll Myself")
      {
          new EnrollmentForm().setVisible(true);
          this.dispose();
      }
      if(e.getActionCommand()=="know about leader 1")
      {
          new Leader1 () .setVisible(true);
          this.dispose();
      }
      if(e.getActionCommand()=="know about leader 2")
      {
          new Leader2().setVisible(true);
          this.dispose();
      }
      if(e.getActionCommand()=="exit this page")
      {
          new WelcomeForm().setVisible(true);
          this.dispose();
     
      }
      if(e.getActionCommand()=="how to vote")
      {
          new VotingDetail().setVisible(true);
          this.dispose();
      }
      if(e.getActionCommand()=="how to enroll")
      {
          new EnrollmentDetail().setVisible(true);
          this.dispose();
      }
      if(e.getActionCommand()=="move to voting platform")
              {
                 new LoginPage().setVisible(true);
                 this.dispose();
              }
      if(e.getActionCommand()=="know about leader 3")
      {
          new Leader3().setVisible(true);
          this.dispose();
      }
      if(e.getActionCommand()=="Report"){
          new Report().setVisible(true);
          this.dispose();
      }
    }
}
