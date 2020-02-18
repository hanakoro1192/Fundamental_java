import javax.swing.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.BorderLayout;



public class FlowLayoutTest3 extends JFrame {

    public static void main(String[] args){
        FlowLayoutTest3 frame = new FlowLayoutTest3();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(10, 10, 300, 200);
        frame.setTitle("タイトル");
        frame.setVisible(true);
    }

    FlowLayoutTest3(){
        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("JButton2");

        JPanel p1 = new JPanel(); //パネルを作成するメソッド
        p1.setBackground(Color.ORANGE);
        p1.add(button1);
        p1.add(button2);

        JButton button3 = new JButton("JButton3"); //ボタン作成
        JButton button4 = new JButton("JButton4");

        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout(FlowLayout.LEFT));
        p2.add(button3);
        p2.add(button4);

        JButton button5 = new JButton("JButton5");
        JButton button6 = new JButton("JButton6");

        JPanel p3 = new JPanel();
        FlowLayout layout = new FlowLayout();
        layout.setAlignment(FlowLayout.RIGHT);
        p3.setLayout(layout);
        p3.add(button5);
        p3.add(button6);

        getContentPane().add(p1, BorderLayout.CENTER);
        getContentPane().add(p2, BorderLayout.PAGE_START);
        getContentPane().add(p3, BorderLayout.PAGE_END);
    }
}
