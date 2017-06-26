package application;

import android.app.Application;

import actors.CPUActor;
import actors.PlayerActor;
import actors.GameViewActor;
import akka.actor.ActorSystem;
import akka.actor.Props;
import utils.Constants;

/**
 * @author Michele Sapignoli
 */

public class mApplication extends Application {
    private static ActorSystem system;
    @Override
    public void onCreate() {
        super.onCreate();

        system = ActorSystem.create("system");
        system.actorOf(Props.create(PlayerActor.class), Constants.PLAYER_ACTOR_NAME);
        system.actorOf(Props.create(CPUActor.class), Constants.CPU_ACTOR_NAME);
        system.actorOf(Props.create(GameViewActor.class), Constants.GAMEVIEW_ACTOR_NAME);
    }

    public static ActorSystem getActorSystem(){
        return system;
    }
}