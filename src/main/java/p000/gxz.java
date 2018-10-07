package p000;

import android.content.res.Resources;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: gxz */
public final class gxz {
    /* renamed from: a */
    public long f6150a;
    /* renamed from: b */
    public Resources f6151b;
    /* renamed from: c */
    public TextView f6152c;

    /* renamed from: a */
    public final void mo7535a(boolean z) {
        if (z) {
            this.f6152c.animate().setDuration(200).alpha(0.0f).withEndAction(new gws(this));
            return;
        }
        this.f6152c.setAlpha(0.0f);
        this.f6152c.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo7532a() {
        this.f6152c.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_recording_on_red_circle, 0, 0, 0);
    }

    /* renamed from: b */
    public final void mo7536b() {
        mo7533a(0);
        mo7532a();
        this.f6152c.animate().setDuration(200).alpha(1.0f).withStartAction(new gwr(this));
    }

    /* renamed from: a */
    public final void mo7533a(long j) {
        this.f6150a = j;
        this.f6152c.setText(hkd.m3275a(this.f6150a));
    }

    /* renamed from: a */
    public final void mo7534a(TextView textView) {
        hkd hkd = new hkd();
        this.f6151b = textView.getResources();
        this.f6152c = textView;
        this.f6152c.setCompoundDrawablePadding(this.f6151b.getDimensionPixelSize(R.dimen.indicator_padding));
    }
}
