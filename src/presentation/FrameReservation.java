/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import java.util.Arrays;

import javax.swing.DefaultListModel;
import javax.swing.JComboBox;

import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;

import dialog.DialogReservation;

@SuppressWarnings("serial")
public class FrameReservation extends javax.swing.JFrame {

	private DialogReservation dialog;

	public FrameReservation() {
		super();
	}

	public void initFrame() {
		initComponents();
	}

	public void setDialog(DialogReservation dialog) {
		this.dialog = dialog;
	}

	// /!\ /!\ /!\ ATTENTION /!\ /!\ /!\
	// ce code est auto généré et ne doit PAS être modifié
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		dateTimePanel = new javax.swing.JPanel();
		datePicker = new com.github.lgooddatepicker.components.DatePicker();
		datePicker.addDateChangeListener(new DateChangeListener() {
			@Override
			public void dateChanged(DateChangeEvent dateEvent) {
				datePickerDateChanged(dateEvent);
			}
		});
		labelChoixDate = new javax.swing.JLabel();
		labelChoixHeure = new javax.swing.JLabel();
		jComboBoxHeure = new javax.swing.JComboBox<>();
		nbPersonsPanel = new javax.swing.JPanel();
		labelNombrePersonnes = new javax.swing.JLabel();
		jComboBoxNombrePersonnes = new javax.swing.JComboBox<>();
		pickTablePanel = new javax.swing.JPanel();
		tablesImage = new javax.swing.JLabel();
		labelChoixTable = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jListTable = new javax.swing.JList<>();
		jButtonAnnuler = new javax.swing.JButton();
		jButtonValide = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		dateTimePanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

		labelChoixDate.setText("1. Choisissez la date");

		labelChoixHeure.setText("2. Choisissez l'heure");
		labelChoixHeure.setEnabled(false);

