package p000;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: PG */
/* renamed from: iqk */
class iqk implements NavigableMap {
    /* renamed from: a */
    private final NavigableMap f7686a;

    iqk(NavigableMap navigableMap) {
        this.f7686a = navigableMap;
    }

    public Entry ceilingEntry(Object obj) {
        return this.f7686a.ceilingEntry(obj);
    }

    public Object ceilingKey(Object obj) {
        return this.f7686a.ceilingKey(obj);
    }

    public void clear() {
        this.f7686a.clear();
    }

    public Comparator comparator() {
        return this.f7686a.comparator();
    }

    public boolean containsKey(Object obj) {
        return this.f7686a.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f7686a.containsValue(obj);
    }

    public NavigableSet descendingKeySet() {
        return this.f7686a.descendingKeySet();
    }

    public NavigableMap descendingMap() {
        return this.f7686a.descendingMap();
    }

    public Set entrySet() {
        return this.f7686a.entrySet();
    }

    public Entry firstEntry() {
        return this.f7686a.firstEntry();
    }

    public Object firstKey() {
        return this.f7686a.firstKey();
    }

    public Entry floorEntry(Object obj) {
        return this.f7686a.floorEntry(obj);
    }

    public Object floorKey(Object obj) {
        return this.f7686a.floorKey(obj);
    }

    public Object get(Object obj) {
        return this.f7686a.get(obj);
    }

    public SortedMap headMap(Object obj) {
        return this.f7686a.headMap(obj);
    }

    public NavigableMap headMap(Object obj, boolean z) {
        return this.f7686a.headMap(obj, z);
    }

    public Entry higherEntry(Object obj) {
        return this.f7686a.higherEntry(obj);
    }

    public Object higherKey(Object obj) {
        return this.f7686a.higherKey(obj);
    }

    public boolean isEmpty() {
        return this.f7686a.isEmpty();
    }

    public Set keySet() {
        return this.f7686a.keySet();
    }

    public Entry lastEntry() {
        return this.f7686a.lastEntry();
    }

    public Object lastKey() {
        return this.f7686a.lastKey();
    }

    public Entry lowerEntry(Object obj) {
        return this.f7686a.lowerEntry(obj);
    }

    public Object lowerKey(Object obj) {
        return this.f7686a.lowerKey(obj);
    }

    public NavigableSet navigableKeySet() {
        return this.f7686a.navigableKeySet();
    }

    public Entry pollFirstEntry() {
        return this.f7686a.pollFirstEntry();
    }

    public Entry pollLastEntry() {
        return this.f7686a.pollLastEntry();
    }

    public Object put(Object obj, Object obj2) {
        return this.f7686a.put(obj, obj2);
    }

    public void putAll(Map map) {
        this.f7686a.putAll(map);
    }

    public Object remove(Object obj) {
        return this.f7686a.remove(obj);
    }

    public int size() {
        return this.f7686a.size();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return this.f7686a.subMap(obj, obj2);
    }

    public NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return this.f7686a.subMap(obj, z, obj2, z2);
    }

    public SortedMap tailMap(Object obj) {
        return this.f7686a.tailMap(obj);
    }

    public NavigableMap tailMap(Object obj, boolean z) {
        return this.f7686a.tailMap(obj, z);
    }

    public Collection values() {
        return this.f7686a.values();
    }
}
