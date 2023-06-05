package agendaContactos;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class AgendaContactos extends JFrame {
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private ArrayList<Contacto> contactos;
	private JButton btnBaja;
	private JButton btnModificar;
	private JButton btnSalir;
	private JScrollPane scrollPane_1;
	private DefaultTableModel tabla;
	private JTable tablaContactos;

	public AgendaContactos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contactos = new ArrayList<>();

		setTitle("Agenda de Contactos");
		getContentPane().setLayout(null);
		setSize(500, 300);

		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(38, 27, 46, 14);
		getContentPane().add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBounds(98, 22, 188, 20);
		getContentPane().add(txtNombre);

		JLabel lblTelefono = new JLabel("Teléfono:");
		lblTelefono.setBounds(38, 52, 60, 20);
		getContentPane().add(lblTelefono);

		txtTelefono = new JTextField();
		txtTelefono.setBounds(98, 52, 188, 20);
		getContentPane().add(txtTelefono);

		tabla = new DefaultTableModel();
		tabla.addColumn("Nombre");
		tabla.addColumn("Teléfono");

		tablaContactos = new JTable(tabla);
		JScrollPane scrollPane = new JScrollPane(tablaContactos);
		scrollPane.setBounds(38, 83, 248, 150);
		getContentPane().add(scrollPane);
		
		/*ESTE ES EL QUE SE CREA POR DEFECTO
		 * 
		 * scrollPane_1 = new JScrollPane(); scrollPane_1.setBounds(48, 93, 238, 138);
		 * getContentPane().add(scrollPane_1);
		 * 
		 * tabla = new JTable(); tabla.setModel(new DefaultTableModel( new Object[][] {
		 * {null, null}, }, new String[] { "Nombre", "Telefono" } ));
		 * scrollPane_1.setViewportView(tabla);
		 */

		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {// aqui voy a realizar las acciones necesarias para el
															// funcionamiento del boton agregar
			public void actionPerformed(ActionEvent e) {
				String nombre = txtNombre.getText();
				String telefono = txtTelefono.getText();

				if (!nombre.isEmpty() && !telefono.isEmpty()) {
					Contacto contacto = new Contacto(nombre, telefono);
					contactos.add(contacto);
					actualizarTablaContactos();
					JOptionPane.showMessageDialog(null, "Contacto agregado correctamente");
					txtNombre.setText("");
					txtTelefono.setText("");

				} else {
					JOptionPane.showMessageDialog(null, "Por favor, ingresa el nombnre y el telefono del contacto");
				}
			}
		});
		btnAgregar.setBounds(304, 22, 100, 25);
		getContentPane().add(btnAgregar);

		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {// Aqui voy a realizar las acciones necesarias para el
														// funcionamiento del boton modificar
				int filaSeleccionada = tablaContactos.getSelectedRow();
				if (filaSeleccionada != 1) {
					String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre:");
					String nuevoTelefono = JOptionPane.showInputDialog("Nuevo teléfono:");
					if (nuevoNombre != null && nuevoTelefono != null) {
						Contacto contactoModificado = new Contacto(nuevoNombre, nuevoTelefono);
						contactos.set(filaSeleccionada, contactoModificado);
						actualizarTablaContactos();
						JOptionPane.showMessageDialog(null, "Selecciona un contacto para modificar");
					}

				} else {
					JOptionPane.showMessageDialog(null, "No hay contactos para modificar");
				}
			}
		});
		btnModificar.setBounds(304, 52, 100, 25);
		getContentPane().add(btnModificar);

		btnBaja = new JButton("Baja");
		btnBaja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {// metodo para borrar contactos
				int filaSeleccionada = tablaContactos.getSelectedRow();

				if (filaSeleccionada != -1) {
					int confirmar = JOptionPane.showConfirmDialog(null,
							"¿Estas seguro de que quieres eliminar este contacto?" , "Confirmacion de eliminacion "
									, JOptionPane.YES_NO_OPTION);

					if (confirmar == JOptionPane.YES_OPTION) {
						contactos.remove(filaSeleccionada);
						actualizarTablaContactos();
						JOptionPane.showMessageDialog(null, "Contacto eliminado correctamente");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Selecciona un contacto para eliminar");
				}
			}
		});
		btnBaja.setBounds(304, 83, 100, 23);
		getContentPane().add(btnBaja);

		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(304, 209, 100, 23);
		getContentPane().add(btnSalir);
	
	}

	private void actualizarTablaContactos() {
		// TODO Auto-generated method stub
		tabla.setRowCount(0);
		for (Contacto contacto : contactos) {
			Object[] fila = { contacto.getNombre(), contacto.getTelefono() };
			tabla.addRow(fila);
		}

	}
}
