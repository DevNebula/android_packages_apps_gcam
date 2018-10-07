package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Pair;
import java.util.List;

/* compiled from: PG */
/* renamed from: jjo */
final class jjo implements izi {
    /* renamed from: a */
    private final jqr f21553a;
    /* renamed from: b */
    private final List f21554b;

    public jjo(jqr jqr, List list) {
        this.f21553a = jqr;
        this.f21554b = list;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9217a(Object obj) {
        jqr jqr = (jqr) obj;
        Canvas canvas = new Canvas((Bitmap) jqr.mo9674e());
        Paint paint = new Paint();
        for (Pair pair : this.f21554b) {
            Rect rect = (Rect) pair.first;
            Rect rect2 = (Rect) pair.second;
            if (!((Bitmap) this.f21553a.mo9674e()).isPremultiplied()) {
                ((Bitmap) this.f21553a.mo9674e()).setPremultiplied(true);
            }
            canvas.drawBitmap((Bitmap) this.f21553a.mo9674e(), rect2, rect, paint);
        }
        canvas.setBitmap(null);
        this.f21553a.mo15063a();
        return jqr;
    }
}
