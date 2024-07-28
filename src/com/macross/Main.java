package com.macross;

import com.macross.factories.FlagshipFactory;
import com.macross.factories.StarshipFactory;
import com.macross.factories.MacrossFactory;
import com.macross.models.StarshipAttack;

public class Main {
	public static void main(String... args) {
		StarshipFactory vf = new MacrossFactory();
		StarshipAttack varitech = vf.createAttackStarship();
		varitech.doFly();
		
		StarshipFactory ff = new FlagshipFactory();
		StarshipAttack flagship = ff.createAttackStarship();
		flagship.doFly();
	}
}
