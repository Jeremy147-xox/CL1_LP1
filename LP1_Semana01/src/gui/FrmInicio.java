package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import util.Validaciones;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class FrmInicio extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblRegistraAlumno;
	private JLabel lblNombre;
	private JTextField txtTarjeta;
	private JLabel lblNewLabel;
	private JTextField txtCuenta;
	private JLabel lblNewLabel_1;
	private JTextField txtPasaporte;
	private JLabel lblCorreoGmail;
	private JTextField txtCorreo;
	private JLabel lblFechaNacimiento;
	private JTextField txtFecha;
	private JButton btnEnviar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmInicio frame = new FrmInicio();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmInicio() {
		setTitle("Formulario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblRegistraAlumno = new JLabel("Formulario de Registro");
		lblRegistraAlumno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRegistraAlumno.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistraAlumno.setBounds(12, 31, 420, 28);
		contentPane.add(lblRegistraAlumno);
		
		lblNombre = new JLabel("Tarjeta de Credito");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setBounds(50, 90, 121, 16);
		contentPane.add(lblNombre);
		
		txtTarjeta = new JTextField();
		txtTarjeta.setBounds(183, 87, 181, 22);
		contentPane.add(txtTarjeta);
		txtTarjeta.setColumns(10);
		
		lblNewLabel = new JLabel("Cuenta Bancaria");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(50, 134, 121, 16);
		contentPane.add(lblNewLabel);
		
		txtCuenta = new JTextField();
		txtCuenta.setBounds(183, 131, 181, 22);
		contentPane.add(txtCuenta);
		txtCuenta.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Pasaporte");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(50, 177, 121, 16);
		contentPane.add(lblNewLabel_1);
		
		txtPasaporte = new JTextField();
		txtPasaporte.setBounds(183, 177, 181, 22);
		contentPane.add(txtPasaporte);
		txtPasaporte.setColumns(10);
		
		lblCorreoGmail = new JLabel("Correo gmail");
		lblCorreoGmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorreoGmail.setBounds(50, 219, 121, 16);
		contentPane.add(lblCorreoGmail);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(183, 216, 181, 22);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		lblFechaNacimiento = new JLabel("Fecha Nacimiento");
		lblFechaNacimiento.setHorizontalAlignment(SwingConstants.CENTER);
		lblFechaNacimiento.setBounds(60, 260, 111, 16);
		contentPane.add(lblFechaNacimiento);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(183, 260, 181, 22);
		contentPane.add(txtFecha);
		txtFecha.setColumns(10);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(this);
		btnEnviar.setBounds(163, 317, 97, 34);
		contentPane.add(btnEnviar);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnEnviar) {
			handle_btnEnviar_actionPerformed(arg0);
		}
	}
	protected void handle_btnEnviar_actionPerformed(ActionEvent arg0) {
		String tarj = txtTarjeta.getText().trim();
		String cuen = txtCuenta.getText().trim();
		String pas = txtPasaporte.getText().trim();
		String corr = txtCorreo.getText().trim();
		String fech = txtFecha.getText().trim();
		
		if(!tarj.matches(Validaciones.TARJETA_CREDITO)){
			mensaje("Error en tarjeta de credito");
			return;
		}else if(!cuen.matches(Validaciones.CUENTA_BANCARIA)){
			mensaje("Error en cuenta bancaria");
			return;
		}else if(!pas.matches(Validaciones.PASAPORTE)){
			mensaje("Error en pasaporte");
			return;
		}else if(!corr.matches(Validaciones.CORREO_GMAIL)){
			mensaje("Error en correo");
			return;
		}else if(!fech.matches(Validaciones.FECHA)) {
			mensaje("Error en fecha de nacimiento");
		}else {
			mensaje("Todos los datos son correctos");
		}
	}
	
	public void mensaje(String ms){
		JOptionPane.showMessageDialog(this, ms);
	}
}
