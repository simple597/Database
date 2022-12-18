package Dao;

import Entity.Score;

public interface ScoreDAO {
    void addScore(Score score);
    void updateScore(Score score);
    void deleteScore(String score_CNo,String SNo);
    Score getScore(String score_CNo,String SNo);
}
