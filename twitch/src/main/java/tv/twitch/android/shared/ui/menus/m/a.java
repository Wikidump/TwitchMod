package tv.twitch.android.shared.ui.menus.m;

import android.view.View;
import android.widget.ArrayAdapter;

/**
 * Source: DropDownMenuModel
 */
public class a<T> extends tv.twitch.android.shared.ui.menus.l.b {
    public interface a1<T> { // TODO: __RENAME_a
        void a(a<T> aVar, int i2, boolean z);
    }

    public a(ArrayAdapter<T> arrayAdapter, int i2, String str, String str2, String str3, View.OnClickListener onClickListener, a1<T> a1Var) {}
}
