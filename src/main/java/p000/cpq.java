package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: cpq */
public final class cpq implements kwk {
    /* renamed from: a */
    private final kwk f13111a;
    /* renamed from: b */
    private final kwk f13112b;
    /* renamed from: c */
    private final kwk f13113c;
    /* renamed from: d */
    private final kwk f13114d;
    /* renamed from: e */
    private final kwk f13115e;
    /* renamed from: f */
    private final kwk f13116f;

    public cpq(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        this.f13111a = kwk;
        this.f13112b = kwk2;
        this.f13113c = kwk3;
        this.f13114d = kwk4;
        this.f13115e = kwk5;
        this.f13116f = kwk6;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f13111a;
        kwk kwk2 = this.f13112b;
        kwk kwk3 = this.f13113c;
        kwk kwk4 = this.f13114d;
        kwk kwk5 = this.f13115e;
        Context context = (Context) kwk.mo10566a();
        LayoutInflater layoutInflater = (LayoutInflater) kwk2.mo10566a();
        Resources resources = (Resources) kwk3.mo10566a();
        awk awk = (awk) kwk5.mo10566a();
        cqf cqf = (cqf) this.f13116f.mo10566a();
        BitmapDrawable bitmapDrawable = (BitmapDrawable) resources.getDrawable(R.drawable.placeholder_locked);
        int height = bitmapDrawable.getBitmap().getHeight();
        cqa cqa = new cqa(context, (hfz) kwk4.mo10566a(), new cqo(C0252go.f5843ap, awk, bitmapDrawable.getBitmap().getWidth(), height, layoutInflater, resources), cqf);
        cqa.mo7818a();
        return (cqa) ktm.m14219a(cqa, "Cannot return null from a non-@Nullable @Provides method");
    }
}
