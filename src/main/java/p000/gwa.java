package p000;

import android.graphics.Bitmap;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView.Callback;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: gwa */
final class gwa implements eok, eol, gvt {
    /* renamed from: a */
    public final awk f19713a;
    /* renamed from: b */
    public final List f19714b = new ArrayList();
    /* renamed from: c */
    public boolean f19715c = true;
    /* renamed from: d */
    private final RoundedThumbnailView f19716d;
    /* renamed from: e */
    private final Callback f19717e = new gwc(this);
    /* renamed from: f */
    private boolean f19718f = false;

    gwa(het het, awk awk) {
        this.f19713a = awk;
        this.f19716d = het.f6493g;
        this.f19716d.setCallback(this.f19717e);
        this.f19716d.setEnabled(true);
        mo7472a(hip.SECURE);
    }

    /* renamed from: a */
    public final iqo mo7469a(gvu gvu) {
        this.f19714b.add(gvu);
        return new gwb(this, gvu);
    }

    /* renamed from: a */
    public final void mo7470a() {
    }

    /* renamed from: j */
    public final void mo6373j() {
        this.f19716d.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo7474a(boolean z) {
        this.f19718f = z;
    }

    /* renamed from: a */
    public final void mo7472a(hip hip) {
        this.f19716d.setThumbnail(this.f19716d.getDefaultThumbnail(hip), 0);
    }

    /* renamed from: b */
    public final void mo7475b() {
        this.f19715c = true;
        this.f19716d.setEnabled(true);
        mo7472a(hip.SECURE);
    }

    /* renamed from: a */
    public final void mo7473a(String str) {
        if (!this.f19718f && this.f19716d.getVisibility() == 0) {
            this.f19716d.startRevealThumbnailAnimation(str);
        }
    }

    /* renamed from: a */
    public final void mo7471a(Bitmap bitmap, int i) {
        this.f19715c = false;
        this.f19716d.setEnabled(true);
        this.f19716d.setThumbnail(bitmap, i);
    }
}
