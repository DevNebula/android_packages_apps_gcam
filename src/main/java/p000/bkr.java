package p000;

import android.location.Location;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.Surface;

/* compiled from: PG */
/* renamed from: bkr */
public final class bkr implements koj {
    /* renamed from: a */
    private final /* synthetic */ iou f11502a;

    public bkr(iou iou) {
        this.f11502a = iou;
    }

    /* renamed from: a */
    public final /* synthetic */ kpk mo10183a(Object obj) {
        Location d;
        long longValue = ((Long) jri.m13404b((Long) obj)).longValue();
        if (longValue < 0) {
            ing ing = this.f11502a.f21166n;
            if (ing != null) {
                ing.mo8641a(true);
            }
            StringBuilder stringBuilder = new StringBuilder(73);
            stringBuilder.append("The storage space is too low. available space (byte)=");
            stringBuilder.append(longValue);
            bli.m891b("VideoRecPreImp2", stringBuilder.toString());
        }
        this.f11502a.f21159g.mo1979a();
        if (this.f11502a.f21161i.mo9709b()) {
            longValue = Math.min(longValue, ((Long) this.f11502a.f21161i.mo9706a()).longValue());
        }
        if (this.f11502a.f21157e.mo9709b()) {
            d = ((hjw) this.f11502a.f21157e.mo9706a()).mo7915d();
        } else {
            d = null;
        }
        String b = this.f11502a.f21158f.mo7439b(System.currentTimeMillis());
        iou iou = this.f11502a;
        iou.f21165m = iou.f21158f.mo7436a(b, iou.f21154b.mo8648f().f7516c);
        b = String.valueOf(this.f11502a.f21165m.getPath());
        String str = "video will be save as ";
        if (b.length() == 0) {
            b = new String(str);
        } else {
            b = str.concat(b);
        }
        bli.m894c("VideoRecPreImp2", b);
        iou = this.f11502a;
        iou.f21164l = ((Integer) iou.f21156d.mo13673b()).intValue();
        iou iou2 = this.f11502a;
        iot iot = new iot(iou2.f21170r, iou2.f21155c, iou2.f21162j);
        iou2 = this.f11502a;
        iot.f7613d = iou2.f21154b;
        iot.f7612c = iou2.f21153a;
        iot.f7617h = this.f11502a.f21160h * 1000;
        iot.f7619j = this.f11502a.f21164l;
        iot.f7618i = longValue;
        if (d != null) {
            iot.f7625p = d;
        }
        if (this.f11502a.f21167o.mo9709b()) {
            Surface surface = (Surface) this.f11502a.f21167o.mo9706a();
            if (surface == null) {
                Log.e("VideoRecorderImpl", "Surface is not valid");
                throw new IllegalArgumentException("Surface is not valid");
            }
            if (iot.f7614e != iok.SURFACE) {
                Log.w("VideoRecorderImpl", "colorformat will be set to SURFACE as a surface is provided");
                iot.f7614e = iok.SURFACE;
            }
            iot.f7624o = surface;
        }
        if (this.f11502a.f21163k.mo9709b()) {
            iot.f7621l = ((ParcelFileDescriptor) this.f11502a.f21163k.mo9706a()).getFileDescriptor();
        } else {
            iot.f7620k = this.f11502a.f21165m;
        }
        iot.f7626q = this.f11502a.f21169q;
        return this.f11502a.f21170r.mo10202a(new bks(iot));
    }
}
