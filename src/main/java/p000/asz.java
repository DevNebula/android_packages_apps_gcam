package p000;

import android.graphics.PointF;
import android.graphics.RectF;

/* compiled from: PG */
/* renamed from: asz */
final class asz implements kov {
    /* renamed from: a */
    private final /* synthetic */ PointF f10703a;
    /* renamed from: b */
    private final /* synthetic */ RectF f10704b;
    /* renamed from: c */
    private final /* synthetic */ asx f10705c;

    asz(asx asx, PointF pointF, RectF rectF) {
        this.f10705c = asx;
        this.f10703a = pointF;
        this.f10704b = rectF;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        Boolean bool = (Boolean) obj;
        if (((Float) this.f10705c.f978a.mo13673b()).floatValue() == 1.0f) {
            PointF pointF = this.f10703a;
            float f = pointF.x;
            RectF rectF = this.f10704b;
            this.f10705c.f979b.mo8893a(new hin(f - rectF.left, pointF.y - rectF.top, rectF.width(), this.f10704b.height()), null, bool.booleanValue());
        }
    }
}
