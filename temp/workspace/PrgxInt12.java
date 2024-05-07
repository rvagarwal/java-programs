package workspace;

public class PrgxInt12 {


}

/**
 * IPL Application design
 *
 * 2 innings
 * 120 baller per each
 * ScoreCard(CurrentScore, Wickets, Remaining Balls):: displayScore(wicket, run, ballsRemailing)
 * Team(name, List<Players>, MetaData())
 * Players(id, name, role, getHistory(plyerId),)
 * Match
 *
 *
 * getTopStrikeRatePlayer(Teamname, playerCount)
 * GetTeamByName(name).getPlayers().stream().sorted(
 * Comparator.comparing(player -> player.getHistory.getStrikeRate).reverse())
 * .limit(playerCount).collect(Collectors.ToList())
 *
 * Map<Boolean, List<Player>> map = players.stream()
 * .collect(Collection.partitionBy(player.getDexterity.equals("left")));
 *
 *
 * List<Player> alternateList = new ArrayList<>();
 * while(map.get(true).size > 0 || map.get(false).size> 0){
 *
 *     if(map.get(true).size > 0) {
 *         alternateList.add(map.get(true).get(0));
 *         map.get(true).remove(0);
 *     }
 *
 *     if(map.get(false).size > 0) {
 *  *         alternateList.add(map.get(false).get(0));
 *  *         map.get(false).remove(0);
 *  *     }
 *
 *     30 -> 15
 *
 *     1,1,1
 * }
 */
