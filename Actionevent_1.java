
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

    public class Actionevent_1 implements ActionListener, MouseListener, KeyListener{

        int x = 200;
        int y = 200;

        char kc;

        Button b1= new Button("perform action");
        Button b2 = new Button("perform another action");
        Button b3 = new Button("Mouse event here");
        Label l1 = new Label("Hi");
        JLabel l2 = new JLabel();
        ImageIcon i1 = new ImageIcon("E:\\Data\\DSC00003.JPG");

        Actionevent_1()
        {
            JFrame f= new JFrame("test");
            f.setFocusable(true);
            f.addKeyListener(this);
            f.setLayout(null);
            f.setSize(1500,600);

            b1.setBounds(50,50,100,50);
            b1.addActionListener(this);

            b2.setBounds(250,50, 150, 50);
            b2.addActionListener(this);
            b2.addMouseListener(this);

            b3.setBounds(450,50, 150, 50);
            b3.addMouseListener(this);

            l1.setBounds(50,200,110,90);


            l2.setBounds(x,y, 500,200);

            l2.setIcon(i1);


            f.add(b1);
            f.add(b2);
            f.add(b3);
            f.add(l1);
            f.add(l2);



            f.setVisible(true);

        }

        public static void main(String[] args) {
            // TODO code application logic here
            Actionevent_1 ae1= new Actionevent_1();
        }
        @Override

        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            if(b1.equals(e.getSource())){
                //System.out.println("action performed");
                l1.setText("blah");
                l1.setBackground(Color.red);
            }
            else if(b2.equals(e.getSource())){
                l1.setText("hi");
                l1.setBackground(Color.WHITE);
            }
            else{
                System.out.println("nothing");
            }

        }

        @Override
        public void mouseClicked(MouseEvent e) {
            //throw new UnsupportedOperationException("Clicked"); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mousePressed(MouseEvent e) {
            //throw new UnsupportedOperationException("Pressed"); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // throw new UnsupportedOperationException("released"); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if(b3.equals(e.getSource())){
                b3.setBackground(Color.red);
            }
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            else if(b2.equals(e.getSource())){
                b2.setBackground(Color.ORANGE);
            }
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(b3.equals(e.getSource())){
                b3.setBackground(Color.MAGENTA);
            }
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            else if(b2.equals(e.getSource())){
                b2.setBackground(Color.WHITE);
            }
        }

        @Override
        public void keyTyped(KeyEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

            // int kc = e.getKeyCode();
            //System.out.println(kc);
            //JOptionPane.showMessageDialog(null, "hi");
        }

        @Override
        public void keyPressed(KeyEvent e) {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            int kC = e.getKeyCode();
            x = x+50;
            if (kC==38){
                l2.setBounds(x, y,500,200);
            }

        }

        @Override
        public void keyReleased(KeyEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            // JOptionPane.showMessageDialog(null, "hi2");
        }
    }