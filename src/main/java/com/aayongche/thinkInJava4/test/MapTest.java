package com.aayongche.thinkInJava4.test;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2016/5/24.
 */
public class MapTest implements Map{

    static class Mapaa implements Map.Entry{

        public Object getKey() {
            return null;
        }

        public Object getValue() {
            return null;
        }

        public Object setValue(Object value) {
            return null;
        }
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean containsKey(Object key) {
        return false;
    }

    public boolean containsValue(Object value) {
        return false;
    }

    public Object get(Object key) {
        return null;
    }

    public Object put(Object key, Object value) {
        return null;
    }

    public Object remove(Object key) {
        return null;
    }

    public void putAll(Map m) {

    }

    public void clear() {

    }

    public Set keySet() {
        return null;
    }

    public Collection values() {
        return null;
    }

    public Set<Entry> entrySet() {
        return null;
    }
}
