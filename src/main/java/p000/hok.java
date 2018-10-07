package p000;

import android.util.Log;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: hok */
final class hok implements kov {
    /* renamed from: a */
    private final /* synthetic */ hoj f20222a;

    hok(hoj hoj) {
        this.f20222a = hoj;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        bli.m898e(hod.f24495a, "Fail to connect to GoogleApiClient");
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        int i = 0;
        hjk hjk = (hjk) obj;
        try {
            String str;
            igo igo = this.f20222a.f6779a;
            igj igj = igo.f7367b;
            ibf ibf = new ibf();
            List arrayList = new ArrayList();
            TreeSet treeSet = new TreeSet(igj.f7365a.keySet());
            ibg[] ibgArr = new ibg[treeSet.size()];
            Iterator it = treeSet.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                str = (String) it.next();
                Object a = igj.mo8437a(str);
                ibgArr[i2] = new ibg();
                ibg ibg = ibgArr[i2];
                ibg.f24544a = str;
                ibg.f24545b = htl.m3456a(arrayList, a);
                i2++;
            }
            ibf.f24542a = ibgArr;
            ibe ibe = new ibe(ibf, arrayList);
            igo.f7366a.f23559b = ibr.m3713a(ibe.f7260a);
            int size = ibe.f7261b.size();
            while (i < size) {
                String num = Integer.toString(i);
                Asset asset = (Asset) ibe.f7261b.get(i);
                if (num == null) {
                    str = String.valueOf(asset);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 26);
                    stringBuilder.append("asset key cannot be null: ");
                    stringBuilder.append(str);
                    throw new IllegalStateException(stringBuilder.toString());
                } else if (asset == null) {
                    str = String.valueOf(num);
                    String str2 = "asset cannot be null: key=";
                    if (str.length() == 0) {
                        str = new String(str2);
                    } else {
                        str = str2.concat(str);
                    }
                    throw new IllegalStateException(str);
                } else {
                    if (Log.isLoggable("DataMap", 3)) {
                        String valueOf = String.valueOf(asset);
                        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(num).length() + 33) + String.valueOf(valueOf).length());
                        stringBuilder2.append("asPutDataRequest: adding asset: ");
                        stringBuilder2.append(num);
                        stringBuilder2.append(" ");
                        stringBuilder2.append(valueOf);
                        Log.d("DataMap", stringBuilder2.toString());
                    }
                    igo.f7366a.mo14689a(num, asset);
                    i++;
                }
            }
            PutDataRequest putDataRequest = igo.f7366a;
            huq huq = hjk.f6637a.f20167a;
            huq.mo8134a(new igx(huq, putDataRequest));
            Runnable runnable = this.f20222a.f6780b;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Throwable e) {
            bli.m892b(hod.f24495a, "Error setting data item", e);
        }
    }
}
