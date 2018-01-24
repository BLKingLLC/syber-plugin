/**
 * BreerRabbitFrame.java
 *
 * This file was generated by MapForce 2015sp2.
 *
 * YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
 * OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
 *
 * Refer to the MapForce Documentation for further details.
 * http://www.altova.com/mapforce
 */


package com.odysseyconsult.breerabbit.translator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

import com.altova.types.*;


public class BreerRabbitFrame extends JFrame implements com.altova.TraceTarget {
	java.util.Hashtable	mapArguments = new java.util.Hashtable();

	
	JPanel			contentPane;
	TitledBorder	titledBorder1;
	Box 		jHeader = new Box(BoxLayout.X_AXIS);
	Box		jHeaderInfo = new Box(BoxLayout.Y_AXIS);
	Box 		jButtonPane = new Box(BoxLayout.X_AXIS);
	JScrollPane	jScrollPaneStructures	= new JScrollPane();
	JPanel		jPanelStructures		= new JPanel();
	JLabel		jIconLabel				= new JLabel();
	JLabel		jInfoLabel1				= new JLabel();
	JLabel		jInfoLabel2				= new JLabel();
	JLabel		jInfoLabel3				= new JLabel();
	JButton		jStartButton			= new JButton();
	JPanel		jPanel1					= new JPanel();
	JScrollPane	jTraceScrollPane		= new JScrollPane();
	JTextArea	jTraceTextArea			= new JTextArea();


	JLabel jDeltek_GCS_Payroll_Output2Label0 = new JLabel();
	JTextField jDeltek_GCS_Payroll_Output2TextField0 = new JTextField();

	JLabel jUTM_InputLabel1 = new JLabel();
	JTextField jUTM_InputTextField1 = new JTextField();

	JLabel jPayrollIILabel2 = new JLabel();
	JTextField jPayrollIITextField2 = new JTextField();

	JLabel jDateLabel3 = new JLabel();
	JTextField jDateTextField3 = new JTextField();

	JLabel jUTM_Input2Label4 = new JLabel();
	JTextField jUTM_Input2TextField4 = new JTextField();


