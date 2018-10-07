package p000;

import android.util.Pair;
import com.google.android.libraries.smartburst.filterpacks.face.FaceEditor;

/* compiled from: PG */
/* renamed from: jjk */
final class jjk implements izi {
    /* renamed from: a */
    private final jqo f21547a;
    /* renamed from: b */
    private final FaceEditor f21548b;

    public jjk(jqo jqo, FaceEditor faceEditor) {
        this.f21547a = jqo;
        this.f21548b = faceEditor;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9217a(Object obj) {
        return Pair.create(this.f21548b.createAllSmiles(this.f21547a, true), Long.valueOf(this.f21548b.getBestInputBitmapTimestamp()));
    }
}
