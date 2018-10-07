package p000;

import com.google.android.apps.refocus.processing.SelectedFrame;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* renamed from: hrj */
public final class hrj {
    /* renamed from: a */
    public int f6861a = 10;
    /* renamed from: b */
    public final ArrayList f6862b = new ArrayList();
    /* renamed from: c */
    public final SelectedFrame f6863c = new SelectedFrame(0.0f, 0.0f);

    static {
        bli.m887a("FrameSelection");
    }

    public hrj() {
        this.f6862b.ensureCapacity(10);
    }

    /* renamed from: a */
    public final ArrayList mo8057a() {
        Collections.sort(this.f6862b);
        return this.f6862b;
    }
}
