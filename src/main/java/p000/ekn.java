package p000;

import android.opengl.GLES20;
import java.nio.ShortBuffer;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ekn */
public final class ekn extends ejn {
    /* renamed from: f */
    public int f17492f = 0;
    /* renamed from: g */
    public int f17493g = 0;
    /* renamed from: h */
    public boolean f17494h = false;
    /* renamed from: i */
    public ShortBuffer f17495i;
    /* renamed from: j */
    public ejq f17496j = null;
    /* renamed from: k */
    public ArrayList f17497k = new ArrayList();
    /* renamed from: l */
    public boolean f17498l = true;
    /* renamed from: m */
    public boolean f17499m = true;

    /* renamed from: b */
    public final void mo6255b(float[] fArr) {
        if (this.f17494h) {
            if (this.f17499m) {
                GLES20.glUseProgram(this.f3890e.f3898d);
                this.f3890e.mo6260b(this.f3886a);
                this.f3890e.mo6258a(this.f3887b);
                this.f3890e.mo6259a(fArr);
                if (this.f3889d.size() > 0) {
                    ((ejo) this.f3889d.get(0)).mo6256a();
                }
                this.f3888c.position(0);
                GLES20.glDrawElements(4, this.f17492f, 5123, this.f3888c);
            }
            if (this.f17498l) {
                ejq ejq = this.f17496j;
                if (ejq != null) {
                    GLES20.glUseProgram(ejq.f3898d);
                    this.f17496j.mo6260b(this.f3886a);
                    this.f17496j.mo6259a(fArr);
                    this.f17495i.position(0);
                    GLES20.glLineWidth(9.0f);
                    GLES20.glDrawElements(2, this.f17493g, 5123, this.f17495i);
                    GLES20.glDrawElements(0, this.f17493g, 5123, this.f17495i);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo6252a() {
        ArrayList arrayList = this.f17497k;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                ejo ejo = (ejo) arrayList.get(i);
                if (ejo != null) {
                    ejo.mo6257d();
                    i = i2;
                } else {
                    i = i2;
                }
            }
            this.f17497k.clear();
        }
    }

    /* renamed from: a */
    public final void mo13155a(int i) {
        if (this.f3889d.size() != 0) {
            ((ejo) this.f3889d.get(0)).f3893a = i;
        }
    }
}
