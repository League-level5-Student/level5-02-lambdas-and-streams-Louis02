package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LambdaButtons  {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addLambdas();
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}
	public void addLambdas() {
		ArrayList <Integer> al = new ArrayList<Integer>();
	addNumbers.addActionListener((ActionEvent e)->{
		for(int i = 0; i<2;i++) {
			int r = new Random().nextInt(100);
			al.add(r);
		}
	});
	randNumber.addActionListener((ActionEvent e)->{
		int r = new Random().nextInt(al.size());
		System.out.println(r);
	});
	
	tellAJoke.addActionListener((ActionEvent e)->{
		System.out.println("Why did the chicken cross the road");
	
		System.out.println("To get to the otherside");
	});
	}

	
}
