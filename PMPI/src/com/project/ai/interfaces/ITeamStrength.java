package com.project.ai.interfaces;

import java.util.HashMap;

public interface ITeamStrength {
	
	// residual matches difficulty
	HashMap<String, int[]> getPreviousStandingsAllOpponents(String teamId, String matchId, int howManyPrevSeasons);

	// Get the <standings, points, wins, draws, losses, GF, GA, GD> for a team for a
	// particular season
	HashMap<String, int[]> getStandingsOfSeason(String season);

	// Returns final total points in previous seasons by that team
	int getTotalPointsHistory(String teamId, String whichPrevSeason);

}
