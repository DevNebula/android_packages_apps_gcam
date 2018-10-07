package p000;

import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

/* compiled from: PG */
/* renamed from: ejx */
public final class ejx extends Thread {
    /* renamed from: c */
    private static final String f3908c = bli.m887a("IncrementalAligner");
    /* renamed from: a */
    public final ArrayBlockingQueue f3909a = new ArrayBlockingQueue(50);
    /* renamed from: b */
    public boolean f3910b = false;
    /* renamed from: d */
    private emc f3911d = null;
    /* renamed from: e */
    private Boolean f3912e = Boolean.valueOf(false);

    public final void interrupt() {
        this.f3909a.add("Poison Pill");
    }

    public final void run() {
        while (!isInterrupted()) {
            String str;
            boolean z;
            ArrayList arrayList = new ArrayList();
            try {
                str = (String) this.f3909a.take();
                this.f3910b = true;
                arrayList.add(str);
                while (!this.f3909a.isEmpty()) {
                    arrayList.add((String) this.f3909a.take());
                }
            } catch (InterruptedException e) {
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                str = (String) arrayList.get(i);
                if (!"Poison Pill".equals(str)) {
                    if (this.f3912e.booleanValue()) {
                        z = true;
                        break;
                    }
                    str = String.valueOf(str);
                    String str2 = "Processing file ";
                    if (str.length() == 0) {
                        str = new String(str2);
                    } else {
                        str2.concat(str);
                    }
                    LightCycle.m1318a();
                    i = i2;
                } else {
                    z = true;
                    break;
                }
            }
            z = false;
            this.f3910b = false;
            if (z) {
                break;
            }
        }
        bli.m888a(f3908c, "Incremental aligner shutting down. Firing callback ...");
        emc emc = this.f3911d;
        if (emc != null) {
            emc.mo6325a(null);
        }
        bli.m888a(f3908c, "Incremental aligner thread shut down. Bye.");
    }

    /* renamed from: a */
    public final synchronized void mo6263a(emc emc) {
        if (isInterrupted() || !isAlive()) {
            throw new RuntimeException("IncrementalAligner is already shut down.");
        }
        this.f3911d = emc;
        this.f3912e = Boolean.valueOf(true);
        super.interrupt();
    }
}
