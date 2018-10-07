package p000;

import android.content.Intent;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* renamed from: dig */
final class dig implements kov {
    /* renamed from: a */
    private final /* synthetic */ hkv f13998a;
    /* renamed from: b */
    private final /* synthetic */ dhz f13999b;

    dig(dhz dhz, hkv hkv) {
        this.f13999b = dhz;
        this.f13998a = hkv;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        synchronized (this.f13999b.f26052j) {
            dhz dhz;
            if (this.f13999b.f26055m == dii.BACKGROUND) {
                bli.m898e(dhz.f26038d, "Ignoring openCamcorderDevice failure because state is BACKGROUND");
            } else if (th instanceof CancellationException) {
                bli.m898e(dhz.f26038d, "Ignoring openCamcorderDevice failure because it was cancelled");
            } else if (th instanceof gso) {
                bli.m891b(dhz.f26038d, "Ignoring openCamcorderDevice failure because of low storage space");
                dhz = this.f13999b;
                dhz.f26047e.execute(new dia(dhz, false));
            } else {
                bli.m892b(dhz.f26038d, "openCamcorderDevice onFailure: ", th);
                dhz = this.f13999b;
                dhz.f26057o = null;
                dhz.mo15508m();
                this.f13999b.f26059q.mo8946a(th);
            }
        }
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        boolean z = true;
        obj = (dil) obj;
        bli.m888a(dhz.f26038d, "openCamcorderDevice onSuccess");
        jri.m13404b(obj);
        synchronized (this.f13999b.f26052j) {
            if (this.f13999b.f26055m != dii.OPENING_CAMCORDER) {
                obj.close();
                return;
            }
            this.f13999b.f26055m = dii.CAMCORDER_OPENED;
            dhz dhz = this.f13999b;
            dhz.f26056n = obj;
            dil dil = dhz.f26056n;
            hkv hkv = this.f13998a;
            Intent intent = dhz.f26054l.f1017a.getIntent();
            if (intent != null) {
                String action = intent.getAction();
                boolean booleanExtra = intent.getBooleanExtra("Video Action Processed", false);
                if (action == null) {
                    z = false;
                } else if (!action.equals("android.media.action.VIDEO_CAMERA")) {
                    z = false;
                } else if (booleanExtra) {
                    z = false;
                } else {
                    intent.putExtra("Video Action Processed", true);
                }
            } else {
                z = false;
            }
            dil.mo13025a(hkv, z);
            this.f13999b.f26057o = null;
        }
    }
}
