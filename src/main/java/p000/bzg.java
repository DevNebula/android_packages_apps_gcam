package p000;

import android.os.SystemClock;
import com.google.googlex.gcam.ShotLogData;
import com.google.googlex.gcam.ShotStatusCallback;

/* compiled from: PG */
/* renamed from: bzg */
final class bzg extends ShotStatusCallback {
    /* renamed from: a */
    private final /* synthetic */ int f12036a;
    /* renamed from: b */
    private final /* synthetic */ bku f12037b;
    /* renamed from: c */
    private final /* synthetic */ bmh f12038c;
    /* renamed from: d */
    private final /* synthetic */ grk f12039d;
    /* renamed from: e */
    private final /* synthetic */ bzx f12040e;
    /* renamed from: f */
    private final /* synthetic */ fwa f12041f;
    /* renamed from: g */
    private final /* synthetic */ bze f12042g;

    bzg(bze bze, int i, bku bku, bmh bmh, grk grk, bzx bzx, fwa fwa) {
        this.f12042g = bze;
        this.f12036a = i;
        this.f12037b = bku;
        this.f12038c = bmh;
        this.f12039d = grk;
        this.f12040e = bzx;
        this.f12041f = fwa;
    }

    public final void OnAbort(int i) {
        boolean z = true;
        bli.m894c(bze.f1762a, String.format(null, "HDR+ pipeline reported shotId %d was aborted.", new Object[]{Integer.valueOf(i)}));
        if (this.f12042g.f1780s != C0252go.f5954z) {
            z = false;
        }
        jri.m13405b(z);
        this.f12042g.f1780s = C0252go.f5777C;
        this.f12041f.f4983c.mo6926a();
        this.f12041f.f4984d.close();
        this.f12041f.f4981a.f4680g.close();
        this.f12042g.f1779r.close();
        if (this.f12040e.mo2242i().mo9709b()) {
            ((cac) this.f12040e.mo2242i().mo9706a()).f1813b.f12196h.mo8832b("Shot aborted.");
        }
    }

    public final void OnComplete(int i, ShotLogData shotLogData) {
        boolean z;
        grl grl;
        int i2 = 0;
        bli.m888a(bze.f1762a, String.format(null, "HDR+ pipeline reported completion for shotId %d.", new Object[]{Integer.valueOf(i)}));
        if (this.f12042g.f1780s == C0252go.f5954z) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
        this.f12042g.f1780s = C0252go.f5775A;
        this.f12042g.f1779r.close();
        int executed_finish_on = shotLogData.getExecuted_finish_on();
        epu epu = new epu(shotLogData, this.f12036a);
        if (this.f12037b != bku.RELEASE) {
            int i3 = this.f12036a;
            if (i3 == 1 && executed_finish_on != 1) {
                bli.m891b(bze.f1762a, "Hexagon failed");
                this.f12038c.mo2027a("Hexagon failed! Please immediately take and file a bug report.", 1);
            } else if (i3 == 3 && executed_finish_on != 3) {
                String str;
                if (executed_finish_on == 0) {
                    str = "CPU";
                } else {
                    str = "UNKNOWN";
                    if (executed_finish_on == 1) {
                        str = "Hexagon";
                    }
                }
                String str2 = bze.f1762a;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 43);
                stringBuilder.append("IPU Finish offload failed (ran on ");
                stringBuilder.append(str);
                stringBuilder.append(" instead)");
                bli.m891b(str2, stringBuilder.toString());
                bmh bmh = this.f12038c;
                stringBuilder = new StringBuilder(String.valueOf(str).length() + 91);
                stringBuilder.append("IPU Finish offload failed (ran on ");
                stringBuilder.append(str);
                stringBuilder.append(" instead)! Please immediately take and file a bug report.");
                bmh.mo2027a(stringBuilder.toString(), 1);
            }
            while (((long) i2) < shotLogData.getFinal_payload_frame_sharpness().size()) {
                if (shotLogData.getFinal_payload_frame_sharpness().get(i2) == 1.0f) {
                    bli.m891b(bze.f1762a, "Black frame detected");
                    this.f12038c.mo2027a("Black frame detected! Please immediately take and file a bug report.", 1);
                    break;
                }
                i2++;
            }
        }
        grk grk = this.f12039d;
        while (!grk.f6017b.isEmpty()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            epq epq = (epq) grk.f6017b.removeFirst();
            if (uptimeMillis - epq.f4274a <= 60000) {
                grl = new grl();
                grl.f6020b = epq.f4275b;
                grl.f6019a = uptimeMillis - epq.f4274a;
                break;
            }
            bli.m896d(grk.f6016a, "Flushing old Gcam capture time");
        }
        grl = null;
        if (this.f12040e.mo2242i().mo9709b()) {
            cac cac = (cac) this.f12040e.mo2242i().mo9706a();
            if (grl != null) {
                cac.f1812a.f4982b.mo7077h().mo7369a(epu, Long.valueOf(grl.f6019a), Integer.valueOf(grl.f6020b));
            } else {
                cac.f1812a.f4982b.mo7077h().mo7369a(epu, null, null);
            }
        }
    }

    public final void OnError(int i, String str) {
        boolean z = true;
        bli.m891b(bze.f1762a, String.format(null, "HDR+ pipeline reported error for shotId %d: %s", new Object[]{Integer.valueOf(i), str}));
        if (this.f12042g.f1780s != C0252go.f5954z) {
            z = false;
        }
        jri.m13405b(z);
        jri.m13405b(this.f12040e.mo2242i().mo9709b());
        this.f12042g.f1780s = C0252go.f5776B;
        this.f12041f.f4983c.mo6926a();
        this.f12041f.f4984d.close();
        this.f12041f.f4981a.f4680g.close();
        this.f12042g.f1779r.close();
        if (this.f12040e.mo2242i().mo9709b()) {
            cac cac = (cac) this.f12040e.mo2242i().mo9706a();
            cac.f1813b.f12196h.mo8831a("Shot threw an error:", new blr(str));
        }
    }
}
