package p000;

import android.content.Context;
import android.graphics.Point;
import android.os.SystemClock;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: eks */
public final class eks {
    /* renamed from: a */
    public ArrayList f4053a;
    /* renamed from: b */
    public eld f4054b;
    /* renamed from: c */
    public long f4055c;
    /* renamed from: d */
    public eli f4056d;
    /* renamed from: e */
    public Point f4057e;
    /* renamed from: f */
    public int f4058f = 0;
    /* renamed from: g */
    public boolean f4059g = false;
    /* renamed from: h */
    public boolean f4060h = false;
    /* renamed from: i */
    public boolean f4061i = false;

    public eks(Context context, eld eld, int i, int i2) {
        try {
            this.f4056d = new eli();
        } catch (Throwable e) {
            kqg.f8786a.mo10213b(e);
        }
        if (this.f4053a == null) {
            this.f4053a = new ArrayList();
        }
        int[] iArr = new int[]{R.drawable.focus_quadrant_4, R.drawable.focus_quadrant_1, R.drawable.focus_quadrant_2, R.drawable.focus_quadrant_3, R.drawable.focus_quadrant_4};
        this.f4053a.clear();
        for (int i3 = 0; i3 < 5; i3++) {
            this.f4053a.add(i3, new ejt());
            ((ejt) this.f4053a.get(i3)).mo13154a(context, iArr[i3], 4.0f);
            ((ejt) this.f4053a.get(i3)).f3890e = this.f4056d;
        }
        this.f4054b = eld;
        this.f4057e = new Point((i / 2) - (((ejt) this.f4053a.get(0)).f17472g.x / 2), (i2 / 2) - (((ejt) this.f4053a.get(0)).f17472g.y / 2));
        this.f4060h = false;
        this.f4059g = false;
        this.f4061i = true;
    }

    /* renamed from: a */
    public final void mo6288a() {
        this.f4058f = 0;
        if (this.f4059g) {
            eld eld = this.f4054b;
            LightCycle.m1325a(eld.mo6300a(), eld.f4141m, (int) (((double) (SystemClock.elapsedRealtimeNanos() - this.f4055c)) / 1000000.0d));
            this.f4059g = false;
        }
    }
}
