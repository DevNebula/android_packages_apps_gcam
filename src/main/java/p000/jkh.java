package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: jkh */
final class jkh extends anq {
    /* renamed from: b */
    private final List f24768b;
    /* renamed from: c */
    private final int f24769c;

    jkh(Context context, List list, int i) {
        Drawable animationDrawable = new AnimationDrawable();
        Resources resources = context.getResources();
        for (jqr jqr : list) {
            Drawable bitmapDrawable = new BitmapDrawable(resources, (Bitmap) jqr.mo9674e());
            bitmapDrawable.setTargetDensity(((Bitmap) jqr.mo9674e()).getDensity());
            animationDrawable.addFrame(bitmapDrawable, i);
        }
        super(animationDrawable);
        this.f24768b = new ArrayList(list);
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (it.hasNext()) {
                i2 = ((jqr) it.next()).mo15048c() + i3;
            } else {
                this.f24769c = i3;
                return;
            }
        }
    }

    /* renamed from: c */
    public final Class mo263c() {
        return AnimationDrawable.class;
    }

    /* renamed from: d */
    public final int mo264d() {
        return this.f24769c;
    }

    /* renamed from: e */
    public final void mo265e() {
        for (jqr close : this.f24768b) {
            close.mo15063a();
        }
        this.f24768b.clear();
    }
}
