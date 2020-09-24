import java.awt.*;
class demoframe
{ Frame f;
  Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
  Label l;
  TextField tf;
  demoframe(String s)
  { f=new Frame(s);
    /*l=new Label("enter number");
	l.setBounds(40,40,80,20);
	f.add(l);*/
	tf=new TextField("                                            0");
	tf.setBounds(30,40,150,30);
	f.add(tf);
	b1=new Button("CE");
	b2=new Button("C");
	b3=new Button(" <--");
	b4=new Button(" / ");
	b5=new Button(" 7 ");
	b6=new Button(" 8 ");
	b7=new Button(" 9 ");
	b8=new Button(" * ");
	b9=new Button(" 4 ");
	b10=new Button(" 5 ");
	b11=new Button(" 6 ");
	b12=new Button(" - ");
	b13=new Button(" 1 ");
	b14=new Button(" 2 ");
	b15=new Button(" 3 ");
	b16=new Button(" + ");
	b17=new Button(" +_ ");
	b18=new Button(" 0 ");
	b19=new Button(" . ");
	b20=new Button(" = ");
	b1.setBounds(30,70,50,40);
	b2.setBounds(60,70,50,40);
	b3.setBounds(90,70,50,40);
	b4.setBounds(120,70,50,40);
	b5.setBounds(30,120,50,40);
	b6.setBounds(60,120,50,40);
	b7.setBounds(90,120,50,40);
	b8.setBounds(120,120,50,40);
	b9.setBounds(30,170,50,40);
	b10.setBounds(60,170,50,40);
	b11.setBounds(90,170,50,40);
	b12.setBounds(120,170,50,40);
	b13.setBounds(30,220,50,40);
	b14.setBounds(60,220,50,40);
	b15.setBounds(90,220,50,40);
	b16.setBounds(120,220,50,40);
	b17.setBounds(30,270,50,40);
	b18.setBounds(60,270,50,40);
	b19.setBounds(90,270,50,40);
	b20.setBounds(120,270,50,40);
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	f.add(b5);
	f.add(b6);
	f.add(b7);
	f.add(b8);
	f.add(b9);
	f.add(b10);
	f.add(b11);
	f.add(b12);
	f.add(b13);
	f.add(b14);
	f.add(b15);
	f.add(b16);
	f.add(b17);
	f.add(b18);
	f.add(b19);
	f.add(b20);
	//Toolkit t = f.getToolkit();
	f.setSize(400,400);
	f.setLayout(null);
	f.setVisible(true);
  }
  public static void main(String... k)
  { demoframe d=new demoframe("calculator");
  }
}  
	
	
	
	
	