package com.macross.factories;

import com.macross.models.Flagship;
import com.macross.models.StarshipAttack;
import com.macross.models.StarshipBomber;
import com.macross.models.ZentraediBomber;

public class FlagshipFactory implements StarshipFactory {
	@Override
	public StarshipAttack createAttackStarship() {
		return new Flagship();
	}

	@Override
	public StarshipBomber createBomberStarship() {
		return new ZentraediBomber();
	}
}
