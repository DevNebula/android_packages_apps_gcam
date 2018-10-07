package p000;

import android.util.Log;
import java.io.File;

/* compiled from: PG */
/* renamed from: ezr */
public final class ezr implements eyu {
    /* renamed from: a */
    private final /* synthetic */ File f18073a;
    /* renamed from: b */
    private final /* synthetic */ eyu f18074b;

    public ezr(File file, eyu eyu) {
        this.f18073a = file;
        this.f18074b = eyu;
    }

    /* renamed from: a */
    public final void mo6683a() {
        String valueOf = String.valueOf(this.f18073a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 45);
        stringBuilder.append("Microvideo for ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" was cancelled by the trimmer.");
        Log.d("MvLogging", stringBuilder.toString());
        this.f18074b.mo6683a();
    }

    /* renamed from: a */
    public final void mo6684a(long j) {
        String valueOf = String.valueOf(this.f18073a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 45);
        stringBuilder.append("Microvideo for ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" ended at ");
        stringBuilder.append(j);
        Log.d("MvLogging", stringBuilder.toString());
        this.f18074b.mo6684a(j);
    }
}
