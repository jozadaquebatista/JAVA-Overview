import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.io.PrintWriter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Container;
import java.awt.BorderLayout;

public class Client extends JFrame
{

  JTextField textToSend;
  Socket socket;
  PrintWriter writer;

  public Client()
  {
  
    super("Chat");
    
    
    Font font = new Font("Serif", Font.PLAIN, 26);
    textToSend = new JTextField();
    JButton btn = new JButton("Send");
    Container send = new JPanel();
    
    send.setLayout(new BorderLayout());
    
    textToSend.setFont(font);
    
    btn.setFont(font);
    btn.addActionListener(new SendListener());
    
    send.add(BorderLayout.CENTER, textToSend);
    send.add(BorderLayout.EAST, btn);
    getContentPane().add(BorderLayout.SOUTH, send);
    
    NetworkConfigure();
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600, 400);
    setVisible(true);
  
  }
  
  private class SendListener implements ActionListener
  {
  
    public void actionPerformed(ActionEvent e)
    {
    
      writer.println(textToSend.getText());
      writer.flush();
      textToSend.setText("");
      //textToSend.setFocus();
    
    }
  
  }
  
  private void NetworkConfigure()
  {
    
    try {
    
      socket = new Socket("127.0.0.1", 5500);
      writer = new PrintWriter(socket.getOutputStream());
    
    
    } catch(Exception e) {
    
      
    
    }
    
  }

  public static void main(String[] args)
  {
  
    new Client();
  
  }

}