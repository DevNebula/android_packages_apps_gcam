package android.support.p001v4.app;

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000.C0042ap;
import p000.C0243gf;
import p000.C0587y;

/* compiled from: PG */
/* renamed from: android.support.v4.app.LoaderManager */
public abstract class LoaderManager {

    /* compiled from: PG */
    /* renamed from: android.support.v4.app.LoaderManager$LoaderCallbacks */
    public interface LoaderCallbacks {
        C0243gf onCreateLoader(int i, Bundle bundle);

        void onLoadFinished(C0243gf c0243gf, Object obj);

        void onLoaderReset(C0243gf c0243gf);
    }

    public abstract void destroyLoader(int i);

    @Deprecated
    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract C0243gf getLoader(int i);

    public abstract C0243gf initLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks);

    public abstract void markForRedelivery();

    public abstract C0243gf restartLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks);

    public static void enableDebugLogging(boolean z) {
        LoaderManagerImpl.DEBUG = z;
    }

    public static LoaderManager getInstance(C0587y c0587y) {
        return new LoaderManagerImpl(c0587y, ((C0042ap) c0587y).getViewModelStore());
    }

    public boolean hasRunningLoaders() {
        return false;
    }
}
