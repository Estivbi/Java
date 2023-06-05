package listaPeliculas;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Ejercicio: Crea una simple lista de peliculas. tendremos un JComboBox, donde
 * almacenaremos las peliculas, que vayamos almacenando en un campo de texto. Al
 * pulsar el botón Añadir la pelicula que hayamos metido, se introducirá en el
 * JComboBox.
 * 
 * @author Carolina Rodriguez DAM online
 *
 */
public class Peliculas extends JFrame {
	private JLabel lblTitulo;
	private JTextField txtCampoTitulo;
	private JButton btnAñadir;
	private JLabel lblPelis;
	private JButton btnSalir;
	private JScrollPane scrollPane;
	private JTable tabla;
	private DefaultTableModel tableModel;

	public Peliculas() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setTitle("Peliculas");
		getContentPane().setLayout(null);
		setSize(500, 300);

		lblTitulo = new JLabel("Escribe el t\u00EDtulo de la pel\u00EDcula");
		lblTitulo.setBounds(40, 64, 169, 14);
		getContentPane().add(lblTitulo);

		txtCampoTitulo = new JTextField();
		txtCampoTitulo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				activarBotonAñadir();
			}
		});
		txtCampoTitulo.setBounds(40, 102, 153, 20);
		getContentPane().add(txtCampoTitulo);
		txtCampoTitulo.setColumns(10);

		setBtnAñadir(new JButton("A\u00F1adir"));
		getBtnAñadir().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				////Cogemos el texto del campo de texto
				String campoTitulo = txtCampoTitulo.getText();
				if (!campoTitulo.isEmpty()) {
					tableModel.addRow(new Object[] {campoTitulo});
					txtCampoTitulo.setText(null);
				}
			}
		});
	
		getBtnAñadir().setBounds(40, 162, 89, 23);
		getContentPane().add(getBtnAñadir());

		lblPelis = new JLabel("Pel\u00EDculas");
		lblPelis.setBounds(243, 64, 52, 14);
		getContentPane().add(lblPelis);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(243, 89, 198, 102);
		getContentPane().add(scrollPane);

		tableModel = new DefaultTableModel(
                new Object[][] { },
                new String[] { "Películas" }
        );
        tabla = new JTable(tableModel);
        tabla.setForeground(Color.BLUE);
        scrollPane.setViewportView(tabla);

		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setForeground(Color.RED);
		btnSalir.setBounds(195, 227, 89, 23);
		getContentPane().add(btnSalir);

	}

	protected void activarBotonAñadir() {
		// TODO Auto-generated method stub
		String campoTitulo = txtCampoTitulo.getText();
		btnAñadir.setEnabled(true);
	}

	/**
	 * @return the btnAñadir
	 */
	public JButton getBtnAñadir() {
		return btnAñadir;
	}

	/**
	 * @param btnAñadir the btnAñadir to set
	 */
	public void setBtnAñadir(JButton btnAñadir) {
		this.btnAñadir = btnAñadir;
		btnAñadir.setEnabled(false);//deshabilitar el boton al iniciar
	}
}
