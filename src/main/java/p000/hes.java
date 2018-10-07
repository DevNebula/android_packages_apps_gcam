package p000;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: hes */
public final class hes {
    /* renamed from: a */
    public final FrameLayout f6477a;
    /* renamed from: b */
    public final FrameLayout f6478b;
    /* renamed from: c */
    public final FrameLayout f6479c;
    /* renamed from: d */
    public final FrameLayout f6480d;
    /* renamed from: e */
    public final C0345kz f6481e;
    /* renamed from: f */
    public final ListView f6482f;
    /* renamed from: g */
    public final ImageView f6483g;
    /* renamed from: h */
    public final View f6484h;
    /* renamed from: i */
    public final View f6485i;
    /* renamed from: j */
    public final hkg f6486j;

    hes(hkg hkg) {
        ikd.m12501a();
        this.f6486j = hkg;
        this.f6477a = (FrameLayout) hkg.mo7919a((int) R.id.camera_app_root);
        this.f6478b = (FrameLayout) hkg.mo7919a((int) R.id.camera_app_root_overlay);
        this.f6479c = (FrameLayout) hkg.mo7919a((int) R.id.camera_filmstrip_content_layout);
        this.f6485i = (View) hkg.mo7919a((int) R.id.accessibility_affordances);
        this.f6480d = (FrameLayout) hkg.mo7919a((int) R.id.optionsbar2);
        this.f6481e = (C0345kz) hkg.mo7919a((int) R.id.toybox_drawer);
        this.f6482f = (ListView) hkg.mo7919a((int) R.id.toybox_drawer_list);
        this.f6483g = (ImageView) hkg.mo7919a((int) R.id.toybox_menu_button);
        this.f6484h = (View) hkg.mo7919a((int) R.id.preview_scrim);
    }
}
