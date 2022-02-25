package Game;

import java.util.*;

public class Bowling {

  HashMap<String, Integer> players;

  Bowling() {
    players = new HashMap<String, Integer>();
  }

  public void addPlayer(String name, int p) {
    players.put(name, p);
  }

  public void getWinner() {
    ArrayList<Integer> values = new ArrayList<>(players.values());
    int max = Collections.max(values);
    for (String key : players.keySet()) {
      if (players.get(key) == max) {
        System.out.println(key);
      }
    }
  }
}