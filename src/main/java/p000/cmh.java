package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.widget.Toolbar;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: cmh */
final class cmh {
    /* renamed from: a */
    public final Toolbar f2329a;
    /* renamed from: b */
    public final cmm f2330b;
    /* renamed from: c */
    public final Resources f2331c;
    /* renamed from: d */
    public final kbn f2332d;
    /* renamed from: e */
    public Menu f2333e;
    /* renamed from: f */
    public Drawable f2334f;
    /* renamed from: g */
    public Drawable f2335g;
    /* renamed from: h */
    public int f2336h = -1;

    cmh(cmm cmm, Resources resources, kbn kbn, View view) {
        this.f2330b = cmm;
        this.f2331c = resources;
        this.f2332d = kbn;
        this.f2329a = (Toolbar) view.findViewById(R.id.toolbar);
    }

    /* renamed from: a */
    final void mo2375a(boolean z) {
        this.f2333e.findItem(R.id.action_delete).setVisible(z);
    }

    /* renamed from: b */
    final void mo2376b(boolean z) {
        int i = this.f2336h;
        if (i != -1) {
            this.f2333e.findItem(i).setVisible(z);
        }
    }

    /* renamed from: c */
    final void mo2377c(boolean z) {
        this.f2333e.findItem(R.id.action_share).setVisible(z);
    }
}