		jComboBoxHeure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "19H30", "21h00" }));
		jComboBoxHeure.setSelectedIndex(0);
		jComboBoxHeure.setEnabled(false);
		jComboBoxHeure.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBoxHeureActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout dateTimePanelLayout = new javax.swing.GroupLayout(dateTimePanel);
		dateTimePanel.setLayout(dateTimePanelLayout);
		dateTimePanelLayout.setHorizontalGroup(dateTimePanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(dateTimePanelLayout.createSequentialGroup().addGap(19, 19, 19)
						.addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(labelChoixDate).addComponent(datePicker,
										javax.swing.GroupLayout.PREFERRED_SIZE, 157,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jComboBoxHeure, javax.swing.GroupLayout.Alignment.TRAILING,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(labelChoixHeure, javax.swing.GroupLayout.Alignment.TRAILING))
						.addGap(19, 19, 19)));
		dateTimePanelLayout.setVerticalGroup(dateTimePanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(dateTimePanelLayout.createSequentialGroup().addGap(17, 17, 17)
						.addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(labelChoixDate).addComponent(labelChoixHeure))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jComboBoxHeure, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(65, Short.MAX_VALUE)));

		datePicker.getAccessibleContext().setAccessibleName("");
		datePicker.getAccessibleContext().setAccessibleDescription("");

		nbPersonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

		labelNombrePersonnes.setText("3. Indiquez le nombre de personnes");
		labelNombrePersonnes.setEnabled(false);

		jComboBoxNombrePersonnes.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
		jComboBoxNombrePersonnes.setSelectedIndex(1);
		jComboBoxNombrePersonnes.setEnabled(false);
		jComboBoxNombrePersonnes.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jComboBoxNombrePersonnesActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout nbPersonsPanelLayout = new javax.swing.GroupLayout(nbPersonsPanel);
		nbPersonsPanel.setLayout(nbPersonsPanelLayout);
		nbPersonsPanelLayout.setHorizontalGroup(nbPersonsPanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(nbPersonsPanelLayout.createSequentialGroup().addGap(19, 19, 19)
						.addGroup(nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jComboBoxNombrePersonnes, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(labelNombrePersonnes))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		nbPersonsPanelLayout
				.setVerticalGroup(nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(nbPersonsPanelLayout.createSequentialGroup().addContainerGap()
								.addComponent(labelNombrePersonnes)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jComboBoxNombrePersonnes, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(58, Short.MAX_VALUE)));

		pickTablePanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

		tablesImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Plan_tables.jpg"))); // NOI18N
		tablesImage.setEnabled(false);

		labelChoixTable.setText("4. Choisissez votre table");

		jListTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		jListTable.setEnabled(false);
		jListTable.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
			@Override
			public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
				jListTableValueChanged(evt);
			}
		});
		jScrollPane1.setViewportView(jListTable);

		javax.swing.GroupLayout pickTablePanelLayout = new javax.swing.GroupLayout(pickTablePanel);
		pickTablePanel.setLayout(pickTablePanelLayout);
		pickTablePanelLayout.setHorizontalGroup(pickTablePanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pickTablePanelLayout.createSequentialGroup().addGap(19, 19, 19)
						.addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(pickTablePanelLayout.createSequentialGroup()
										.addComponent(tablesImage, javax.swing.GroupLayout.PREFERRED_SIZE, 297,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE, 130,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addComponent(labelChoixTable))
						.addContainerGap(49, Short.MAX_VALUE)));
		pickTablePanelLayout.setVerticalGroup(pickTablePanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pickTablePanelLayout.createSequentialGroup().addGap(16, 16, 16).addComponent(labelChoixTable)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(tablesImage, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(pickTablePanelLayout.createSequentialGroup()
										.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap()));

		jButtonAnnuler.setText("Annuler");
		jButtonAnnuler.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonAnnulerActionPerformed(evt);
			}
		});

		jButtonValide.setText("Valider");
		jButtonValide.setEnabled(false);
		jButtonValide.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonValideActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(dateTimePanel, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(nbPersonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(pickTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(jButtonValide)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButtonAnnuler)))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(16, 16, 16)
						.addComponent(dateTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(nbPersonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(pickTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButtonAnnuler).addComponent(jButtonValide))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jComboBoxHeureActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBoxHeureActionPerformed
		dialog.handleTimeSelectedEvent(jComboBoxHeure.getSelectedItem().toString());
	}// GEN-LAST:event_jComboBoxHeureActionPerformed

	public void enableNombrePersonnes() {
		labelNombrePersonnes.setEnabled(true);
		jComboBoxNombrePersonnes.setEnabled(true);
		jComboBoxNombrePersonnes.setSelectedIndex(0);
	}

	private void jButtonValideActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonValideActionPerformed
		dialog.handleValidationEvent();
		raz();
	}// GEN-LAST:event_jButtonValideActionPerformed

	private void jComboBoxNombrePersonnesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBoxNombrePersonnesActionPerformed
		JComboBox cb = (JComboBox) evt.getSource();
		String item = (String) cb.getSelectedItem();
		dialog.handleNumOfPersonsSelectedEvent(Integer.parseInt(item));
	}// GEN-LAST:event_jComboBoxNombrePersonnesActionPerformed

	public void enableTableSelection() {
		labelChoixTable.setEnabled(true);
		tablesImage.setEnabled(true);
		// handle dialog
		DefaultListModel<String> modele = new DefaultListModel<>();
		modele.addAll(Arrays.asList(dialog.getTables()));
		jListTable.setModel(modele);
		jListTable.setEnabled(true);
	}

	private void jListTableValueChanged(javax.swing.event.ListSelectionEvent evt) {// GEN-FIRST:event_jListTableValueChanged
		// dialog.handleTableSelectedEvent(evt.getFirstIndex() + 1);
		int tableNumber = -1;
		try {
			tableNumber = Integer.parseInt(jListTable.getSelectedValue());
			dialog.handleTableSelectedEvent(tableNumber);
		} catch (NumberFormatException nfe) {
			// ne rien faire
		}
	}// GEN-LAST:event_jListTableValueChanged

	public void enableValider() {
		jButtonValide.setEnabled(true);

	}

	private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonAnnulerActionPerformed
		dialog.handleCancelEvent();
	}// GEN-LAST:event_jButtonAnnulerActionPerformed

	public void datePickerDateChanged(DateChangeEvent dateEvent) {
		System.out.println("Date changee");
		dialog.handleDateSelectedEvent(dateEvent.getNewDate());
	}

	public void enableHeure() {
		labelChoixHeure.setEnabled(true);
		jComboBoxHeure.setEnabled(true);
		jComboBoxHeure.setSelectedIndex(0);
	}

	public void raz() {
		labelChoixHeure.setEnabled(false);
		jComboBoxHeure.setEnabled(false);
		labelNombrePersonnes.setEnabled(false);
		jComboBoxNombrePersonnes.setEnabled(false);
		tablesImage.setEnabled(false);
		DefaultListModel<String> modele = new DefaultListModel<>();
		jListTable.setModel(modele);
		jButtonValide.setEnabled(false);
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private com.github.lgooddatepicker.components.DatePicker datePicker;
	private javax.swing.JPanel dateTimePanel;
	private javax.swing.JButton jButtonAnnuler;
	private javax.swing.JButton jButtonValide;
	private javax.swing.JComboBox<String> jComboBoxHeure;
	private javax.swing.JComboBox<String> jComboBoxNombrePersonnes;
	private javax.swing.JList<String> jListTable;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel labelChoixDate;
	private javax.swing.JLabel labelChoixHeure;
	private javax.swing.JLabel labelChoixTable;
	private javax.swing.JLabel labelNombrePersonnes;
	private javax.swing.JPanel nbPersonsPanel;
	private javax.swing.JPanel pickTablePanel;
	private javax.swing.JLabel tablesImage;
	// End of variables declaration//GEN-END:variables

}
