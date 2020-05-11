  
import java.awt.*;
import java.io.*;
import java.awt.event.*;
public class ResumeBuilder {
	static int countAdd1Clicks;
	static TextField employ;
	static Frame f;
	public static void main(String[] args) {
		countAdd1Clicks = 0;
	 f= new Frame("Resume Builder");
		f.setLayout(new FlowLayout(FlowLayout.LEFT));
		f.setSize(750, 750);
		Label l1= new Label("Name ");
		Label l4= new Label("Address ");
		Label l2= new Label("Contact No. ");
		Label l3= new Label("Email: ");
		Label l5= new Label ("Professional Summary: ");
		Label l6= new Label("Employment History:");
		TextField f1= new TextField(20);
		TextField f2= new TextField(20);
		TextField f3= new TextField(20);
		TextField f4= new TextField(80);
		TextField f5= new TextField(90);
	
		employ= new TextField(90);
		Label education= new Label("Education:                                                                                                                                                                                            ");
		Label edu= new Label("  Course:                                                                               Institution:                                                                              Year:                                                                  ");
		Choice c1= new Choice();
		c1.addItem("Select");
		c1.addItem("10th");
		c1.addItem("12th");
	      c1.addItem("Graduation");
	      c1.addItem("Post Graduation");
	      c1.addItem("PHD");
	    TextField ch1= new TextField(50);
	    TextField d1= new TextField(20);
	    Choice c2= new Choice();
	    c2.addItem("Select");
		c2.addItem("10th");
		c2.addItem("12th");
	      c2.addItem("Graduation");
	      c2.addItem("Post Graduation");
	      c2.addItem("PHD");
	    TextField ch2= new TextField(50);
	    TextField d2= new TextField(20);
	    Choice c3= new Choice();
	    c3.addItem("Select");
		c3.addItem("10th");
		c3.addItem("12th");
	      c3.addItem("Graduation");
	      c3.addItem("Post Graduation");
	      c3.addItem("PHD");
	    TextField ch3= new TextField(50);
	    TextField d3= new TextField(20);
	    Choice c4= new Choice();
	    c4.addItem("Select");
		c4.addItem("10th");
		c4.addItem("12th");
	      c4.addItem("Graduation");
	      c4.addItem("Post Graduation");
	      c4.addItem("PHD");
	    TextField ch4= new TextField(50);
	    TextField d4= new TextField(20);
	    Choice c5= new Choice();
	    c5.addItem("Select");
		c5.addItem("10th");
		c5.addItem("12th");
	      c5.addItem("Graduation");
	      c5.addItem("Post Graduation");
	      c5.addItem("PHD");
	    TextField ch5= new TextField(50);
	    TextField d5= new TextField(20);
	    Label Skills= new Label("Skills:                                                                                                                                                                                                                                                    ");
	    TextField s1= new TextField(90);
	    TextField s2= new TextField(90);
	    TextField s3= new TextField(90);
	    TextField s4= new TextField(90);
	    TextField s5= new TextField(90);
	    Label sk1= new Label("  1. ");
	    Label sk2= new Label("  2. ");
	    Label sk3= new Label("  3. ");
	    Label sk4= new Label("  4. ");
	    Label sk5= new Label("  5. ");
	    Label Hobbies= new Label("Hobbies:                                                                                                                                                                                                                                                    ");
	    TextField hb= new TextField(90);
	    Label lan= new Label("Languages :");
	    TextField lan1= new TextField(15);
	    TextField lan2= new TextField(15);
	    TextField lan3= new TextField(15);
	    TextField lan4= new TextField(15);
	    Button b1= new Button("                      CREATE RESUME                     ");
	   
	    
	    
		f.add(l1);
		f.add(f1);
		f.add(l2);
		f.add(f2);
		f.add(l3);
		f.add(f3);
		f.add(l4);
		f.add(f4);
		f.add(l5);
		f.add(f5);
		f.add(l6);
		f.add(employ);
		f.add(education);
		f.add(edu);
		f.add(c1);
		f.add(ch1);
		f.add(d1);
		f.add(c2);
		f.add(ch2);
		f.add(d2);
		f.add(c3);
		f.add(ch3);
		f.add(d3);
		f.add(c4);
		f.add(ch4);
		f.add(d4);
		f.add(c5);
		f.add(ch5);
		f.add(d5);
		f.add(Skills);
		f.add(sk1);
		f.add(s1);
		f.add(sk2);
		f.add(s2);
		f.add(sk3);
		f.add(s3);
		f.add(sk4);
		f.add(s4);
		f.add(sk5);
		f.add(s5);
		f.add(Hobbies);
		f.add(hb);
		f.add(lan);
		f.add(lan1);
		f.add(lan2);
		f.add(lan3);
		f.add(lan4);
		f.add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					FileWriter myWriter = new FileWriter("Resumeout.txt");
					myWriter.write(f1.getText()+"\n");
					myWriter.write(f2.getText()+"\n");
					myWriter.write(f3.getText()+"\n");
					myWriter.write(f4.getText()+"\n");
					myWriter.write("\n\n");
					myWriter.write("Proffessional Summary : \n");
					myWriter.write(f5.getText()+"\n");
					myWriter.write("\n\n");
					myWriter.write("Previous Experiences\n");
					myWriter.write(employ.getText()+"\n");
					myWriter.write("\n\n");
					myWriter.write("EDUCATION: \n");
					if (c1.getItem(c1.getSelectedIndex())!="Select")
					{myWriter.write(c1.getItem(c1.getSelectedIndex())+"      "+ ch1.getText()+ "       "+ d1.getText()+"\n");}
					if (c2.getItem(c2.getSelectedIndex())!="Select")
					{myWriter.write(c2.getItem(c2.getSelectedIndex())+"      "+ ch2.getText()+ "       "+ d2.getText()+"\n");}
					if (c3.getItem(c3.getSelectedIndex())!="Select")
					{myWriter.write(c3.getItem(c3.getSelectedIndex())+"      "+ ch3.getText()+ "       "+ d3.getText()+"\n");}
					if (c4.getItem(c4.getSelectedIndex())!="Select")
					{myWriter.write(c4.getItem(c4.getSelectedIndex())+"      "+ ch4.getText()+ "       "+ d4.getText()+"\n");}
					if (c5.getItem(c5.getSelectedIndex())!="Select")
					{myWriter.write(c5.getItem(c5.getSelectedIndex())+"      "+ ch5.getText()+ "       "+ d5.getText()+"\n");}
					myWriter.write("\n\n");
					myWriter.write("Skills:   \n");
					if (s1.getText()!= "")
					{myWriter.write("1. "+ s1.getText()+"\n");}
					if (s2.getText()!= "")
					{myWriter.write("2. "+ s2.getText()+"\n");}
					if (s3.getText()!= "")
					{myWriter.write("3. "+ s3.getText()+"\n");}
					if (s4.getText()!= "")
					{myWriter.write("4. "+ s4.getText()+"\n");}
					if (s5.getText()!= "")
					{myWriter.write("5. "+ s5.getText()+"\n");}
					myWriter.write("\n\n");
					myWriter.write("Hobbies \n:");
					myWriter.write(hb.getText());
					myWriter.write("\n\n");
					myWriter.write("Languages known: ");
					myWriter.write("\n\n");
					if (lan1.getText()!= "")
					{myWriter.write("1. "+ lan1.getText()+"\n");}
					if (lan2.getText()!= "")
					{myWriter.write("2. "+ lan2.getText()+"\n");}
					if (lan3.getText()!= "")
					{myWriter.write("3. "+ lan3.getText()+"\n");}
					if (lan4.getText()!= "")
					{myWriter.write("4. "+ lan4.getText()+"\n");}
					
					
					
					
					
					 myWriter.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		
	
		
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setVisible(true);

	}

}