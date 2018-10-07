package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: PG */
/* renamed from: jqx */
public final class jqx implements jqs {
    /* renamed from: a */
    private final jqr f24781a;

    public jqx(jqr jqr) {
        this.f24781a = jqr;
    }

    public final void close() {
        this.f24781a.mo15063a();
    }

    /* renamed from: a */
    public final int mo9533a() {
        return ((Bitmap) this.f24781a.mo9674e()).getHeight();
    }

    /* renamed from: b */
    public final int mo9534b() {
        return ((Bitmap) this.f24781a.mo9674e()).getWidth();
    }

    /* renamed from: a */
    public final jqr mo13824a(jqo jqo) {
        return new jqy((Bitmap) this.f24781a.mo9674e());
    }

    /* renamed from: b */
    public final jqr mo13825b(jqo jqo) {
        return jqp.m4664a(jqo, "inMemHandle:copy", (Bitmap) this.f24781a.mo9674e());
    }

    /* renamed from: a */
    public final jqr mo13823a(Rect rect, jqo jqo) {
        jqr jqr = this.f24781a;
        jqr a = jqo.mo9529a("inMemHandle", rect.width(), rect.height(), Config.ARGB_8888);
        Rect rect2 = new Rect(0, 0, rect.width(), rect.height());
        Canvas canvas = new Canvas((Bitmap) a.mo9674e());
        canvas.drawBitmap((Bitmap) jqr.mo9674e(), rect, rect2, new Paint());
        canvas.setBitmap(null);
        return a;
    }

    /* renamed from: a */
    public final jqr mo13822a(int i, int i2, jqo jqo) {
        return jqp.m4670a(jqo, "inMemHandle:scaled", this.f24781a, i, i2);
    }
}
