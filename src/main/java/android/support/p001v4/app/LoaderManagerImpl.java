package android.support.p001v4.app;

import android.os.Bundle;
import android.os.Looper;
import android.support.p001v4.app.LoaderManager.LoaderCallbacks;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p000.C0003ai;
import p000.C0006an;
import p000.C0041ao;
import p000.C0186df;
import p000.C0218ew;
import p000.C0243gf;
import p000.C0244gg;
import p000.C0261ha;
import p000.C0289il;
import p000.C0303ja;
import p000.C0587y;
import p000.C0629ah;

/* compiled from: PG */
/* renamed from: android.support.v4.app.LoaderManagerImpl */
class LoaderManagerImpl extends LoaderManager {
    public static boolean DEBUG = false;
    public static final String TAG = "LoaderManager";
    public final C0587y mLifecycleOwner;
    public final LoaderViewModel mLoaderViewModel;

    /* compiled from: PG */
    /* renamed from: android.support.v4.app.LoaderManagerImpl$LoaderObserver */
    class LoaderObserver implements C0003ai {
        public final LoaderCallbacks mCallback;
        public boolean mDeliveredData = false;
        public final C0243gf mLoader;

        LoaderObserver(C0243gf c0243gf, LoaderCallbacks loaderCallbacks) {
            this.mLoader = c0243gf;
            this.mCallback = loaderCallbacks;
        }

        public void dump(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.mDeliveredData);
        }

        boolean hasDeliveredData() {
            return this.mDeliveredData;
        }

