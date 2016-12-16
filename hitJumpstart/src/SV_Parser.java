import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.*;

public class SV_Parser{
//    private JTextField textField1;
//    private JButton button1;
//    public JPanel panel;

    public static class Main {


        public static void main(String[] args) {
            // access file
            // read file
//            JFrame frame = new JFrame("JFrame Example");
//            Form form = new Form();
//            form.button1.addActionListener(new AbstractAction() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
                   //String search=form.textField1.getText();


                    File myScukoFile = new File("results.csv");
                    File outputFile=new File("1.txt");
                    String search = "Bob";

                    try {
                        if(!outputFile.exists()) {
                            outputFile.createNewFile();
                        }
                        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile, false));
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(myScukoFile));
                        String readLine;
                        int counter = 0;
                        while ((readLine = bufferedReader.readLine()) != null) {
                            // my desired search logic
                            counter+=1;
                            if (readLine.contains(search)){
                                bufferedWriter.write(search+" found in line number "+counter);
                                bufferedWriter.newLine();

                            }
                            //System.out.println(readLine);
                        }
                    } catch (Exception e1){}
                }
            }
            //frame.setContentPane(form.panel);
            //frame.setSize(300, 300);
            //frame.setLocationRelativeTo(null);
            //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //frame.setVisible(true);


        }

