
package com.badlogic.cubocy;

import com.badlogic.cubocy.screens.MainMenu;
import com.badlogic.gdx.Game;

public class Cubocy extends Game {
	@Override
	public void create () {
		setScreen(new MainMenu(this));
	}
}
