package p000;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: hda */
final class hda implements OnGlobalLayoutListener, hcz {
    /* renamed from: a */
    private final AtomicReference f24464a;
    /* renamed from: b */
    private final List f24465b;
    /* renamed from: c */
    private final List f24466c;
    /* renamed from: d */
    private final AtomicInteger f24467d;
    /* renamed from: e */
    private final Object f24468e;
    /* renamed from: f */
    private boolean f24469f;
    /* renamed from: g */
    private iqo f24470g = hdb.f19929a;

    hda(View view) {
        this.f24464a = new AtomicReference(view);
        this.f24467d = new AtomicInteger(-1);
        this.f24468e = new Object();
        this.f24465b = Collections.synchronizedList(new ArrayList());
        this.f24466c = Collections.synchronizedList(new ArrayList());
        this.f24469f = false;
    }

    /* renamed from: a */
    public final void mo13522a(Runnable runnable) {
        this.f24466c.add(runnable);
    }

    /* renamed from: b */
    public final void mo13524b(Runnable runnable) {
        this.f24465b.add(runnable);
    }

    public final void close() {
        mo13523b();
        this.f24465b.clear();
        this.f24466c.clear();
        this.f24464a.set(null);
    }

    public final void onGlobalLayout() {
        View view = (View) this.f24464a.get();
        if (view != null) {
            int visibility = view.getVisibility();
            if (visibility != 0 || view.isShown()) {
                if (visibility != 4 || !view.isShown()) {
                    if (visibility != 8 || !view.isShown()) {
                        int andSet = this.f24467d.getAndSet(visibility);
                        if (andSet == visibility) {
                            return;
                        }
                        if (visibility == 0) {
                            for (Runnable run : this.f24465b) {
                                run.run();
                            }
                        } else if (andSet >= 0) {
                            for (Runnable run2 : this.f24466c) {
                                run2.run();
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Missing block: B:12:?, code:
            return;
     */
    /* renamed from: a */
    public final void mo13521a() {
        /*
        r3 = this;
        r1 = r3.f24468e;
        monitor-enter(r1);
        r0 = r3.f24464a;	 Catch:{ all -> 0x0026 }
        r0 = r0.get();	 Catch:{ all -> 0x0026 }
        r0 = (android.view.View) r0;	 Catch:{ all -> 0x0026 }
        r2 = r3.f24469f;	 Catch:{ all -> 0x0026 }
        if (r2 != 0) goto L_0x0011;
    L_0x000f:
        if (r0 != 0) goto L_0x0013;
    L_0x0011:
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
    L_0x0012:
        return;
    L_0x0013:
        r0 = r0.getViewTreeObserver();	 Catch:{ all -> 0x0026 }
        r0.addOnGlobalLayoutListener(r3);	 Catch:{ all -> 0x0026 }
        r2 = 1;
        r3.f24469f = r2;	 Catch:{ all -> 0x0026 }
        r2 = new hdc;	 Catch:{ all -> 0x0026 }
        r2.<init>(r3, r0);	 Catch:{ all -> 0x0026 }
        r3.f24470g = r2;	 Catch:{ all -> 0x0026 }
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
        goto L_0x0012;
    L_0x0026:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0026 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: hda.a():void");
    }

    /* JADX WARNING: Missing block: B:12:?, code:
            return;
     */
    /* renamed from: b */
    public final void mo13523b() {
        /*
        r3 = this;
        r1 = r3.f24468e;
        monitor-enter(r1);
        r0 = r3.f24464a;	 Catch:{ all -> 0x0021 }
        r0 = r0.get();	 Catch:{ all -> 0x0021 }
        r0 = (android.view.View) r0;	 Catch:{ all -> 0x0021 }
        r2 = r3.f24469f;	 Catch:{ all -> 0x0021 }
        if (r2 == 0) goto L_0x0011;
    L_0x000f:
        if (r0 != 0) goto L_0x0013;
    L_0x0011:
        monitor-exit(r1);	 Catch:{ all -> 0x0021 }
    L_0x0012:
        return;
    L_0x0013:
        r0 = r3.f24470g;	 Catch:{ all -> 0x0021 }
        r0.close();	 Catch:{ all -> 0x0021 }
        r0 = p000.hdd.f19932a;	 Catch:{ all -> 0x0021 }
        r3.f24470g = r0;	 Catch:{ all -> 0x0021 }
        r0 = 0;
        r3.f24469f = r0;	 Catch:{ all -> 0x0021 }
        monitor-exit(r1);	 Catch:{ all -> 0x0021 }
        goto L_0x0012;
    L_0x0021:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0021 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: hda.b():void");
    }
}
