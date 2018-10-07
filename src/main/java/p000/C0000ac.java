package p000;

import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: ac */
public class C0000ac {
    public static final Object NOT_SET = new Object();
    public static final int START_VERSION = -1;
    public int mActiveCount = 0;
    public volatile Object mData = NOT_SET;
    public final Object mDataLock = new Object();
    public boolean mDispatchInvalidated;
    public boolean mDispatchingValue;
    public C0239g mObservers = new C0239g();
    public volatile Object mPendingData = NOT_SET;
    public final Runnable mPostValueRunnable = new C0001ad(this);
    public int mVersion = -1;

    private static void assertMainThread(String str) {
        if (!C0626a.m6333a().f10108a.mo6153b()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot invoke ");
            stringBuilder.append(str);
            stringBuilder.append(" on a background");
            stringBuilder.append(" thread");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private void considerNotify(C0002ag c0002ag) {
        if (!c0002ag.f427b) {
            return;
        }
        if (c0002ag.mo240a()) {
            int i = c0002ag.f428c;
            int i2 = this.mVersion;
            if (i < i2) {
                c0002ag.f428c = i2;
                c0002ag.f426a.onChanged(this.mData);
                return;
            }
            return;
        }
        c0002ag.mo239a(false);
    }

    private void dispatchingValue(C0002ag c0002ag) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (c0002ag == null) {
                Iterator a = this.mObservers.mo6984a();
                while (a.hasNext()) {
                    considerNotify((C0002ag) ((Entry) a.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
            considerNotify(c0002ag);
            c0002ag = null;
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public Object getValue() {
        Object obj = this.mData;
        if (obj != NOT_SET) {
            return obj;
        }
        return null;
    }

    int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.f5177e > 0;
    }

    public void observe(C0587y c0587y, C0003ai c0003ai) {
        if (c0587y.getLifecycle().mo11197a() != C0552w.DESTROYED) {
            C0574x c0806af = new C0806af(this, c0587y, c0003ai);
            C0002ag c0002ag = (C0002ag) this.mObservers.mo6983a(c0003ai, c0806af);
            if (c0002ag != null && !c0002ag.mo241a(c0587y)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (c0002ag == null) {
                c0587y.getLifecycle().mo11198a(c0806af);
            }
        }
    }

    public void observeForever(C0003ai c0003ai) {
        C0628ae c0628ae = new C0628ae(this, c0003ai);
        C0002ag c0002ag = (C0002ag) this.mObservers.mo6983a(c0003ai, c0628ae);
        if (c0002ag != null && (c0002ag instanceof C0806af)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (c0002ag == null) {
            c0628ae.mo239a(true);
        }
    }

    public void onActive() {
    }

    public void onInactive() {
    }

    protected void postValue(Object obj) {
        Object obj2;
        Object obj3;
        synchronized (this.mDataLock) {
            obj2 = this.mPendingData;
            obj3 = NOT_SET;
            this.mPendingData = obj;
        }
        if (obj2 == obj3) {
            C0626a.m6333a().mo6152b(this.mPostValueRunnable);
        }
    }

    public void removeObserver(C0003ai c0003ai) {
        C0000ac.assertMainThread("removeObserver");
        C0002ag c0002ag = (C0002ag) this.mObservers.mo6987c(c0003ai);
        if (c0002ag != null) {
            c0002ag.mo242b();
            c0002ag.mo239a(false);
        }
    }

    public void removeObservers(C0587y c0587y) {
        C0000ac.assertMainThread("removeObservers");
        Iterator it = this.mObservers.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (((C0002ag) entry.getValue()).mo241a(c0587y)) {
                removeObserver((C0003ai) entry.getKey());
            }
        }
    }

    public void setValue(Object obj) {
        C0000ac.assertMainThread("setValue");
        this.mVersion++;
        this.mData = obj;
        dispatchingValue(null);
    }
}