        public void onChanged(Object obj) {
            if (LoaderManagerImpl.DEBUG) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  onLoadFinished in ");
                stringBuilder.append(this.mLoader);
                stringBuilder.append(": ");
                stringBuilder.append(C0243gf.m2573a(obj));
                Log.v(LoaderManagerImpl.TAG, stringBuilder.toString());
            }
            this.mCallback.onLoadFinished(this.mLoader, obj);
            this.mDeliveredData = true;
        }

        void reset() {
            if (this.mDeliveredData) {
                if (LoaderManagerImpl.DEBUG) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("  Resetting: ");
                    stringBuilder.append(this.mLoader);
                    Log.v(LoaderManagerImpl.TAG, stringBuilder.toString());
                }
                this.mCallback.onLoaderReset(this.mLoader);
            }
        }

        public String toString() {
            return this.mCallback.toString();
        }
    }

    /* compiled from: PG */
    /* renamed from: android.support.v4.app.LoaderManagerImpl$LoaderViewModel */
    class LoaderViewModel extends C0186df {
        public static final C0006an FACTORY = new C06341();
        public boolean mCreatingLoader = false;
        public C0303ja mLoaders = new C0303ja();

        /* compiled from: PG */
        /* renamed from: android.support.v4.app.LoaderManagerImpl$LoaderViewModel$1 */
        final class C06341 implements C0006an {
            C06341() {
            }

            /* renamed from: create$5166KOBMC4NMOOBECSNK6R31EDPJMAACC5N68SJFD5I2UOBICDK2UR39CPIM6UB3DHIIULJ9CLRKQRR4CLM3M___0 */
            public final C0186df mo384xd9ac3ecc(Class cls) {
                return new LoaderViewModel();
            }
        }

        LoaderViewModel() {
        }

        public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.mLoaders.mo9257b() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(GraphFactorySource.INDENT);
                String stringBuilder2 = stringBuilder.toString();
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 < this.mLoaders.mo9257b()) {
                        LoaderInfo loaderInfo = (LoaderInfo) this.mLoaders.mo9258b(i2);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(this.mLoaders.mo9254a(i2));
                        printWriter.print(": ");
                        printWriter.println(loaderInfo.toString());
                        loaderInfo.dump(stringBuilder2, fileDescriptor, printWriter, strArr);
                        i = i2 + 1;
                    } else {
                        return;
                    }
                }
            }
        }

        void finishCreatingLoader() {
            this.mCreatingLoader = false;
        }

        static LoaderViewModel getInstance(C0041ao c0041ao) {
            C0218ew c0218ew = new C0218ew(c0041ao, FACTORY);
            Class cls = LoaderViewModel.class;
            String canonicalName = cls.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("android.arch.lifecycle.ViewModelProvider.DefaultKey:");
            stringBuilder.append(canonicalName);
            String stringBuilder2 = stringBuilder.toString();
            C0186df c0186df = (C0186df) c0218ew.f4522b.f825a.get(stringBuilder2);
            if (!cls.isInstance(c0186df)) {
                C0186df create$5166KOBMC4NMOOBECSNK6R31EDPJMAACC5N68SJFD5I2UOBICDK2UR39CPIM6UB3DHIIULJ9CLRKQRR4CLM3M___0 = c0218ew.f4521a.mo384xd9ac3ecc(cls);
                C0041ao c0041ao2 = c0218ew.f4522b;
                c0186df = (C0186df) c0041ao2.f825a.get(stringBuilder2);
                if (c0186df != null) {
                    c0186df.onCleared();
                }
                c0041ao2.f825a.put(stringBuilder2, create$5166KOBMC4NMOOBECSNK6R31EDPJMAACC5N68SJFD5I2UOBICDK2UR39CPIM6UB3DHIIULJ9CLRKQRR4CLM3M___0);
                c0186df = create$5166KOBMC4NMOOBECSNK6R31EDPJMAACC5N68SJFD5I2UOBICDK2UR39CPIM6UB3DHIIULJ9CLRKQRR4CLM3M___0;
            }
            return (LoaderViewModel) c0186df;
        }

        LoaderInfo getLoader(int i) {
            Object obj = null;
            C0303ja c0303ja = this.mLoaders;
            int a = C0289il.m3867a(c0303ja.f7965c, c0303ja.f7967e, i);
            if (a >= 0 && c0303ja.f7966d[a] != C0303ja.f7963a) {
                obj = c0303ja.f7966d[a];
            }
            return (LoaderInfo) obj;
        }

        boolean hasRunningLoaders() {
            int b = this.mLoaders.mo9257b();
            for (int i = 0; i < b; i++) {
                if (((LoaderInfo) this.mLoaders.mo9258b(i)).isCallbackWaitingForData()) {
                    return true;
                }
            }
            return false;
        }

        boolean isCreatingLoader() {
            return this.mCreatingLoader;
        }

        void markForRedelivery() {
            int b = this.mLoaders.mo9257b();
            for (int i = 0; i < b; i++) {
                ((LoaderInfo) this.mLoaders.mo9258b(i)).markForRedelivery();
            }
        }

        protected void onCleared() {
            super.onCleared();
            int b = this.mLoaders.mo9257b();
            for (int i = 0; i < b; i++) {
                ((LoaderInfo) this.mLoaders.mo9258b(i)).destroy(true);
            }
            C0303ja c0303ja = this.mLoaders;
            b = c0303ja.f7967e;
            Object[] objArr = c0303ja.f7966d;
            for (int i2 = 0; i2 < b; i2++) {
                objArr[i2] = null;
            }
            c0303ja.f7967e = 0;
            c0303ja.f7964b = false;
        }

        void putLoader(int i, LoaderInfo loaderInfo) {
            this.mLoaders.mo9256a(i, loaderInfo);
        }

        void removeLoader(int i) {
            C0303ja c0303ja = this.mLoaders;
            int a = C0289il.m3867a(c0303ja.f7965c, c0303ja.f7967e, i);
            if (a >= 0 && c0303ja.f7966d[a] != C0303ja.f7963a) {
                c0303ja.f7966d[a] = C0303ja.f7963a;
                c0303ja.f7964b = true;
            }
        }

        void startCreatingLoader() {
            this.mCreatingLoader = true;
        }
    }

    /* compiled from: PG */
    /* renamed from: android.support.v4.app.LoaderManagerImpl$LoaderInfo */
    public class LoaderInfo extends C0629ah implements C0244gg {
        public final Bundle mArgs;
        public final int mId;
        public C0587y mLifecycleOwner;
        public final C0243gf mLoader;
        public LoaderObserver mObserver;
        public C0243gf mPriorLoader;

        LoaderInfo(int i, Bundle bundle, C0243gf c0243gf, C0243gf c0243gf2) {
            this.mId = i;
            this.mArgs = bundle;
            this.mLoader = c0243gf;
            this.mPriorLoader = c0243gf2;
            C0243gf c0243gf3 = this.mLoader;
            if (c0243gf3.f5363c != null) {
                throw new IllegalStateException("There is already a listener registered");
            }
            c0243gf3.f5363c = this;
            c0243gf3.f5362b = i;
        }

        C0243gf destroy(boolean z) {
            if (LoaderManagerImpl.DEBUG) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  Destroying: ");
                stringBuilder.append(this);
                Log.v(LoaderManagerImpl.TAG, stringBuilder.toString());
            }
            this.mLoader.mo7098c();
            this.mLoader.f5366f = true;
            LoaderObserver loaderObserver = this.mObserver;
            if (loaderObserver != null) {
                removeObserver(loaderObserver);
                if (z) {
                    loaderObserver.reset();
                }
            }
            C0243gf c0243gf = this.mLoader;
            Object obj = c0243gf.f5363c;
            if (obj == null) {
                throw new IllegalStateException("No listener register");
            } else if (obj != this) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            } else {
                c0243gf.f5363c = null;
                if ((loaderObserver == null || loaderObserver.hasDeliveredData()) && !z) {
                    return this.mLoader;
                }
                this.mLoader.mo7102g();
                return this.mPriorLoader;
            }
        }

        public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.mId);
            printWriter.print(" mArgs=");
            printWriter.println(this.mArgs);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.mLoader);
            C0243gf c0243gf = this.mLoader;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append("  ");
            c0243gf.mo7096a(stringBuilder.toString(), fileDescriptor, printWriter, strArr);
            if (this.mObserver != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.mObserver);
                LoaderObserver loaderObserver = this.mObserver;
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append("  ");
                loaderObserver.dump(stringBuilder.toString(), printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            getLoader();
            printWriter.println(C0243gf.m2573a(getValue()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }

        C0243gf getLoader() {
            return this.mLoader;
        }

        boolean isCallbackWaitingForData() {
            if (!hasActiveObservers()) {
                return false;
            }
            LoaderObserver loaderObserver = this.mObserver;
            if (loaderObserver == null || loaderObserver.hasDeliveredData()) {
                return false;
            }
            return true;
        }

        void markForRedelivery() {
            C0587y c0587y = this.mLifecycleOwner;
            C0003ai c0003ai = this.mObserver;
            if (c0587y != null && c0003ai != null) {
                super.removeObserver(c0003ai);
                observe(c0587y, c0003ai);
            }
        }

        protected void onActive() {
            if (LoaderManagerImpl.DEBUG) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  Starting: ");
                stringBuilder.append(this);
                Log.v(LoaderManagerImpl.TAG, stringBuilder.toString());
            }
            C0243gf c0243gf = this.mLoader;
            c0243gf.f5365e = true;
            c0243gf.f5367g = false;
            c0243gf.f5366f = false;
            c0243gf.mo7100e();
        }

        protected void onInactive() {
            if (LoaderManagerImpl.DEBUG) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  Stopping: ");
                stringBuilder.append(this);
                Log.v(LoaderManagerImpl.TAG, stringBuilder.toString());
            }
            C0243gf c0243gf = this.mLoader;
            c0243gf.f5365e = false;
            c0243gf.mo7101f();
        }

        public void onLoadComplete(C0243gf c0243gf, Object obj) {
            if (LoaderManagerImpl.DEBUG) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onLoadComplete: ");
                stringBuilder.append(this);
                Log.v(LoaderManagerImpl.TAG, stringBuilder.toString());
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                setValue(obj);
                return;
            }
            if (LoaderManagerImpl.DEBUG) {
                Log.w(LoaderManagerImpl.TAG, "onLoadComplete was incorrectly called on a background thread");
            }
            postValue(obj);
        }

        public void removeObserver(C0003ai c0003ai) {
            super.removeObserver(c0003ai);
            this.mLifecycleOwner = null;
            this.mObserver = null;
        }

        C0243gf setCallback(C0587y c0587y, LoaderCallbacks loaderCallbacks) {
            Object loaderObserver = new LoaderObserver(this.mLoader, loaderCallbacks);
            observe(c0587y, loaderObserver);
            C0003ai c0003ai = this.mObserver;
            if (c0003ai != null) {
                removeObserver(c0003ai);
            }
            this.mLifecycleOwner = c0587y;
            this.mObserver = loaderObserver;
            return this.mLoader;
        }

        public void setValue(Object obj) {
            super.setValue(obj);
            C0243gf c0243gf = this.mPriorLoader;
            if (c0243gf != null) {
                c0243gf.mo7102g();
                this.mPriorLoader = null;
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("LoaderInfo{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" #");
            stringBuilder.append(this.mId);
            stringBuilder.append(" : ");
            C0261ha.m3024a(this.mLoader, stringBuilder);
            stringBuilder.append("}}");
            return stringBuilder.toString();
        }
    }

    LoaderManagerImpl(C0587y c0587y, C0041ao c0041ao) {
        this.mLifecycleOwner = c0587y;
        this.mLoaderViewModel = LoaderViewModel.getInstance(c0041ao);
    }

    private C0243gf createAndInstallLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks, C0243gf c0243gf) {
        LoaderInfo loaderInfo;
        try {
            this.mLoaderViewModel.startCreatingLoader();
            C0243gf onCreateLoader = loaderCallbacks.onCreateLoader(i, bundle);
            StringBuilder stringBuilder;
            if (onCreateLoader == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            } else if (!onCreateLoader.getClass().isMemberClass() || Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                loaderInfo = new LoaderInfo(i, bundle, onCreateLoader, c0243gf);
                if (DEBUG) {
                    String str = TAG;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("  Created new loader ");
                    stringBuilder.append(loaderInfo);
                    Log.v(str, stringBuilder.toString());
                }
                this.mLoaderViewModel.putLoader(i, loaderInfo);
                return loaderInfo.setCallback(this.mLifecycleOwner, loaderCallbacks);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
                stringBuilder.append(onCreateLoader);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        } finally {
            loaderInfo = this.mLoaderViewModel;
            loaderInfo.finishCreatingLoader();
        }
    }

    public void destroyLoader(int i) {
        if (this.mLoaderViewModel.isCreatingLoader()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        } else {
            if (DEBUG) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("destroyLoader in ");
                stringBuilder.append(this);
                stringBuilder.append(" of ");
                stringBuilder.append(i);
                Log.v(TAG, stringBuilder.toString());
            }
            LoaderInfo loader = this.mLoaderViewModel.getLoader(i);
            if (loader != null) {
                loader.destroy(true);
                this.mLoaderViewModel.removeLoader(i);
            }
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.mLoaderViewModel.dump(str, fileDescriptor, printWriter, strArr);
    }

    public C0243gf getLoader(int i) {
        if (this.mLoaderViewModel.isCreatingLoader()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        LoaderInfo loader = this.mLoaderViewModel.getLoader(i);
        return loader != null ? loader.getLoader() : null;
    }

    public boolean hasRunningLoaders() {
        return this.mLoaderViewModel.hasRunningLoaders();
    }

    public C0243gf initLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks) {
        if (this.mLoaderViewModel.isCreatingLoader()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        } else {
            StringBuilder stringBuilder;
            LoaderInfo loader = this.mLoaderViewModel.getLoader(i);
            if (DEBUG) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("initLoader in ");
                stringBuilder.append(this);
                stringBuilder.append(": args=");
                stringBuilder.append(bundle);
                Log.v(TAG, stringBuilder.toString());
            }
            if (loader == null) {
                return createAndInstallLoader(i, bundle, loaderCallbacks, null);
            }
            if (DEBUG) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("  Re-using existing loader ");
                stringBuilder.append(loader);
                Log.v(TAG, stringBuilder.toString());
            }
            return loader.setCallback(this.mLifecycleOwner, loaderCallbacks);
        }
    }

    public void markForRedelivery() {
        this.mLoaderViewModel.markForRedelivery();
    }

    public C0243gf restartLoader(int i, Bundle bundle, LoaderCallbacks loaderCallbacks) {
        if (this.mLoaderViewModel.isCreatingLoader()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        } else {
            C0243gf destroy;
            if (DEBUG) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("restartLoader in ");
                stringBuilder.append(this);
                stringBuilder.append(": args=");
                stringBuilder.append(bundle);
                Log.v(TAG, stringBuilder.toString());
            }
            LoaderInfo loader = this.mLoaderViewModel.getLoader(i);
            if (loader != null) {
                destroy = loader.destroy(false);
            } else {
                destroy = null;
            }
            return createAndInstallLoader(i, bundle, loaderCallbacks, destroy);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        C0261ha.m3024a(this.mLifecycleOwner, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}
