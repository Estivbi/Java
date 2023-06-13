package otraAgendaContactos;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import agendaContactos.Contacto;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AgendaContactos extends JFrame {
	private JLabel lblNombre;
	private JLabel lblTelf;
	private JTextField txtNombre;
	private JTextField txtTelf;
	private JScrollPane scrollPane;
	private DefaultTableModel table;
	private JButton btnAñadir;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnSalir;
	private LinkedList<Contacto> contactos;
	private JTable tablaContactos;
	
	public AgendaContactos() {
		contactos = new LinkedList<>();
		
		setTitle("Agenda de Contactos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setSize(500, 300);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(23, 37, 46, 14);
		getContentPane().add(lblNombre);
		
		lblTelf = new JLabel("Teléfono:");
		lblTelf.setBounds(23, 72, 46, 14);
		getContentPane().add(lblTelf);
		
		txtNombre = new JTextField();
		txtNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				habilitarBotonAñadir();//creo este metodo para habilitar este boton
			}
		});
		txtNombre.setBounds(79, 34, 162, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtTelf = new JTextField();
		txtTelf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				habilitarBotonAñadir();
			}
		});
		txtTelf.setColumns(10);
		txtTelf.setBounds(79, 69, 162, 20);
		getContentPane().add(txtTelf);
			
		//Aqui modifico la Jtable de la que en un inicio creo por defecto
		table = new DefaultTableModel();
		table.addColumn("Nombre");
		table.addColumn("Teléfono");
		
		tablaContactos = new JTable(table);
		tablaContactos.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				habilitarBotonModificar();
				habilitarBotonEliminar();
			    }
			});
		scrollPane = new JScrollPane(tablaContactos);
		scrollPane.setBounds(23, 119, 249, 89);
		getContentPane().add(scrollPane);
		
		
		btnAñadir = new JButton("A\u00F1adir Contacto");
		btnAñadir.setEnabled(false);
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAñadir();
			}
		});
		btnAñadir.setBounds(287, 68, 117, 23);
		getContentPane().add(btnAñadir);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnModificar();
			}
		});
		btnModificar.setEnabled(false);
		btnModificar.setBounds(315, 122, 89, 23);
		getContentPane().add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEliminar();
			}
		});
		btnEliminar.setEnabled(false);
		btnEliminar.setBounds(315, 156, 89, 23);
		getContentPane().add(btnEliminar);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);// o null, es lo mismo
			}
		});
		btnSalir.setBounds(315, 227, 89, 23);
		getContentPane().add(btnSalir);
	}

	private void btnAñadir() {
		// en este metodo voy a realizar las acciones necesarias para que se añadan el nombre y telefono a tabla
		String nombre = txtNombre.getText();
		String telefono = txtTelf.getText();
		if (!nombre.isEmpty() && !telefono.isEmpty()) {
			Contacto contacto = new Contacto(nombre, telefono);
			contactos.add(contacto);
			actualizarTablaContactos();
			JOptionPane.showMessageDialog(null, "Contacto agregado correctamente");
			txtNombre.setText("");//vaciar campos
			txtTelf.setText("");//vaciar campos
			
		}
		
	}

	private void btnModificar() {
		// en este metodo voy a realizar las acciones necesarias para que se modifquen el nombre y telefono a tabla
		int filaSeleccionada = tablaContactos.getSelectedRow();
		if (filaSeleccionada != -1) {
			String nombreAnterior = (String) tablaContactos.getValueAt(filaSeleccionada, 0);
	        String telefonoAnterior = (String) tablaContactos.getValueAt(filaSeleccionada, 1);

	        String nombreModificado = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre:", nombreAnterior);
	        String telefonoModificado = JOptionPane.showInputDialog(null, "Ingrese el nuevo teléfono:", telefonoAnterior);
	        
	        if (nombreModificado != null && telefonoModificado != null) {
	            // Actualizar los datos en la lista de contactos
	            Contacto contactoModificado = new Contacto(nombreModificado, telefonoModificado);
	            contactos.set(filaSeleccionada, contactoModificado);

	            // Actualizar los datos en la tabla
	            tablaContactos.setValueAt(nombreModificado, filaSeleccionada, 0);
	            tablaContactos.setValueAt(telefonoModificado, filaSeleccionada, 1);
	            actualizarTablaContactos();
	            JOptionPane.showMessageDialog(null, "Contacto modificado correctamente");
	        }
		}else {
        	JOptionPane.showMessageDialog(null, "Selecciona un contacto de nuevo para poder modificar");
        }
	}
	
	private void btnEliminar() {
		// en este metodo voy a realizar las acciones necesarias para que se elimen el nombre y telefono a tabla
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
	
	private void actualizarTablaContactos() {
		// metodo para que se reflejen en jtable los datos agregados
		table.setRowCount(0);
		for (Contacto contacto : contactos) {
			Object[] fila = { contacto.getNombre(), contacto.getTelefono() };
			table.addRow(fila);
		}

	}
		
	//en este metodo hago las acciones necesarias para habiliar boton cuando ambos campos estan rellenos
	private void habilitarBotonAñadir() {
		String nombre = txtNombre.getText();
	    String telefono = txtTelf.getText();

	    if (!nombre.isEmpty() && !telefono.isEmpty()) {
			btnAñadir.setEnabled(true);
		}else {
			btnAñadir.setEnabled(false);
		}
}
	private void habilitarBotonEliminar() {
		// TODO Auto-generated method stub
		if (tablaContactos.getSelectedRow() != -1) {
            btnEliminar.setEnabled(true);//desde aqui ya activo el boton eliminar cuando selecciono una fila
        } else {
            btnEliminar.setEnabled(false);
        }
	}

	private void habilitarBotonModificar() {
		// TODO Auto-generated method stub
		if (tablaContactos.getSelectedRow() != -1) {
            btnModificar.setEnabled(true);//desde aqui ya activo el boton modificar cuando selecciono una fila
        } else {
            btnModificar.setEnabled(false);
        }
	}
}
