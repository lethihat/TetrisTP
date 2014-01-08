package fr.gphy.matbcih.tetris.tetristp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.Button;
import java.awt.Dimension;

/**
 *
 * @author ebouihol
 */
public class TetrisButton extends Button {
		public TetrisButton(String label) {
			super(label);
		}
		public Dimension getPreferredSize() {
			return new Dimension(120, super.getPreferredSize().height);
		}
	}