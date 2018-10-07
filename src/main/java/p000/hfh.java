package p000;

import android.os.Handler;
import android.view.Choreographer;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.p005ui.widget.TracedFrameLayout;

/* compiled from: PG */
/* renamed from: hfh */
public final class hfh extends TracedFrameLayout {
    /* renamed from: c */
    private static final String f20003c = bli.m887a("CountDownView");
    /* renamed from: a */
    public int f20004a = 0;
    /* renamed from: b */
    public hfk f20005b;
    /* renamed from: d */
    private TextView f20006d;
    /* renamed from: e */
    private final Handler f20007e = new hfj(this);
    /* renamed from: f */
    private final ViewGroup f20008f;

    public hfh(FrameLayout frameLayout) {
        super(frameLayout.getContext());
        this.f20008f = frameLayout;
        setTag("countDown");
        this.f20006d = (TextView) hhz.m3217d(new TextView(frameLayout.getContext(), null, R.style.CountdownTextStyle));
        this.f20006d.setTextAppearance(R.style.CountdownTextStyle);
        this.f20006d.setGravity(17);
        addView(this.f20006d);
    }

    /* renamed from: a */
    public final void mo13529a() {
        if (this.f20004a > 0) {
            this.f20004a = 0;
            this.f20007e.removeMessages(1);
            this.f20008f.removeView(this);
        }
    }

    /* renamed from: b */
    public final boolean mo13532b() {
        return this.f20004a > 0;
    }

    /* renamed from: a */
    final void mo13531a(boolean z, int i) {
        this.f20004a = i;
        hfk hfk = this.f20005b;
        if (hfk != null) {
            if (z) {
                hfk.mo7790r();
            } else {
                hfk.mo7788b(this.f20004a);
            }
        }
        if (i == 0) {
            this.f20008f.removeView(this);
            hfk = this.f20005b;
            if (hfk != null) {
                hfk.mo7789q();
                return;
            }
            return;
        }
        this.f20006d.setText(String.format(getResources().getConfiguration().locale, "%d", new Object[]{Integer.valueOf(i)}));
        mo13533c();
        this.f20007e.sendEmptyMessageDelayed(1, 1000);
    }

    /* renamed from: a */
    public final void mo13530a(int i) {
        if (i <= 0) {
            String str = f20003c;
            StringBuilder stringBuilder = new StringBuilder(54);
            stringBuilder.append("Invalid input for countdown timer: ");
            stringBuilder.append(i);
            stringBuilder.append(" seconds");
            bli.m898e(str, stringBuilder.toString());
            return;
        }
        if (mo13532b()) {
            mo13529a();
        }
        this.f20008f.addView(this, -1);
        mo13531a(true, i);
    }

    /* renamed from: c */
    final void mo13533c() {
        int measuredWidth = this.f20006d.getMeasuredWidth();
        int measuredHeight = this.f20006d.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Choreographer.getInstance().postFrameCallback(new hfi(this));
            return;
        }
        this.f20006d.setScaleX(1.0f);
        this.f20006d.setScaleY(1.0f);
        this.f20006d.setPivotX((float) (measuredWidth / 2));
        this.f20006d.setPivotY((float) (measuredHeight / 2));
        this.f20006d.setAlpha(1.0f);
        this.f20006d.animate().scaleX(1.375f).scaleY(1.375f).alpha(0.0f).setDuration(800).start();
    }
}
