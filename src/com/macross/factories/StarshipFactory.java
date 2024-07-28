package com.macross.factories;

import com.macross.models.StarshipAttack;
import com.macross.models.StarshipBomber;

public interface StarshipFactory {
	StarshipAttack createAttackStarship();
	StarshipBomber createBomberStarship();
}
