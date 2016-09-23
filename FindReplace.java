package com.xavient.swing;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class FindReplace extends JFrame implements ItemListener, ActionListener {

	JFrame f;
	JButton findbtn,replacebtn,replaceAllbtn,closebtn;

	public FindReplace() {
		super("Find/Replace");

		String[] Find = {};

		JLabel find = new JLabel("Find:");
		find.setBounds(10, 15, 90, 18);
		find.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		add(find);

		JComboBox findcb = new JComboBox(Find);
		findcb.setBounds(110, 15, 120, 20);
		findcb.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		findcb.setEditable(true);
		findcb.addActionListener(this);
		add(findcb);

		JLabel replace_With = new JLabel("Replace with:");
		replace_With.setBounds(10, 45, 90, 20);
		replace_With.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		add(replace_With);

		JComboBox replacecb = new JComboBox(Find);
		replacecb.setBounds(110, 45, 120, 20);
		replacecb.setEditable(true);
		replacecb.addActionListener(this);
		add(replacecb);

		ButtonGroup bg1 = new ButtonGroup();
		JRadioButton rb1 = new JRadioButton("Forward");
		rb1.setBounds(10, 50, 10, 0);
		rb1.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		rb1.setSelected(true);
		JRadioButton rb2 = new JRadioButton("Backward");
		rb2.setBounds(10, 50, 10, 0);
		rb2.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		bg1.add(rb1);
		bg1.add(rb2);
		JPanel direc = new JPanel();
		direc.setBounds(5, 80, 110, 75);
		direc.add(rb1);
		direc.add(rb2);
		direc.setBorder(BorderFactory.createTitledBorder("Direction"));
		direc.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		direc.setLayout(new BoxLayout(direc, BoxLayout.Y_AXIS));
		direc.setAlignmentX(Component.LEFT_ALIGNMENT);
		add(direc);

		ButtonGroup bg = new ButtonGroup();
		JRadioButton rb3 = new JRadioButton("All");
		rb3.setBounds(10, 50, 10, 0);
		rb3.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		rb3.setSelected(true);
		JRadioButton rb4 = new JRadioButton("Selected lines");
		rb4.setBounds(10, 50, 10, 0);
		rb4.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		bg.add(rb3);
		bg.add(rb4);
		JPanel scope = new JPanel();
		scope.setBounds(120, 80, 120, 75);
		scope.add(rb3);
		scope.add(rb4);
		scope.setBorder(BorderFactory.createTitledBorder("Scope"));
		scope.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		scope.setLayout(new BoxLayout(scope, BoxLayout.Y_AXIS));
		scope.setAlignmentX(Component.LEFT_ALIGNMENT);
		add(scope);

		JCheckBox cs = new JCheckBox("Case Sensitive");
		cs.setBounds(5, 50, 10, 0);
		cs.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		JCheckBox ws = new JCheckBox("Wrap Search");
		ws.setBounds(5, 10, 10, 0);
		ws.setSelected(true);
		ws.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		JCheckBox ww = new JCheckBox("Whole word");
		ww.setBounds(5, 50, 10, 0);
		ww.setSelected(true);
		ww.setEnabled(false);
		ww.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		JCheckBox inc = new JCheckBox("Incremental");
		inc.setBounds(5, 50, 10, 0);
		inc.setFont(new Font("Arial Narrow", Font.PLAIN, 13));
		JCheckBox re = new JCheckBox("Regular expressions");
		re.setBounds(5, 50, 10, 0);
		re.setFont(new Font("Arial Narrow", Font.PLAIN, 13));

		JPanel options = new JPanel();
		options.setBounds(4, 158, 235, 110);
		options.add(cs);
		options.add(ws);
		options.add(ww);
		options.add(inc);
		options.add(re);
		options.setBorder(BorderFactory.createTitledBorder("Options"));
		// options.setLayout(new BoxLayout(options,BoxLayout.PAGE_AXIS));
		// options.setAlignmentX(Component.CENTER_ALIGNMENT);
		add(options);

		findbtn = new JButton("Find");
		findbtn.setBounds(70, 275, 80, 25);
		replacebtn = new JButton("Replace");
		replacebtn.setBounds(155, 275, 80, 25);
		replaceAllbtn = new JButton("Replace All");
		replaceAllbtn.setBounds(53, 310, 98, 25);
		closebtn = new JButton("Close");
		closebtn.setBounds(155, 310, 80, 25);

		add(findbtn);
		add(replacebtn);
		add(replaceAllbtn);
		add(closebtn);

		setLayout(null);
		setSize(250, 375);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		try {	
			if(e.)
			Component Frame = null;
			JOptionPane.showMessageDialog(Frame, "This is Working");
		} catch (Exception e2) {
			e2.printStackTrace();
			System.out.println(e2.toString());
		}
	}

	public void itemStateChanged(ItemEvent arg0) {
		try {
			Component frame = null;
			JOptionPane.showMessageDialog(frame, "This is also not working");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new FindReplace();
	}

}
