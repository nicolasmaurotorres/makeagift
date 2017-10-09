package inc.maro.makeagift2.Services;

import android.os.Binder;

import java.util.ArrayList;

import inc.maro.makeagift2.Containers.Gift;
import inc.maro.makeagift2.Containers.GiftDisplayed;
import inc.maro.makeagift2.MVP.Presenters.GiftPresenter;
import inc.maro.makeagift2.MVP.Presenters.LobbyPresenter;

public class DatabaseCallBackBinder extends Binder implements ICallBackBinder {

    private DatabaseService service = null;

    public DatabaseCallBackBinder(DatabaseService pepe){
        super();
        this.service = pepe;
    }

    @Override
    public void fetchTargetNames(GiftPresenter presenter){
        service.fillTargetNames(presenter);
    }

    @Override
    public void createNewGift(String target, String description, String date, String where, GiftPresenter presenter){
        this.service.createNewGift(target,description,date,where, presenter);
    }

    @Override
    public void updateGift(Gift modifiedGift){
        this.service.updateModifiedGift(modifiedGift);
    }

    @Override
    public void drawAllGifts(LobbyPresenter presenter){
        this.service.drawAllGifts(presenter);
    }

    @Override
    public void clearTables()
    {
        this.service.clearTables();
    }

    @Override
    public void updateGiftPositions(ArrayList<GiftDisplayed> gifts) {
        this.service.updateGiftPositions(gifts);
    }

    @Override
    public void deleteGift(Gift possibleGift) {
        this.service.deleteGift(possibleGift);
    }

    @Override
    public void getGiftById(Integer currentGift, GiftPresenter presenter) {
        this.service.getGiftById(currentGift,presenter);
    }
}