	public BreerRabbitFrame() {
		enableEvents(AWTEvent.WINDOW_EVENT_MASK);
		try {
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jbInit() throws Exception {
		jInfoLabel1.setText("THIS APPLICATION WAS GENERATED BY MapForce 2015sp2");
		jInfoLabel2.setForeground(Color.blue);
		jInfoLabel2.setText("http://www.altova.com/mapforce");
		jInfoLabel3.setText("Please check the input and output files, and press the Start button...");
		jHeaderInfo.add(jInfoLabel1,0);
		jHeaderInfo.add(jInfoLabel2,1);
		jHeaderInfo.add(jInfoLabel3,2);
		
		jIconLabel.setIcon(new ImageIcon(BreerRabbitFrame.class.getResource("mapforce.png")));
		jIconLabel.setText("");
				
		jHeader.add(jIconLabel);
		jHeader.add(Box.createHorizontalStrut(15));
		jHeader.add(jHeaderInfo);
		jHeader.add(Box.createGlue());
		
		jStartButton.setFont(new java.awt.Font("Dialog", 0, 11));
		jStartButton.setText("Start");
		jStartButton.addActionListener(new BreerRabbitFrame_jStartButton_actionAdapter(this));
		jButtonPane.add(Box.createHorizontalStrut(5));
		jButtonPane.add(jStartButton);
		jButtonPane.add(Box.createGlue());
				
		jScrollPaneStructures.setBorder(BorderFactory.createLineBorder(Color.black));
		jScrollPaneStructures.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jScrollPaneStructures.setAutoscrolls(true);
		jPanelStructures.setLayout(null);
		fillScrollPane();
		jScrollPaneStructures.getViewport().add(jPanelStructures, null);
		
		jTraceTextArea.setBackground(Color.white);
		jTraceTextArea.setForeground(Color.black);
		jTraceTextArea.setToolTipText("");
		jTraceTextArea.setText("");
		jTraceTextArea.setRows(20);
		
		jTraceScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jTraceScrollPane.setViewportBorder(null);
		jTraceScrollPane.setAutoscrolls(true);
		jTraceScrollPane.setBorder(BorderFactory.createLineBorder(Color.black));
		jTraceScrollPane.setDebugGraphicsOptions(0);
		jTraceScrollPane.setToolTipText("");
		jTraceScrollPane.setVerifyInputWhenFocusTarget(true);
		jTraceScrollPane.getViewport().add(jTraceTextArea, null);
		jTraceScrollPane.setPreferredSize(new Dimension(0, 200));
				
		contentPane = (JPanel)this.getContentPane();
		titledBorder1 = new TitledBorder("");
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		this.setSize(new Dimension(603, 511));
		this.setTitle("Mapforce Application");
		contentPane.add(jHeader, 0);
		contentPane.add(jScrollPaneStructures, 1);
		contentPane.add(jButtonPane, 2);
		contentPane.add(jTraceScrollPane, 3);
	}

	protected void fillScrollPane() {

		jDeltek_GCS_Payroll_Output2Label0.setText("Source instance of Deltek GCS Payroll Output file:");
		jDeltek_GCS_Payroll_Output2Label0.setBounds(new Rectangle(15, 10, 438, 23));
		jPanelStructures.add(jDeltek_GCS_Payroll_Output2Label0, null);
		jDeltek_GCS_Payroll_Output2TextField0.setText("09 23 16 Deltek_Round1 Processed.CSV");
		jDeltek_GCS_Payroll_Output2TextField0.setBounds(new Rectangle(15, 35, 438, 23));
		jDeltek_GCS_Payroll_Output2TextField0.setEditable(false);
		jPanelStructures.add(jDeltek_GCS_Payroll_Output2TextField0, null);

		jUTM_InputLabel1.setText("Instance of UTM Input file:");
		jUTM_InputLabel1.setBounds(new Rectangle(15, 60, 438, 23));
		jPanelStructures.add(jUTM_InputLabel1, null);
		jUTM_InputTextField1.setText("UTM_DATE_Import");
		jUTM_InputTextField1.setBounds(new Rectangle(15, 85, 438, 23));
		jUTM_InputTextField1.setEditable(false);
		jPanelStructures.add(jUTM_InputTextField1, null);

		jPayrollIILabel2.setText("Source instance of PayrollII file:");
		jPayrollIILabel2.setBounds(new Rectangle(15, 110, 438, 23));
		jPanelStructures.add(jPayrollIILabel2, null);
		jPayrollIITextField2.setText("10 07 16 Deltek.CSV");
		jPayrollIITextField2.setBounds(new Rectangle(15, 135, 438, 23));
		jPayrollIITextField2.setEditable(false);
		jPanelStructures.add(jPayrollIITextField2, null);

		jDateLabel3.setText("Input Parameter : Date");
		jDateLabel3.setBounds(new Rectangle(15, 160, 438, 23));
		jPanelStructures.add(jDateLabel3, null);

		jDateTextField3.setText("" );
		jDateTextField3.setBounds(new Rectangle(15, 185, 438, 23));
		jDateTextField3.setEditable(true);
		jDateTextField3.addKeyListener(new BreerRabbitFrame_jDateTextField3_keyAdapter( this ) );
		jPanelStructures.add(jDateTextField3, null);

		jUTM_Input2Label4.setText("Instance of UTM Input file:");
		jUTM_Input2Label4.setBounds(new Rectangle(15, 210, 438, 23));
		jPanelStructures.add(jUTM_Input2Label4, null);
		jUTM_Input2TextField4.setText("UTM_DATE_Import_II.csv");
		jUTM_Input2TextField4.setBounds(new Rectangle(15, 235, 438, 23));
		jUTM_Input2TextField4.setEditable(false);
		jPanelStructures.add(jUTM_Input2TextField4, null);

		jPanelStructures.setLayout(null);
		jPanelStructures.setPreferredSize(new Dimension(235, 500));
		jPanelStructures.setSize(new Dimension(235, 500));
		jPanelStructures.setMinimumSize(new Dimension(235, 500));
		jPanelStructures.setMaximumSize(new Dimension(235, 500));
	}

	protected void processWindowEvent(WindowEvent e) {
		super.processWindowEvent(e);
		if (e.getID() == WindowEvent.WINDOW_CLOSING) {
			System.exit(0);
		}
	}

    void jStartButton_actionPerformed(ActionEvent e) {
		if (e.getSource().equals(jStartButton)) {
			jStartButton.setEnabled(false);
			jTraceTextArea.removeAll();
			jTraceTextArea.append("Started...\n");
			com.altova.TraceTarget ttc = this;


			try {

			MappingMapToUTM_Input MappingMapToUTM_InputObject = new MappingMapToUTM_Input();




			MappingMapToUTM_InputObject.registerTraceTarget(ttc);
	

			// run mapping
			//
			// you have different options to provide mapping input and output:
			//
			// files using file names (available for XML, text, and Excel):
			//   com.altova.io.FileInput(String filename)
			//   com.altova.io.FileOutput(String filename)
			//
			// streams (available for XML, text, and Excel):
			//   com.altova.io.StreamInput(java.io.InputStream stream)
			//   com.altova.io.StreamOutput(java.io.OutputStream stream)
			//
			// strings (available for XML and text):
			//   com.altova.io.StringInput(String xmlcontent)
			//   com.altova.io.StringOutput()	(call getContent() after run() to get StringBuffer with content)
			//
			// Java IO reader/writer (available for XML and text):
			//   com.altova.io.ReaderInput(java.io.Reader reader)
			//   com.altova.io.WriterOutput(java.io.Writer writer)
			//
			// DOM documents (for XML only):
			//   com.altova.io.DocumentInput(org.w3c.dom.Document document)
			//   com.altova.io.DocumentOutput(org.w3c.dom.Document document)
			// 
			// By default, run will close all inputs and outputs. If you do not want this,
			// call the following function:
			// MappingMapToUTM_InputObject.setCloseObjectsAfterRun(false);

			{
				com.altova.io.Input Deltek_GCS_Payroll_Output2Source = com.altova.io.StreamInput.createInput("09 23 16 Deltek_Round1 Processed.CSV");
				com.altova.io.Output UTM_InputTarget = new com.altova.io.FileOutput("UTM_DATE_Import");

				MappingMapToUTM_InputObject.run(
						Deltek_GCS_Payroll_Output2Source,
						UTM_InputTarget);
			}



				jTraceTextArea.append("Finished\n");
			} catch (Exception ex) {
				jTraceTextArea.append("ERROR: " + ex.getMessage());
			}

			try {

			MappingMapToUTM_Input2 MappingMapToUTM_Input2Object = new MappingMapToUTM_Input2();




			MappingMapToUTM_Input2Object.registerTraceTarget(ttc);
	
			if(!mapArguments.containsKey("Date"))
			{
				System.out.println("Missing argument Date");
				System.exit(1);
			}

			// run mapping
			//
			// you have different options to provide mapping input and output:
			//
			// files using file names (available for XML, text, and Excel):
			//   com.altova.io.FileInput(String filename)
			//   com.altova.io.FileOutput(String filename)
			//
			// streams (available for XML, text, and Excel):
			//   com.altova.io.StreamInput(java.io.InputStream stream)
			//   com.altova.io.StreamOutput(java.io.OutputStream stream)
			//
			// strings (available for XML and text):
			//   com.altova.io.StringInput(String xmlcontent)
			//   com.altova.io.StringOutput()	(call getContent() after run() to get StringBuffer with content)
			//
			// Java IO reader/writer (available for XML and text):
			//   com.altova.io.ReaderInput(java.io.Reader reader)
			//   com.altova.io.WriterOutput(java.io.Writer writer)
			//
			// DOM documents (for XML only):
			//   com.altova.io.DocumentInput(org.w3c.dom.Document document)
			//   com.altova.io.DocumentOutput(org.w3c.dom.Document document)
			// 
			// By default, run will close all inputs and outputs. If you do not want this,
			// call the following function:
			// MappingMapToUTM_Input2Object.setCloseObjectsAfterRun(false);

			{
				com.altova.io.Input PayrollIISource = com.altova.io.StreamInput.createInput("10 07 16 Deltek.CSV");
				com.altova.io.Output UTM_Input2Target = new com.altova.io.FileOutput("UTM_DATE_Import_II.csv");

				MappingMapToUTM_Input2Object.run(
						PayrollIISource,
						com.altova.CoreTypes.castToString((String)mapArguments.get("Date")),
						UTM_Input2Target);
			}



				jTraceTextArea.append("Finished\n");
			} catch (Exception ex) {
				jTraceTextArea.append("ERROR: " + ex.getMessage());
			}

			jStartButton.setEnabled(true);
		}
    }

	void jDateTextField3_actionPerformed( KeyEvent e ) {
		if ( e.getSource().equals( jDateTextField3 ) ) {
			String value = jDateTextField3.getText();
			if( value.length() != 0 )
				mapArguments.put( "Date", value );
			else {
				if( mapArguments.containsKey( "Date" ) )
					mapArguments.remove( "Date" );
			}
		}
	}


	public void writeTrace(String info) {
		jTraceTextArea.append(info);
	}
}

class BreerRabbitFrame_jStartButton_actionAdapter
	implements java.awt.event.ActionListener {
	BreerRabbitFrame adaptee;

	BreerRabbitFrame_jStartButton_actionAdapter(BreerRabbitFrame adaptee) {
		this.adaptee = adaptee;
	}

	public void actionPerformed(ActionEvent e) {
		adaptee.jStartButton_actionPerformed(e);
	}
}


class BreerRabbitFrame_jDateTextField3_keyAdapter
	implements java.awt.event.KeyListener {
	BreerRabbitFrame adaptee;

	BreerRabbitFrame_jDateTextField3_keyAdapter( BreerRabbitFrame adaptee ) {
		this.adaptee = adaptee;
	}

	public void keyTyped( KeyEvent e ) {
		adaptee.jDateTextField3_actionPerformed( e );
	}

	public void keyPressed( KeyEvent e ) {
		adaptee.jDateTextField3_actionPerformed( e );
	}

	public void keyReleased( KeyEvent e ) {
		adaptee.jDateTextField3_actionPerformed( e );
	}

}

