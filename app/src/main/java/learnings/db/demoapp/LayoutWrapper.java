package learnings.db.demoapp;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class LayoutWrapper {

    public static FrameLayout wrap(View itemView, int siblingLayout) {
        FrameLayout mainLayout = new FrameLayout(itemView.getContext());
        mainLayout.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        LayoutInflater layoutInflater = LayoutInflater.from(itemView.getContext());
        View actions = layoutInflater.inflate(siblingLayout, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT);
        layoutParams.gravity = Gravity.END;
        mainLayout.addView(actions, layoutParams);
        mainLayout.addView(itemView, 1);
        return mainLayout;
    }
}
