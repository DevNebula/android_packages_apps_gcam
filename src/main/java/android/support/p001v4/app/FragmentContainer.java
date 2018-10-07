package android.support.p001v4.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* compiled from: PG */
/* renamed from: android.support.v4.app.FragmentContainer */
public abstract class FragmentContainer {
    public abstract View onFindViewById(int i);

    public abstract boolean onHasView();

    public Fragment instantiate(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }
}
