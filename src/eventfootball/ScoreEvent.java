/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventfootball;
import java.util.EventObject;
/**
 *
 * @author tomaeyo
 */
public class ScoreEvent extends EventObject{
    private String score;
    
    public String getScore() {
        return score;
    }
    
    public ScoreEvent(Object o, String value) {
        super(o);
        score = value;
    }
}
