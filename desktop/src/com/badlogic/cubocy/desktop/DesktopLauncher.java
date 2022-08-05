package com.badlogic.cubocy.desktop;


import com.badlogic.cubocy.Cubocy;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setTitle("Cubocy");
        config.setWindowedMode(800, 480);
        new Lwjgl3Application(new Cubocy(), config);
    }
}
