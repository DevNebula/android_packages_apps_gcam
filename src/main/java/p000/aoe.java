package p000;

import android.graphics.Bitmap;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: aoe */
final class aoe extends aqq {
    /* renamed from: a */
    public final int f26614a;
    /* renamed from: b */
    public Bitmap f26615b;
    /* renamed from: c */
    private final Handler f26616c;
    /* renamed from: d */
    private final long f26617d;

    aoe(Handler handler, int i, long j) {
        this.f26616c = handler;
        this.f26614a = i;
        this.f26617d = j;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo12307a(Object obj, ara ara) {
        this.f26615b = (Bitmap) obj;
        this.f26616c.sendMessageAtTime(this.f26616c.obtainMessage(1, this), this.f26617d);
    }
}
