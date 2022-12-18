package ScoreTest;

import Dao.DAOFactory;
import Entity.Score;

public class Test2 {
    public static void main(String[] args) {
        Score score = DAOFactory.getInstance().getScoreDAO().getScore("K001","0433");
        System.out.println(score);
    }
}
