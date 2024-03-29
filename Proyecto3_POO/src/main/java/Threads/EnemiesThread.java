
package Threads;

import Game.GameController;
import Prototypes.Enemy;
import java.util.logging.Level;
import java.util.logging.Logger;




public class EnemiesThread extends Thread{
    ///////////////
    // Atributes //
    ///////////////

    Enemy enemy;
    GameController refController;
    boolean isRunning = true;
 
    
    
    
    /////////////////
    // Contructors //
    /////////////////
    
    public EnemiesThread(){
    }
    
    
    
    
    /////////////
    // Methods //
    /////////////   
    @Override
    public void run(){
        while (isRunning){
            try{
                refController.enemyEvents(enemy.getLabel());
                sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(EnemiesThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
