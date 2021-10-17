import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoopingJFrame {
    private static JFrame myFrameWindows;

    public static void main(String[] args) {
        myFrameWindows = new JFrame();
        myFrameWindows.setTitle("Looping Button JFrame");
        myFrameWindows.setResizable(false);
        myFrameWindows.setBounds(50,50,800,600);

        JLabel myLabel = new JLabel();
        myLabel.setText("Input jumlah Button : ");
        myLabel.setBounds(50, 30, 300,30);

        JTextField myInputNumber = new JTextField();
        myInputNumber.setBounds(50,60,200,30);
        JButton myBtnExec = new JButton();
        myBtnExec.setText("Hit me");
        myBtnExec.setBounds(255,60,100,30);

        myBtnExec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int jumlahBtn = Integer.parseInt(myInputNumber.getText());
                JButton btnNew[]= new JButton[jumlahBtn];

                for (int loop=0;loop<jumlahBtn;loop++) {
                    btnNew[loop] = new JButton();
                    btnNew[loop].setBounds(50+ (loop * 155),110,150, 30 );
                    myFrameWindows.add(btnNew[loop]);
                    myFrameWindows.repaint();

                }
            }
        });
        myFrameWindows.add(myLabel);
        myFrameWindows.add(myBtnExec);
        myFrameWindows.add(myInputNumber);
        myFrameWindows.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myFrameWindows.setLayout(null);
        myFrameWindows.setVisible(true);


    }
}
