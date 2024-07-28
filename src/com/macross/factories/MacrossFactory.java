package com.macross.factories;

import com.macross.models.Sdf1Bomber;
import com.macross.models.StarshipAttack;
import com.macross.models.StarshipBomber;
import com.macross.models.Varitech;

public class MacrossFactory implements StarshipFactory {

	@Override
	public StarshipAttack createAttackStarship() {
		return new Varitech();
	}

	@Override
	public StarshipBomber createBomberStarship() {
		return new Sdf1Bomber();
	}
	
}
