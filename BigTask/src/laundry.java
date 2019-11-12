import java.awt.EventQueue;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;

public class laundry extends JFrame {

	private JFrame frame;
	private JTextField nm;
	private JTextField almt;
	private JTextField nomer;
	private JTextField isiberat;
	private JTextField hasiltotal;
	private JTextField byr;
	private JTextPane textPane1;
	private static Label nama;
	Integer hargaTotal = null; //  = null inisialisi nilai awal 
	Integer BeratPakaian; //Class beratpakaian ditaro di variabel global disetiap method
	private String Metodee; // buat mengambil metode dan Modifier private akan membuat member hanya bisa diakses oleh dari dalam class itu sendiri.
	private JRadioButton express;
	private JRadioButton standard;
	private JTextPane textPane2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					laundry window = new laundry();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public laundry() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1354, 849);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		nm = new JTextField();	
		nm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		nm.setBounds(158, 106, 137, 22);
		frame.getContentPane().add(nm);
		nm.setColumns(10);
		
		almt = new JTextField();
		almt.setText("\n");
		almt.setBounds(158, 141, 137, 22);
		frame.getContentPane().add(almt);
		almt.setColumns(10);
		
		nomer = new JTextField();
		nomer.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
			      if(Character.isAlphabetic(e.getKeyChar())) {
			       e.consume();
			      }
			      else if (Character.isSpaceChar(e.getKeyChar())) {
			      e.consume();
			    }
			}
		});
		nomer.setText("\n");
		nomer.setColumns(10);
		nomer.setBounds(158, 176, 137, 22);
		frame.getContentPane().add(nomer);
		
		JLabel berat = new JLabel("Berat");
		berat.setBackground(new Color(240, 240, 240));
		berat.setForeground(new Color(0, 0, 0));
		berat.setBounds(30, 233, 116, 22);
		frame.getContentPane().add(berat);
		
		JLabel nama = new JLabel("Nama Pelanggan :");
		nama.setBounds(22, 109, 121, 16);
		frame.getContentPane().add(nama);
		
		JLabel alamat = new JLabel("Alamat :");
		alamat.setBounds(30, 144, 100, 16);
		frame.getContentPane().add(alamat);
		
		JLabel nohp = new JLabel("No.Hp :");
		nohp.setBounds(30, 179, 116, 16);
		frame.getContentPane().add(nohp);
		
		JComboBox isimetode = new JComboBox();
		isimetode.setModel(new DefaultComboBoxModel(new String[] {"----Pilih Metode-----", "Cuci Kering Setrika", "Setrika "}));
		isimetode.setBounds(158, 297, 175, 57);
		frame.getContentPane().add(isimetode);
		
		JLabel lblKg = new JLabel("Kg");
		lblKg.setBounds(255, 233, 55, 22);
		frame.getContentPane().add(lblKg);
		
		isiberat = new JTextField();
		isiberat.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			      if(Character.isAlphabetic(e.getKeyChar())) {
			       e.consume();
			      }
			      else if (Character.isSpaceChar(e.getKeyChar())) {
			      e.consume();
			    }
			}
		});
		isiberat.setBounds(158, 233, 89, 22);
		frame.getContentPane().add(isiberat);
		isiberat.setColumns(10);
		
		standard = new JRadioButton("Standard");
		standard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(standard.isSelected())
				{
					express.setSelected(false);
				}
			}
		});
		standard.setBounds(146, 401, 86, 25);
		frame.getContentPane().add(standard);
		
		express = new JRadioButton("Express");
		express.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(express.isSelected()) {
					standard.setSelected(false);
				}
			}
		});
		express.setBounds(255, 401, 74, 25);
		frame.getContentPane().add(express);
		
		JLabel metode = new JLabel("Metode");
		metode.setBounds(36, 298, 75, 54);
		frame.getContentPane().add(metode);
		
		JLabel waktu = new JLabel("Waktu cuci");
		waktu.setBounds(25, 410, 86, 16);
		frame.getContentPane().add(waktu);
		
		JButton Total = new JButton("Total");
		Total.setBounds(25, 480, 97, 25);
		frame.getContentPane().add(Total);
		
		hasiltotal = new JTextField();
		hasiltotal.setEditable(false);
		hasiltotal.setBounds(158, 481, 116, 22);
		frame.getContentPane().add(hasiltotal);
		hasiltotal.setColumns(10);
		
		byr = new JTextField();
		byr.setBounds(158, 539, 116, 22);
		frame.getContentPane().add(byr);
		byr.setColumns(10);
		
		JLabel bayar = new JLabel("Bayar");
		bayar.setBounds(25, 542, 86, 16);
		frame.getContentPane().add(bayar);
		
		JButton Cetak = new JButton("Cetak");
		Cetak.setBounds(25, 603, 97, 25);
		frame.getContentPane().add(Cetak);
		
		
		JButton C = new JButton("C");
		C.setBounds(255, 603, 55, 25);
		frame.getContentPane().add(C);
		
		JTextPane textPane1 = new JTextPane();
		textPane1.setEditable(false);
		textPane1.setBounds(802, 106, 415, 354);
		frame.getContentPane().add(textPane1);
		
		JLabel lblNewLabel = new JLabel("Terpaksa Laundry");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNewLabel.setBounds(549, 13, 217, 66);
		frame.getContentPane().add(lblNewLabel);
		
		textPane2 = new JTextPane();
		textPane2.setBounds(802, 512, 415, 232);
		frame.getContentPane().add(textPane2);
		
		JButton reset = new JButton("RESET");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane1.setText("");
				textPane2.setText("");
				nm.setText("");
				almt.setText("");
				nomer.setText("");
				isiberat.setText("");
				hasiltotal.setText("");
				byr.setText("");
				standard.setSelected(false);
				express.setSelected(false);
				isimetode.setSelectedIndex(0);
			}
		});
		reset.setBounds(135, 748, 97, 25);
		frame.getContentPane().add(reset);
		
		Total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (isimetode.getSelectedIndex() == 1) { // 0 index yang dipilih
					//Cuci Kering
					Metodee = isimetode.getSelectedItem().toString();
					BeratPakaian = Integer.parseInt(isiberat.getText().toString());
					if (standard.isSelected()) {
						hargaTotal = BeratPakaian * 4000 *1;
					}
					else if (express.isSelected()) {
						standard.setSelected(false);
						hargaTotal = BeratPakaian * 4000 * 2;
					}
					else {
						hargaTotal = 0;
					}
				}
				else if (isimetode.getSelectedIndex() == 2) {
					//Setrika
					Metodee = isimetode.getSelectedItem().toString();
					BeratPakaian = Integer.parseInt(isiberat.getText().toString());
					if (standard.isSelected()) {
						hargaTotal = BeratPakaian * 3500 *1;
					}
					else if (express.isSelected()) {
						hargaTotal = BeratPakaian * 3500 * 2;
					}else {
						hargaTotal = 0;
					}
				}
				hasiltotal.setText("Rp "+hargaTotal);
				
			}
		});
		
		Cetak.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Integer bayar,kmbl;
				String data = null;
				int a;
				a=0;
				a++;
				data += a +". "+nm.getText()+" - "+Metodee+" "+BeratPakaian+" >> Rp."+hargaTotal+"\n";
				bayar = Integer.parseInt(byr.getText().toString()); //mengkonversi nilai string menjadi numerik
				kmbl = bayar - hargaTotal;
				
				String nama_pelanggan = nm.getText().toString();
				String nomorHP = nomer.getText().toString();
				String AlamatPelanggan = almt.getText().toString();
				
				textPane1.setText("      -------------- LAUNDRY --------------\n" + 
                        "       JASA LAYANAN CUCI KERING SETRIKA PAKAIAN\n" + 
                        "      ------------------------------------------\n\n" + 
                        "       Nama   : " + nama_pelanggan + "\n" + 
                        "       No Hp  : " +   nomorHP + "\n" +
                        "       Alamat : " + AlamatPelanggan + "\n" + 
                        "       Berat  : " + BeratPakaian + " Kg" + "\n" + 
                        "       Metode : " + Metodee+ "\n" + 
                        "       TOTAL  : Rp."+hargaTotal+ "\n" +
                        "      ------------------------------------------\n" +
                        "       BAYAR     : Rp."+ bayar+"\n" +
                        "       Kembali  : Rp."+ kmbl+ "\n" +
                        "      ------------------------------------------\n");
				
                
				textPane2.setText(data);
			}
		});
		
		C.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textPane1.setText("");
				nm.setText("");
				almt.setText("");
				nomer.setText("");
				isiberat.setText("");
				hasiltotal.setText("");
				byr.setText("");
				standard.setSelected(false);
				express.setSelected(false);
				isimetode.setSelectedIndex(0);
				
			}
		});
	}
}
