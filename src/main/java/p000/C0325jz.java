package p000;

import android.database.DataSetObserver;
import android.support.p001v4.view.ViewPager;

/* compiled from: PG */
/* renamed from: jz */
public final class C0325jz extends DataSetObserver {
    /* renamed from: a */
    private final /* synthetic */ ViewPager f8453a;

    public C0325jz(ViewPager viewPager) {
        this.f8453a = viewPager;
    }

    public final void onChanged() {
        this.f8453a.mo1054a();
    }

    public final void onInvalidated() {
        this.f8453a.mo1054a();
    }
}
