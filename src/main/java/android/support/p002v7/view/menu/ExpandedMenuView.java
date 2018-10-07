package android.support.p002v7.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import p000.C0407or;
import p000.C0412pg;
import p000.C0540vk;
import p000.C0734op;
import p000.C0736ot;

/* compiled from: PG */
/* renamed from: android.support.v7.view.menu.ExpandedMenuView */
public final class ExpandedMenuView extends ListView implements OnItemClickListener, C0407or, C0412pg {
    /* renamed from: a */
    private static final int[] f10522a = new int[]{16842964, 16843049};
    /* renamed from: b */
    private C0734op f10523b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0540vk a = C0540vk.m6109a(context, attributeSet, f10522a, i, 0);
        if (a.mo11398f(0)) {
            setBackgroundDrawable(a.mo11390b(0));
        }
        if (a.mo11398f(1)) {
            setDivider(a.mo11390b(1));
        }
        a.f9927b.recycle();
    }

    /* renamed from: a */
    public final void mo10856a(C0734op c0734op) {
        this.f10523b = c0734op;
    }

    /* renamed from: a */
    public final boolean mo10836a(C0736ot c0736ot) {
        return this.f10523b.mo14299a((MenuItem) c0736ot, null, 0);
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo10836a((C0736ot) getAdapter().getItem(i));
    }
}
