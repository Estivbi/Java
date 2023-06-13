package gestorTareas;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 * 
 * @author Carolina Rodriguez DAM online
 *
 */

public class GestorTareas extends JFrame {

	private JTextField txtTareas;
	private JLabel lblAñade;
	private JButton btnAñadir;
	private JButton btnCompletar;
	private JButton btnEliminar;
	private JButton btnSalir;
	private JList<String> listTareas;
	private ArrayList<String> agregaTareas;
	private DefaultListModel<String> modeloLista;
	private JScrollPane scrollPane;
	private JLabel lblTCompletadas;
	private JList<String> listTCompletadas;
	private DefaultListModel<String> modeloCompletados;
	private JScrollPane scrollPaneCompletados;

	public GestorTareas() {
		agregaTareas = new ArrayList<>();
		modeloLista = new DefaultListModel<>();
		
		modeloCompletados = new DefaultListModel<>();
		listTCompletadas = new JList<>(modeloCompletados);
		
		setSize(471, 401);
		setFont(new Font("Dialog", Font.PLAIN, 12));
		setTitle("Gestor de Tareas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		txtTareas = new JTextField();
		txtTareas.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				updateBtnañadir();
			}
		});
		txtTareas.setBounds(128, 39, 186, 20);
		getContentPane().add(txtTareas);
		txtTareas.setColumns(10);

		lblAñade = new JLabel("A\u00F1ade una tarea:");
		lblAñade.setBackground(Color.WHITE);
		lblAñade.setBounds(26, 42, 103, 14);
		getContentPane().add(lblAñade);

		btnAñadir = new JButton("A\u00F1adir");
		btnAñadir.setBackground(Color.CYAN);
		btnAñadir.setEnabled(false);
		btnAñadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAñadir();
			}
		});
		btnAñadir.setBounds(324, 38, 103, 23);
		getContentPane().add(btnAñadir);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(26, 90, 233, 85);
		getContentPane().add(scrollPane);

		listTareas = new JList<>(modeloLista);//añadimos modeloLista de la defaultListModel para que salgan en la lista lo que añadimos btnAñadir
		listTareas.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				updateCompletar();
				updateEliminar();
			}
		});
		scrollPane.setViewportView(listTareas);

		btnCompletar = new JButton("Completar");
		btnCompletar.setBackground(Color.GREEN);
		btnCompletar.setEnabled(false);
		btnCompletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCompletar();
			}
		});
		btnCompletar.setBounds(324, 102, 103, 23);
		getContentPane().add(btnCompletar);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBackground(Color.ORANGE);
		btnEliminar.setEnabled(false);
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEliminar();
			}
		});
		btnEliminar.setBounds(324, 136, 103, 23);
		getContentPane().add(btnEliminar);

		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setForeground(Color.WHITE);
		btnSalir.setBackground(Color.RED);
		btnSalir.setBounds(324, 330, 103, 23);
		getContentPane().add(btnSalir);
		
		JScrollPane scrollPaneTCompletadas = new JScrollPane();
		scrollPaneTCompletadas.setBounds(26, 238, 233, 79);
		getContentPane().add(scrollPaneTCompletadas);
		
		listTCompletadas = new JList(modeloCompletados);
		listTCompletadas.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				updateCompletar();
				updateEliminar();
			}
		});
		scrollPaneTCompletadas.setViewportView(listTCompletadas);
		
		lblTCompletadas = new JLabel("Tareas completadas con \u00E9xito");
		lblTCompletadas.setBounds(26, 208, 192, 14);
		getContentPane().add(lblTCompletadas);
	}

	private void btnAñadir() {
		// en este metodo se va a establecer la funcion del boton añadir
		String tareas = txtTareas.getText();
		if (!tareas.isEmpty()) {
			agregaTareas.add(tareas);
			modeloLista.addElement(tareas);
			txtTareas.setText(null);//para que se borre las palabras del label
			updateBtnañadir();
		}
	}
	
	private void btnCompletar() {
		// en este metodo se va a establecer la funcion del boton completar
		int indiceSeleccionado = listTareas.getSelectedIndex();
		if (indiceSeleccionado != -1) {
			String tareaCompletada = modeloLista.getElementAt(indiceSeleccionado);
			modeloCompletados.addElement(tareaCompletada);
			modeloLista.remove(indiceSeleccionado);
			updateCompletar();
			updateEliminar();
		}
		
	}
	
	private void btnEliminar() {
		// en este metodo se va a establecer la funcion del boton eliminar
		int indiceSeleccionado = listTareas.getSelectedIndex();
		int indiceSeleccionadoCompletados = listTCompletadas.getSelectedIndex();//para que se elimen las tareas de completadas
		
		if (indiceSeleccionado != -1) {
			String tareaEliminada = modeloLista.getElementAt(indiceSeleccionado);
			modeloLista.remove(indiceSeleccionado);
			modeloCompletados.removeElement(tareaEliminada);
		} else if (indiceSeleccionadoCompletados != -1) {
	        String tareaEliminada = modeloCompletados.getElementAt(indiceSeleccionadoCompletados);
	        modeloCompletados.remove(indiceSeleccionadoCompletados);
	    }
		updateCompletar();
		updateEliminar();
	}
	
	private void updateBtnañadir() {
		// voy a implementar la logica para activar boton añadir tarea cuando se rellene el campo de texto
		String tarea = txtTareas.getText();
		if (!tarea.isEmpty()) {
			btnAñadir.setEnabled(true);
		} else {
			btnAñadir.setEnabled(false);
		}
		
	}
	
	private void updateEliminar() {
		// voy a implementar la logica para que cuando seleccione la tarea a eliminar se active el boton de eliminar
		if (listTareas.getSelectedIndex() != -1 || listTCompletadas.getSelectedIndex() != -1) {
			btnEliminar.setEnabled(true);
		} else {
			btnEliminar.setEnabled(false);
		} 
		
	}

	private void updateCompletar() {
		// voy a implementar la logica para que cuando seleccione la tarea a completar se active el boton de eliminar
		if (listTareas.getSelectedIndex() != -1) {
			btnCompletar.setEnabled(true);
		}else {
			btnCompletar.setEnabled(false);;
		}
	}
}
