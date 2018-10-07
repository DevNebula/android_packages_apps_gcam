package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: aji */
final class aji implements adw {
    /* renamed from: a */
    private final File f10337a;
    /* renamed from: b */
    private final ajj f10338b;
    /* renamed from: c */
    private Object f10339c;

    aji(File file, ajj ajj) {
        this.f10337a = file;
        this.f10338b = ajj;
    }

    /* renamed from: b */
    public final void mo188b() {
    }

    /* renamed from: c */
    public final void mo189c() {
        Object obj = this.f10339c;
        if (obj != null) {
            try {
                this.f10338b.mo335a(obj);
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public final Class mo186a() {
        return this.f10338b.mo333a();
    }

    /* renamed from: d */
    public final adf mo190d() {
        return adf.LOCAL;
    }

    /* renamed from: a */
    public final void mo187a(acg acg, adx adx) {
        try {
            this.f10339c = this.f10338b.mo334a(this.f10337a);
            adx.mo192a(this.f10339c);
        } catch (Exception e) {
            if (Log.isLoggable("FileLoader", 3)) {
                Log.d("FileLoader", "Failed to open file", e);
            }
            adx.mo191a(e);
        }
    }
}
