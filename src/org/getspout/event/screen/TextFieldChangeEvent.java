package org.getspout.event.screen;

import org.getspout.gui.Screen;
import org.getspout.gui.TextField;
import org.getspout.player.ContribPlayer;

public class TextFieldChangeEvent extends ScreenEvent{

	protected TextField field;
	protected String oldVal;
	protected String newVal;
	public TextFieldChangeEvent(ContribPlayer player, Screen screen, TextField field, String newVal) {
		super("TextFieldChangeEvent", player, screen);
		this.field = field;
		this.oldVal = field.getText();
		this.newVal = newVal;
	}
	
	public TextField getTextField() {
		return field;
	}
	
	public String getOldText() {
		return oldVal;
	}
	
	public String getNewText() {
		return newVal;
	}
	
	public void setNewText(String newVal) {
		if (newVal == null) newVal = "";
		this.newVal = newVal;
	}

}