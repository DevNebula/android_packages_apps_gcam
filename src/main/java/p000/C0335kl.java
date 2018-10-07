package p000;

import android.support.p001v4.app.SharedElementCallback;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import com.google.android.apps.refocus.processing.DepthmapTask;
import com.google.common.p006io.ByteStreams;

/* compiled from: PG */
/* renamed from: kl */
public final class C0335kl {
    /* renamed from: a */
    public static final C0335kl f8694a = new C0335kl(1);
    /* renamed from: b */
    public static final C0335kl f8695b = new C0335kl(2);
    /* renamed from: c */
    public final Object f8696c;

    static {
        C0335kl c0335kl = new C0335kl(4);
        c0335kl = new C0335kl(8);
        c0335kl = new C0335kl(16);
        c0335kl = new C0335kl(32);
        c0335kl = new C0335kl(64);
        c0335kl = new C0335kl(128);
        c0335kl = new C0335kl(256);
        c0335kl = new C0335kl(512);
        c0335kl = new C0335kl(1024);
        c0335kl = new C0335kl((int) DepthmapTask.MAX_REFERENCE_SIZE_HR_PX);
        c0335kl = new C0335kl(4096);
        c0335kl = new C0335kl(8192);
        c0335kl = new C0335kl(16384);
        c0335kl = new C0335kl(32768);
        c0335kl = new C0335kl(65536);
        c0335kl = new C0335kl(131072);
        c0335kl = new C0335kl(262144);
        c0335kl = new C0335kl((int) ByteStreams.ZERO_COPY_CHUNK_SIZE);
        c0335kl = new C0335kl((int) SharedElementCallback.MAX_IMAGE_SIZE);
        c0335kl = new C0335kl(2097152);
        c0335kl = new C0335kl(AccessibilityAction.ACTION_SHOW_ON_SCREEN);
        c0335kl = new C0335kl(AccessibilityAction.ACTION_SCROLL_TO_POSITION);
        c0335kl = new C0335kl(AccessibilityAction.ACTION_SCROLL_UP);
        c0335kl = new C0335kl(AccessibilityAction.ACTION_SCROLL_LEFT);
        c0335kl = new C0335kl(AccessibilityAction.ACTION_SCROLL_DOWN);
        c0335kl = new C0335kl(AccessibilityAction.ACTION_SCROLL_RIGHT);
        c0335kl = new C0335kl(AccessibilityAction.ACTION_CONTEXT_CLICK);
        c0335kl = new C0335kl(AccessibilityAction.ACTION_SET_PROGRESS);
        c0335kl = new C0335kl(AccessibilityAction.ACTION_MOVE_WINDOW);
        c0335kl = new C0335kl(AccessibilityAction.ACTION_SHOW_TOOLTIP);
        c0335kl = new C0335kl(AccessibilityAction.ACTION_HIDE_TOOLTIP);
    }

    private C0335kl(int i) {
        this(new AccessibilityAction(i, null));
    }

    private C0335kl(Object obj) {
        this.f8696c = obj;
    }
}
