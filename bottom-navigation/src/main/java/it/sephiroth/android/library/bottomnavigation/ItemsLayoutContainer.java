package it.sephiroth.android.library.bottomnavigation;

import android.support.annotation.NonNull;
import android.view.ViewGroup;

import proguard.annotation.Keep;
import proguard.annotation.KeepClassMembers;

/**
 * Created by alessandro on 4/4/16 at 11:13 PM.
 * Project: Material-BottomNavigation
 */
@Keep
@KeepClassMembers
public interface ItemsLayoutContainer {
    void setSelectedIndex(int index);

    int getSelectedIndex();

    void populate(@NonNull BottomNavigationItem[] entries);

    void setLayoutParams(ViewGroup.LayoutParams params);

    void setOnItemClickListener(OnItemClickListener listener);
}
