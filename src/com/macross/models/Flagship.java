package com.macross.models;
import static com.macross.utils.Logger.log;

public class Flagship implements StarshipAttack {

	public void doAttack() {
		log("Attack with laser");
	}
	
	public void doFly() {
		log("Fly slower");
	}
	
}
