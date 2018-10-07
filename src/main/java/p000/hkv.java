package p000;

import android.app.AlertDialog;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: hkv */
public class hkv {
    /* renamed from: a */
    public final gvt f6681a;
    /* renamed from: b */
    public final String f6682b;
    /* renamed from: c */
    public final gtl f6683c;
    /* renamed from: d */
    public final eij f6684d;
    /* renamed from: e */
    public final BottomBarController f6685e;
    /* renamed from: f */
    public final gxz f6686f;
    /* renamed from: g */
    public ebd f6687g;
    /* renamed from: h */
    public AlertDialog f6688h;
    /* renamed from: i */
    private final View f6689i;
    /* renamed from: j */
    private final Resources f6690j;
    /* renamed from: k */
    private final TextView f6691k = ((TextView) this.f6689i.findViewById(R.id.recording_time));
    /* renamed from: l */
    private final how f6692l;

    public hkv(gvt gvt, View view, Resources resources, LayoutInflater layoutInflater, gtl gtl, eij eij, BottomBarController bottomBarController, gxz gxz, how how) {
        this.f6689i = view;
        this.f6690j = resources;
        this.f6681a = gvt;
        this.f6684d = eij;
        this.f6685e = bottomBarController;
        this.f6686f = gxz;
        this.f6692l = how;
        ViewGroup viewGroup = (ViewGroup) this.f6689i.findViewById(R.id.root_module_layout);
        viewGroup.removeAllViews();
        layoutInflater.inflate(R.layout.video_module, viewGroup, true);
        gxz.mo7534a(this.f6691k);
        this.f6682b = this.f6690j.getString(R.string.video_accessibility_peek);
        this.f6683c = gtl;
    }

    /* renamed from: a */
    public OnClickListener mo7927a() {
        return new djw(this);
    }

    /* renamed from: e */
    private final OnDismissListener m3287e() {
        return new djy(this);
    }

    /* renamed from: b */
    public OnClickListener mo7930b() {
        return new djx(this);
    }

    /* renamed from: a */
    public final void mo7928a(inc inc) {
        this.f6692l.mo8000a(kbg.m4803b(inc));
    }

    /* renamed from: b */
    public final void mo7931b(boolean z) {
        this.f6687g.mo13122c(false);
        if (z) {
            this.f6688h = this.f6683c.mo7444d(mo7930b());
            this.f6688h.getWindow().setLayout(-1, -1);
            this.f6688h.setOnDismissListener(m3287e());
            return;
        }
        this.f6688h = this.f6683c.mo7445e(mo7930b());
        mo7934d();
    }

    /* renamed from: c */
    public final void mo7933c(boolean z) {
        this.f6684d.mo6224A();
        mo7936e(z);
    }

    /* renamed from: a */
    public void mo7929a(boolean z) {
        this.f6687g.mo13119b(z);
        if (z) {
            this.f6687g.mo13124d(false);
        }
    }

    /* renamed from: d */
    public final void mo7935d(boolean z) {
        this.f6685e.setSnapshotButtonClickEnabled(z);
    }

    /* renamed from: e */
    public final void mo7936e(boolean z) {
        mo7929a(true);
        this.f6681a.mo7474a(false);
        this.f6686f.mo7535a(z);
        this.f6687g.mo13134o();
    }

    /* renamed from: d */
    public final void mo7934d() {
        this.f6688h.setOnDismissListener(m3287e());
        if (!this.f6688h.isShowing()) {
            this.f6688h.show();
            ((TextView) this.f6688h.findViewById(16908299)).setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* renamed from: c */
    public void mo7932c() {
        this.f6687g.mo13121c(hhx.VIDEO);
    }
}
