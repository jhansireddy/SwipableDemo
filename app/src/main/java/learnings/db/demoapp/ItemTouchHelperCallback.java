package learnings.db.demoapp;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;

import com.loopeer.itemtouchhelperextension.Extension;
import com.loopeer.itemtouchhelperextension.ItemTouchHelperExtension;

public class ItemTouchHelperCallback extends ItemTouchHelperExtension.Callback {
    @Override
    public int getMovementFlags(android.support.v7.widget.RecyclerView recyclerView, android.support.v7.widget.RecyclerView.ViewHolder viewHolder) {
        return makeMovementFlags(0, ItemTouchHelper.START);
    }

    @Override
    public boolean onMove(android.support.v7.widget.RecyclerView recyclerView, android.support.v7.widget.RecyclerView.ViewHolder viewHolder, android.support.v7.widget.RecyclerView.ViewHolder target) {
        return false;
    }

    @Override
    public void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    }

    @Override
    public void onChildDraw(Canvas c, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {

        if (viewHolder instanceof Extension) {
            float actionsWidth = ((Extension) viewHolder).getActionWidth();
            Log.d("", "DX:"+ dX +"Actionwidth:"+ actionsWidth);
            if (dX < -actionsWidth) {
                dX = -actionsWidth;
            }
            ((ActionableViewHolder) viewHolder).getRootView().setTranslationX(dX);
        }
    }
}
