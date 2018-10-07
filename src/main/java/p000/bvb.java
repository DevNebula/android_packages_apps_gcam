package p000;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import java.io.Serializable;

/* compiled from: PG */
/* renamed from: bvb */
public final class bvb implements buy {
    /* renamed from: a */
    private static final String f11827a = bli.m887a("SpeTpIdQuery");
    /* renamed from: b */
    private final bvm f11828b;

    public bvb(bvm bvm) {
        this.f11828b = bvm;
    }

    /* renamed from: a */
    public final Cursor mo2160a(Uri uri, String[] strArr) {
        Object obj;
        long a = blx.m7624a(uri);
        Cursor matrixCursor = new MatrixCursor(new String[]{"special_type_id"});
        kbg a2 = this.f11828b.mo2174a(a);
        if (a2.mo9709b() && !((bve) a2.mo9706a()).equals(bve.NONE)) {
            matrixCursor.addRow(new Object[]{((bve) a2.mo9706a()).mo2167d()});
        }
        String str = f11827a;
        String valueOf = String.valueOf(uri);
        if (a2.mo9709b()) {
            obj = (Serializable) a2.mo9706a();
        } else {
            obj = " not available";
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 20) + String.valueOf(valueOf2).length());
        stringBuilder.append(valueOf);
        stringBuilder.append(" find special type: ");
        stringBuilder.append(valueOf2);
        bli.m888a(str, stringBuilder.toString());
        return matrixCursor;
    }
}
