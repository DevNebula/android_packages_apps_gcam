package p000;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: aem */
public final class aem extends aek {
    /* renamed from: a */
    private static final UriMatcher f22475a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f22475a = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        f22475a.addURI("com.android.contacts", "contacts/lookup/*", 1);
        f22475a.addURI("com.android.contacts", "contacts/#/photo", 2);
        f22475a.addURI("com.android.contacts", "contacts/#", 3);
        f22475a.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        f22475a.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public aem(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: a */
    protected final /* synthetic */ void mo11624a(Object obj) {
        ((InputStream) obj).close();
    }

    /* renamed from: a */
    public final Class mo186a() {
        return InputStream.class;
    }

    /* renamed from: a */
    protected final /* synthetic */ Object mo11623a(Uri uri, ContentResolver contentResolver) {
        Object openContactPhotoInputStream;
        switch (f22475a.match(uri)) {
            case 1:
            case 5:
                Uri lookupContact = Contacts.lookupContact(contentResolver, uri);
                if (lookupContact != null) {
                    openContactPhotoInputStream = Contacts.openContactPhotoInputStream(contentResolver, lookupContact, true);
                    break;
                }
                throw new FileNotFoundException("Contact cannot be found");
            case 3:
                openContactPhotoInputStream = Contacts.openContactPhotoInputStream(contentResolver, uri, true);
                break;
            default:
                openContactPhotoInputStream = contentResolver.openInputStream(uri);
                break;
        }
        if (openContactPhotoInputStream != null) {
            return openContactPhotoInputStream;
        }
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
        stringBuilder.append("InputStream is null for ");
        stringBuilder.append(valueOf);
        throw new FileNotFoundException(stringBuilder.toString());
    }
}
