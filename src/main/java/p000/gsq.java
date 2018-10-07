package p000;

import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.provider.MediaStore.Images.Media;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: gsq */
public final class gsq {
    /* renamed from: a */
    private final kec f6034a = kec.m18455q();
    /* renamed from: b */
    private final /* synthetic */ gtr f6035b;

    public gsq(gtr gtr) {
        this.f6035b = gtr;
    }

    /* renamed from: a */
    public final void mo7419a(ContentResolver contentResolver, String str, long j, kbg kbg, int i, String str2, int i2, int i3, ixx ixx) {
        File file = new File(str2);
        epy epy = new epy(this.f6035b.f19597b);
        epy.f4296a = file;
        epy.f4297b = kbg;
        epy a = epy.mo6488a(ixx);
        a.f4298c = iqm.m4095a(i);
        m2849a(contentResolver, a.mo6487a(new iqp(i2, i3)).mo6486a(j).mo6489a(str).mo6485a().f4295a);
    }

    /* renamed from: a */
    private final synchronized void m2849a(ContentResolver contentResolver, ContentValues contentValues) {
        this.f6034a.mo9925a(contentResolver, ContentProviderOperation.newInsert(Media.EXTERNAL_CONTENT_URI).withValues(contentValues).build());
    }

    /* renamed from: a */
    public final synchronized List mo7418a() {
        List arrayList;
        String str;
        String valueOf;
        StringBuilder stringBuilder;
        arrayList = new ArrayList();
        for (ContentResolver contentResolver : this.f6034a.mo9931n()) {
            Collection b = this.f6034a.mo15588b(contentResolver);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(b);
            try {
                for (ContentProviderResult contentProviderResult : contentResolver.applyBatch("media", arrayList2)) {
                    arrayList.add(contentProviderResult.uri);
                }
            } catch (RemoteException e) {
                str = gtr.f19590a;
                valueOf = String.valueOf(e);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
                stringBuilder.append("Failed to write MediaStore: ");
                stringBuilder.append(valueOf);
                bli.m891b(str, stringBuilder.toString());
            } catch (OperationApplicationException e2) {
                str = gtr.f19590a;
                valueOf = String.valueOf(e2);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 38);
                stringBuilder.append("Write operation to MediaStore failed: ");
                stringBuilder.append(valueOf);
                bli.m891b(str, stringBuilder.toString());
            }
        }
        this.f6034a.mo9927c();
        return arrayList;
    }
}
