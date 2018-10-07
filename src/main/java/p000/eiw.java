package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;

/* compiled from: PG */
/* renamed from: eiw */
public final class eiw implements kwk {
    /* renamed from: a */
    private final kwk f17450a;
    /* renamed from: b */
    private final kwk f17451b;

    public eiw(kwk kwk, kwk kwk2) {
        this.f17450a = kwk;
        this.f17451b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f17450a;
        awm awm = (awm) kwk.mo10566a();
        Intent intent = new Intent((Context) this.f17451b.mo10566a(), CameraActivity.class);
        intent.putExtra("open_filmstrip", true);
        return (awk) ktm.m14219a(new awk(awm, intent), "Cannot return null from a non-@Nullable @Provides method");
    }
}
