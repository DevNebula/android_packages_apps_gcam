package p000;

import android.content.Context;
import android.support.p002v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* compiled from: PG */
/* renamed from: tq */
public final class C0761tq extends C0475sh {
    /* renamed from: c */
    public C0500to f22335c;
    /* renamed from: d */
    private final int f22336d;
    /* renamed from: e */
    private final int f22337e;
    /* renamed from: f */
    private MenuItem f22338f;

    public C0761tq(Context context, boolean z) {
        super(context, z);
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f22336d = 21;
            this.f22337e = 22;
            return;
        }
        this.f22336d = 22;
        this.f22337e = 21;
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        if (this.f22335c != null) {
            int headersCount;
            C0405oo c0405oo;
            MenuItem a;
            ListAdapter adapter = getAdapter();
            C0405oo c0405oo2;
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                c0405oo2 = (C0405oo) headerViewListAdapter.getWrappedAdapter();
                headersCount = headerViewListAdapter.getHeadersCount();
                c0405oo = c0405oo2;
            } else {
                c0405oo2 = (C0405oo) adapter;
                headersCount = 0;
                c0405oo = c0405oo2;
            }
            if (motionEvent.getAction() != 10) {
                int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                if (pointToPosition != -1) {
                    headersCount = pointToPosition - headersCount;
                    a = headersCount >= 0 ? headersCount < c0405oo.getCount() ? c0405oo.getItem(headersCount) : null : null;
                } else {
                    a = null;
                }
            } else {
                a = null;
            }
            MenuItem menuItem = this.f22338f;
            if (menuItem != a) {
                C0734op c0734op = c0405oo.f9514a;
                if (menuItem != null) {
                    this.f22335c.mo11158b(c0734op, menuItem);
                }
                this.f22338f = a;
                if (a != null) {
                    this.f22335c.mo11157a(c0734op, a);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f22336d) {
            if (listMenuItemView.isEnabled() && listMenuItemView.f10524a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i != this.f22337e) {
            return super.onKeyDown(i, keyEvent);
        } else {
            setSelection(-1);
            ((C0405oo) getAdapter()).f9514a.mo14298a(false);
            return true;
        }
    }
}
