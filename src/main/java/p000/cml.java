package p000;

import android.view.MenuItem;
import android.widget.Toolbar.OnMenuItemClickListener;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: cml */
final class cml implements OnMenuItemClickListener {
    /* renamed from: a */
    private final /* synthetic */ cmh f2340a;

    cml(cmh cmh) {
        this.f2340a = cmh;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_share) {
            this.f2340a.f2330b.mo2385i();
        } else if (itemId == R.id.action_delete) {
            this.f2340a.f2330b.mo2383g();
        }
        return false;
    }
}
