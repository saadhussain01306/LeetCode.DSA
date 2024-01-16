class RandomizedSet {

    public HashSet<Integer> hashSet ;
    public Random random ;

    public RandomizedSet() {
        hashSet = new HashSet<>(); 
        random = new Random();
    }

    public boolean insert(int val) {
        if (hashSet.contains(val)) return false;
         hashSet.add(val);
         return true;
    }

    public boolean remove(int val) {
        if (!hashSet.contains(val)) return false;
        hashSet.remove(val);
        return true;
    }
    
    public int getRandom() {
        Integer[] arrayNumbers = hashSet.toArray(new Integer[hashSet.size()]);
        return arrayNumbers[random.nextInt(hashSet.size())];    
    }
 
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
