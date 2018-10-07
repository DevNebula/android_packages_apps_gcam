package p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.ExternalViewerButton;
import com.google.android.apps.camera.p005ui.widget.Cling;
import java.lang.ref.WeakReference;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: crw */
public final class crw {
    /* renamed from: a */
    public final WeakReference f2817a;
    /* renamed from: b */
    public final ViewGroup f2818b;
    /* renamed from: c */
    public crx f2819c;
    /* renamed from: d */
    public final View f2820d;
    /* renamed from: e */
    public ExternalViewerButton f2821e;
    /* renamed from: f */
    public FrameLayout f2822f;
    /* renamed from: g */
    public View f2823g;
    /* renamed from: h */
    public TextView f2824h;
    /* renamed from: i */
    public boolean f2825i;
    /* renamed from: j */
    private final ViewGroup f2826j;
    /* renamed from: k */
    private ImageButton f2827k;
    /* renamed from: l */
    private ImageButton f2828l;
    /* renamed from: m */
    private ImageButton f2829m;
    /* renamed from: n */
    private ImageButton f2830n;
    /* renamed from: o */
    private FrameLayout f2831o;
    /* renamed from: p */
    private FrameLayout f2832p;
    /* renamed from: q */
    private FrameLayout f2833q;
    /* renamed from: r */
    private FrameLayout f2834r;
    /* renamed from: s */
    private View f2835s;

    crw(Activity activity, LayoutInflater layoutInflater, Resources resources, ctw ctw, gos gos) {
        this.f2817a = new WeakReference(activity);
        this.f2826j = ctw.f2935b;
        this.f2818b = ctw.f2934a;
        hkg a = hkg.m3276a(this.f2826j);
        this.f2820d = (View) a.mo7919a((int) R.id.bottom_control_panel);
        this.f2827k = (ImageButton) a.mo7919a((int) R.id.filmstrip_bottom_control_edit);
        this.f2827k.setOnClickListener(new cry(this));
        activity.registerForContextMenu(this.f2827k);
        this.f2827k.setLongClickable(false);
        this.f2832p = (FrameLayout) a.mo7919a((int) R.id.filmstrip_bottom_control_edit_frame);
        this.f2821e = (ExternalViewerButton) a.mo7919a((int) R.id.filmstrip_bottom_control_view);
        this.f2821e.setOnClickListener(new crz(this));
        this.f2822f = (FrameLayout) a.mo7919a((int) R.id.filmstrip_bottom_control_view_frame);
        this.f2830n = (ImageButton) a.mo7919a((int) R.id.filmstrip_bottom_control_details);
        this.f2830n.setOnClickListener(new csa(this));
        this.f2833q = (FrameLayout) a.mo7919a((int) R.id.filmstrip_bottom_control_details_frame);
        this.f2828l = (ImageButton) a.mo7919a((int) R.id.filmstrip_bottom_control_delete);
        this.f2828l.setOnClickListener(new csb(this));
        this.f2834r = (FrameLayout) a.mo7919a((int) R.id.filmstrip_bottom_control_delete_frame);
        this.f2829m = (ImageButton) a.mo7919a((int) R.id.filmstrip_bottom_control_share);
        this.f2829m.setOnClickListener(new csc(this));
        this.f2831o = (FrameLayout) a.mo7919a((int) R.id.filmstrip_bottom_control_share_frame);
        this.f2835s = (View) a.mo7919a((int) R.id.bottom_progress_panel);
        a.mo7919a((int) R.id.bottom_session_progress_text);
        this.f2835s.setVisibility(4);
        this.f2824h = (TextView) a.mo7919a((int) R.id.bottom_progress_error_text);
        this.f2823g = (View) a.mo7919a((int) R.id.bottom_progress_error_panel);
        this.f2823g.setOnClickListener(new csd(this));
        if (gos.mo7293a("default_scope", "pref_should_show_refocus_viewer_cling")) {
            Cling cling = (Cling) layoutInflater.inflate(R.layout.cling_widget, null, false);
            cling.setText(resources.getString(R.string.cling_text_for_refocus_editor_button));
            this.f2818b.addView(cling, resources.getDimensionPixelSize(R.dimen.default_cling_width), -2);
            View view = this.f2821e;
            cum cum = cum.REFOCUS;
            if (cling == null) {
                bli.m898e(ExternalViewerButton.f2519a, "Cannot set a null cling for viewer");
                return;
            }
            view.f2521c.put(cum, cling);
            cling.mo2745a(view);
        }
    }

    /* renamed from: a */
    public final void mo5706a() {
        this.f2820d.setVisibility(4);
    }

    /* renamed from: b */
    public final void mo5708b() {
        this.f2823g.setVisibility(4);
    }

    /* renamed from: a */
    public final void mo5707a(boolean z) {
        int i;
        ImageButton imageButton = this.f2828l;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageButton.setVisibility(i);
        this.f2834r.setVisibility(i);
    }

    /* renamed from: b */
    public final void mo5709b(boolean z) {
        int i;
        ImageButton imageButton = this.f2830n;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageButton.setVisibility(i);
        this.f2833q.setVisibility(i);
    }

    /* renamed from: c */
    public final void mo5710c(boolean z) {
        int i;
        ImageButton imageButton = this.f2827k;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageButton.setVisibility(i);
        this.f2832p.setVisibility(i);
    }

    /* renamed from: d */
    public final void mo5711d(boolean z) {
        int i;
        ImageButton imageButton = this.f2829m;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageButton.setVisibility(i);
        this.f2831o.setVisibility(i);
    }

    /* renamed from: e */
    public final void mo5712e(boolean z) {
        this.f2829m.setEnabled(z);
    }

    /* renamed from: f */
    public final void mo5713f(boolean z) {
        if (z) {
            this.f2826j.setVisibility(0);
        } else {
            this.f2826j.setVisibility(4);
        }
    }
}
