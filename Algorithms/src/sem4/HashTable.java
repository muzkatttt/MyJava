package sem4;


public class HashTable<K, V> {
    private static final int DEFAULT_SIZE = 4;
    private static final double LOAD_FACTOR = 0.75;
    private int size;
    private Bucket<K, V>[] buckets;

    public HashTable() {
        this(DEFAULT_SIZE);
    }

    public HashTable(int _size) {
        if (_size <= DEFAULT_SIZE)
            buckets = new Bucket[DEFAULT_SIZE];
        else
            buckets = new Bucket[_size];
        size = 0;
    }

    private int calculateIndex(K key) {
        return Math.abs(key.hashCode() % buckets.length);
    }

    public boolean add(K key, V value) {
        if (buckets.length * LOAD_FACTOR < size)
            resize();
        int index = calculateIndex(key);
        Bucket<K, V> bucket = buckets[index];
        if (bucket == null) {
            bucket = new Bucket<>();
            buckets[index] = bucket;
        }
        boolean added = bucket.add(key, value);
        if (added)
            size++;
        return added;
    }

    public boolean remove(K key) {
        int index = calculateIndex(key);
        Bucket<K, V> bucket = buckets[index];
        if (bucket == null)
            return false;
        boolean removed = bucket.remove(key);
        if (removed)
            size--;
        return removed;
    }

    public void print() {
        for (var item : buckets) {
            if (item != null) {
                item.print();
                System.out.println();
            } else
                System.out.println("---");
        }
    }

    private void resize() {
        Bucket<K, V>[] old = buckets;
        buckets = new Bucket[old.length * 2];
        for (int i = 0; i < old.length; i++) {
            Bucket<K, V> bucket = old[i];
            if (bucket == null)
                continue;
            Bucket.Node currentNode = bucket.root;
            while (currentNode != null) {
                this.add((K) currentNode.pair.key, (V) currentNode.pair.value);
                currentNode = currentNode.next;
            }
            old[i] = null;
        }
        old = null;
    }

    private class Bucket<K, V> {
        Node root;

        public boolean add(Pair pair) {
            Node newNode = new Node();
            newNode.pair = pair;
            if (root == null) {
                root = newNode;
                return true;
            }
            Node currentNode = root;
            while (currentNode != null) {
                if (currentNode.pair.key.equals(pair.key))
                    return false;
                if (currentNode.next == null) {
                    currentNode.next = newNode;
                    return true;
                }
                currentNode = currentNode.next;
            }
            return false;
        }

        public boolean add(K key, V value) {
            Pair pair = new Pair(key, value);
            return this.add(pair);
        }

        public boolean remove(K key) {
            if (root == null) return false;
            if (root.pair.key.equals(key)) {
                root = root.next;
                return true;
            }
            Node currentNode = root;
            while (currentNode.next != null) {
                if (currentNode.next.pair.key.equals(key)) {
                    currentNode.next = currentNode.next.next;
                    return true;
                }
                currentNode = currentNode.next;
            }
            return false;
        }

        public V getValue(K key) {
            Node currentNode = root;
            while (currentNode != null) {
                if (currentNode.pair.key.equals(key))
                    return currentNode.pair.value;
                currentNode = currentNode.next;
            }
            return null;
        }

        public boolean set(K key, V value) {
            Node currentNode = root;
            while (currentNode != null) {
                if (currentNode.pair.key.equals(key)) {
                    currentNode.pair.value = value;
                    return true;
                }
                currentNode = currentNode.next;
            }
            return false;
        }

        public void print() {
            Node currentNode = root;
            while (currentNode != null) {
                System.out.print("[" + currentNode.pair.key + ";" + currentNode.pair.value + "]");
                currentNode = currentNode.next;
            }
        }

        private class Node {
            Pair pair;
            Node next;
        }

        private class Pair {
            K key;
            V value;

            public Pair() {
            }

            public Pair(K _key, V _value) {
                this.key = _key;
                this.value = _value;
            }
        }
    }
}
