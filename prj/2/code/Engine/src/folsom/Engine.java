package folsom;

import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * @author Nic Mays
 * @version 1.0
 */
public class Engine
{
    //Engine variables
    FileReadWrite fwr = new FileReadWrite();
    String filename = "";
    String key = "";
    double start;
    double finish;

    //GUI components
    private JPanel panelMain;
    private JTextField filenameField;
    private JTextField keyField;
    private JButton encryptButton;
    private JButton decryptButton;
    private JButton generateKeyButton;

    public Engine()
    {
        //ENCRYPT BUTTON push block
        encryptButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //gets info from text fields
                filename = filenameField.getText();
                key = keyField.getText();

                //create object with message and key
                TextEncryptor te = new TextEncryptor(fwr.readTxt(filename), "",false);
                te.setKey(key);

                //encrypt with time stamp
                start = System.currentTimeMillis();
                te.dynamicEncrypt();

                //write cypher to file
                try {
                    fwr.writeCypher(filename, te.getMessage());
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

                finish = System.currentTimeMillis();

                //encryption failed
                if(te.getMessage().compareTo("")==0)
                {
                    JOptionPane.showMessageDialog(null, "Encryption failed.");
                    te.terminate();
                }

                //encryption successful
                else
                {
                    String n = "Successful encryption of "+filename;
                    n+= "\nExecuted in: "+((finish-start)/1000)+" seconds. ";
                    JOptionPane.showMessageDialog(null, n);
                    te.terminate();
                }

                //LockOut User
                encryptButton.setEnabled(false);
            }
        });

        //DECRYPT BUTTON push block
        decryptButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //read from text fields and build object
                filename = filenameField.getText();
                key = keyField.getText();
                TextEncryptor td = new TextEncryptor(fwr.readCypher(filename), key, true);

                //decrypt with time stamp
                start = System.currentTimeMillis();
                td.dynamicDecrypt();

                try
                {
                    fwr.writeTxt(filename, td.getMessage());
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

                finish = System.currentTimeMillis();

                //Decryption failed
                if(td.getMessage().compareTo("")==0)
                {
                    JOptionPane.showMessageDialog(null, "Decryption failed.");
                    td.terminate();
                }

                //Successful Decryption
                else
                {
                    String n = "Successful decryption of "+filename;
                    n+= "\nExecuted in: "+((finish-start)/1000)+" seconds.";
                    JOptionPane.showMessageDialog(null, n);
                    td.terminate();
                }

                //lock out decryption button
                decryptButton.setEnabled(false);
            }
        });

        generateKeyButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                TextEncryptor TxtK = new TextEncryptor();
                TxtK.setMessage(fwr.readTxt(filenameField.getText()));
                keyField.setText(TxtK.generateKey());
                decryptButton.setEnabled(false);
            }
        });
    }

    public static void main(String[] args)
    {
        //set Jframe
        JFrame jframe = new JFrame("Folsom");
        jframe.setContentPane(new Engine().panelMain);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.pack();
        jframe.setVisible(true);
        jframe.setSize(500,350);
        jframe.setResizable(false);
        jframe.setTitle("Folsom ©2017");

        //set icon block
        try {
            jframe.setIconImage(ImageIO.read(new File("lock.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
