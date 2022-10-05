import javax.swing.*;
import Helper.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HesapMakinasıGUI extends JFrame{
    private JPanel wrapper;
    private JPanel pnl_hesap;
    private JTextField txt_1;
    private JTextField txt_2;
    private JButton toplaButton;
    private JButton çarpButton;
    private JButton çıkarButton;
    private JButton bölButton;
    private JTextField txt_sonuc;
    private JButton üsAlButton;
    private JButton karakökAlButton;
    private JButton modAlButton;
    private JButton türevAlButton;
    private JButton integralAlmaButton;

    public HesapMakinasıGUI() {
        add(wrapper);
        setSize(450, 325);
        setLocation(helper.screenCenterLoc("x", getSize()), helper.screenCenterLoc("y", getSize()));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(config.PROJECT_TITLE);
        setResizable(false);
        setVisible(true);


        toplaButton.addActionListener(e -> {
            int a = Integer.parseInt(txt_1.getText());
            int b = Integer.parseInt(txt_2.getText());
            int toplam = a+b;
            txt_sonuc.setText(String.valueOf(toplam));
        });


        çıkarButton.addActionListener(e -> {
            int a = Integer.parseInt(txt_1.getText());
            int b = Integer.parseInt(txt_2.getText());
            int çıkarma = a-b;
            txt_sonuc.setText(String.valueOf(çıkarma));
        });
        çarpButton.addActionListener(e -> {
            int a = Integer.parseInt(txt_1.getText());
            int b = Integer.parseInt(txt_2.getText());
            int çarpma = a*b;
            txt_sonuc.setText(String.valueOf(çarpma));
        });
        bölButton.addActionListener(e -> {
            int a = Integer.parseInt(txt_1.getText());
            int b = Integer.parseInt(txt_2.getText());
            int bölme = a/b;
            txt_sonuc.setText(String.valueOf(bölme));
        });
        üsAlButton.addActionListener(e -> {
            int a = Integer.parseInt(txt_1.getText());
            int b = Integer.parseInt(txt_2.getText());
            long sonuc =1;
            for (; b !=0;b--){
                sonuc *= a;
            }
            txt_sonuc.setText(String.valueOf(sonuc));
        });
        karakökAlButton.addActionListener(e -> {
            int a = Integer.parseInt(txt_1.getText());
            txt_sonuc.setText(String.valueOf(Math.sqrt(a)));
        });
        modAlButton.addActionListener(e -> {
            int a = Integer.parseInt(txt_1.getText());
            int b = Integer.parseInt(txt_2.getText());
            int c = a % b;
            txt_sonuc.setText(String.valueOf(c));
        });
        türevAlButton.addActionListener(e -> {
            int a = Integer.parseInt(txt_1.getText());
            int b = Integer.parseInt(txt_2.getText());
            int c = a*b;
            int d = b-1;
            txt_sonuc.setText(String.valueOf(c)+"x^"+String.valueOf(d));
        });
        integralAlmaButton.addActionListener(e -> {
            int a = Integer.parseInt(txt_1.getText());
            int b = Integer.parseInt(txt_2.getText());
            int c = b+1;
            int d = a / c;
            txt_sonuc.setText(String.valueOf(d)+"x^"+String.valueOf(c));
        });
    }
    public static void main(String[] args){

        HesapMakinasıGUI hesapMakinasıGUI = new HesapMakinasıGUI();
    }
}
