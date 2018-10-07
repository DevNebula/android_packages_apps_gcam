package p000;

import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: crt */
public final class crt {
    /* renamed from: a */
    public final ProgressBar f2807a;
    /* renamed from: b */
    public boolean f2808b = false;
    /* renamed from: c */
    private final Resources f2809c;
    /* renamed from: d */
    private final LinearLayout f2810d;
    /* renamed from: e */
    private final ImageView f2811e;
    /* renamed from: f */
    private final TextView f2812f;
    /* renamed from: g */
    private boolean f2813g = true;
    /* renamed from: h */
    private int f2814h = C0252go.f5783I;
    /* renamed from: i */
    private int f2815i;
    /* renamed from: j */
    private CharSequence f2816j = new cru();

    public crt(ctw ctw, Resources resources) {
        this.f2809c = resources;
        this.f2810d = ctw.f2936c;
        this.f2811e = ctw.f2937d;
        this.f2812f = ctw.f2938e;
        this.f2807a = ctw.f2939f;
        this.f2807a.setMax(100);
    }

    /* renamed from: a */
    public final void mo5702a(boolean z) {
        this.f2813g = z;
        mo5699a();
    }

    /* renamed from: a */
    public final void mo5701a(CharSequence charSequence) {
        this.f2816j = charSequence;
        mo5699a();
    }

    /* renamed from: a */
    public final void mo5699a() {
        if (this.f2813g) {
            this.f2810d.setVisibility(0);
            if (this.f2808b) {
                this.f2807a.setVisibility(0);
                this.f2811e.setVisibility(8);
                this.f2812f.setText(this.f2816j);
                return;
            }
            this.f2807a.setVisibility(8);
            this.f2811e.setVisibility(0);
            switch (this.f2814h - 1) {
                case 0:
                    this.f2810d.setVisibility(8);
                    return;
                case 1:
                    this.f2811e.setImageDrawable(this.f2809c.getDrawable(R.drawable.ic_photosphere_normal));
                    this.f2812f.setText(this.f2809c.getText(R.string.mode_photosphere));
                    return;
                case 2:
                    this.f2811e.setImageDrawable(this.f2809c.getDrawable(R.drawable.ic_panorama_normal));
                    this.f2812f.setText(this.f2809c.getText(R.string.mode_panorama));
                    return;
                case 3:
                    this.f2811e.setImageDrawable(this.f2809c.getDrawable(R.drawable.ic_refocus));
                    this.f2812f.setText(this.f2809c.getText(R.string.mode_refocus));
                    return;
                case 4:
                    this.f2811e.setImageDrawable(this.f2809c.getDrawable(R.drawable.ic_slow_motion_video));
                    this.f2812f.setText(this.f2809c.getText(R.string.mode_video_slomo));
                    return;
                case 5:
                    this.f2811e.setVisibility(8);
                    this.f2812f.setText(hci.m11978a(R.plurals.burst, this.f2815i, Integer.valueOf(this.f2815i)).mo7762a(this.f2809c));
                    return;
                case 6:
                    this.f2811e.setImageDrawable(this.f2809c.getDrawable(R.drawable.ic_auto_awesome_white_36dp));
                    this.f2812f.setText(this.f2809c.getText(R.string.animation));
                    return;
                case 7:
                    this.f2811e.setImageDrawable(this.f2809c.getDrawable(R.drawable.ic_auto_awesome_white_36dp));
                    this.f2812f.setText(this.f2809c.getText(R.string.collage));
                    return;
                default:
                    return;
            }
        }
        this.f2810d.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo5700a(err err) {
        if (err == null) {
            this.f2814h = C0252go.f5783I;
            mo5699a();
            return;
        }
        if (err.mo6545k().f4343b.f4358o) {
            this.f2814h = C0252go.f5784J;
        } else if (err.mo6545k().f4343b.f4349f) {
            this.f2814h = C0252go.f5785K;
        } else if (err.mo6545k().f4343b.f4352i) {
            this.f2814h = C0252go.f5786L;
        } else if (err.mo6545k().f4343b.f4348e > 60) {
            this.f2814h = C0252go.f5787M;
        } else if (err.mo6545k().f4343b.f4353j) {
            this.f2814h = C0252go.f5788N;
            this.f2815i = err.mo6545k().f4343b.f4354k;
        } else if (err.mo6545k().f4343b.f4355l) {
            this.f2814h = C0252go.f5789O;
        } else if (err.mo6545k().f4343b.f4356m) {
            this.f2814h = C0252go.f5790P;
        } else {
            this.f2814h = C0252go.f5783I;
        }
        mo5699a();
    }
}
