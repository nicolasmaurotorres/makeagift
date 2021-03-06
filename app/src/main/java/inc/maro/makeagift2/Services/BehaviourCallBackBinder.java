package inc.maro.makeagift2.Services;

import android.os.Binder;

import inc.maro.makeagift2.Activities.GiftActivity;
import inc.maro.makeagift2.Containers.Gift;


/**
 * Created by hIT on 23/8/2017.
 */

public class BehaviourCallBackBinder extends Binder implements ICallBackBinder {

    private BehaviourService service = null;

    public BehaviourCallBackBinder(BehaviourService pepe)
    {
        super();
        this.service = pepe;
    }

    @Override
    public void arrangeFloatingActions() {
        //todo tirarle la pelota de organizar al servicio
    }

    @Override
    public void fillTargetNames(GiftActivity activity)
    {
        this.service.fillTargetNames(activity);
    }

    @Override
    public void createNewGift(String target, String description, String date, String where, GiftActivity activity)
    {
        this.service.createNewGift(target,description,date,where,activity);
    }

    @Override
    public void updateGift(Gift modifiedGift)
    {
        this.service.updateModifiedGift(modifiedGift);
    }

    @Override
    public void createNewTarget(Gift possibleGift, GiftActivity activity)
    {
        this.service.creteNewTarget(possibleGift,activity);
    }

    @Override
    public void updateTarget(long idGift, int idTarget)
    {
        this.service.updateIdTargetGift(idGift, idTarget);
    }
}
