package p000;

import com.google.android.libraries.smartburst.filterpacks.face.FaceEditor;

/* compiled from: PG */
/* renamed from: jjj */
final class jjj implements Runnable {
    /* renamed from: a */
    private final FaceEditor f8248a;

    public jjj(FaceEditor faceEditor) {
        this.f8248a = faceEditor;
    }

    public final void run() {
        this.f8248a.dispose();
    }
}
