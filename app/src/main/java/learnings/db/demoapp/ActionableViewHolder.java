package learnings.db.demoapp;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.FrameLayout;

import com.loopeer.itemtouchhelperextension.Extension;


public abstract class ActionableViewHolder extends ViewHolder implements Extension {

    public View actualRootView;
    public View actionButtonContainer;

    public ActionableViewHolder(View rootView) {
        super(rootView);
        if (!(rootView instanceof FrameLayout)) {
            throw new IllegalArgumentException("Framelayout missing");
        }

        actualRootView = ((FrameLayout) rootView).getChildAt(1);
        actionButtonContainer = ((FrameLayout) rootView).getChildAt(0);
    }

    public View getRootView() {
        return actualRootView;
    }

    public View getActionButtonsView() {
        return actionButtonContainer;
    }

    public float getActionWidth() {
        return actionButtonContainer.getWidth();
    }
}
