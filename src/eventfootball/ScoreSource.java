/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventfootball;

import java.util.ArrayList;

/**
 *
 * @author tomaeyo
 */
public class ScoreSource {
    ArrayList<ScoreListener> scoreListener;
    
    public ScoreSource() {
        scoreListener = new ArrayList<>();
    }
    
    public void addSubscriber(ScoreListener obj) {
        scoreListener.add(obj);
    } 
    
    public void setScore(String value) {
        fireScoreEvent(new ScoreEvent(this, value));
    }
    
    public void fireScoreEvent(ScoreEvent evt) {
        for (ScoreListener scoreListeners : scoreListener) {
            scoreListeners.scoreChange(evt);
        }
    }
}
