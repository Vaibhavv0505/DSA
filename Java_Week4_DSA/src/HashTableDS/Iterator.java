package HashTableDS;


public class Iterator {
	
	
	private int length;
	private HashTable map;
	private int current_index;
	
	public Iterator(HashTable map) {
		this.length = Size.getSize(map);
		this.map = map;
		this.current_index = 0;
		
	}
	
	public boolean hasNext() {
		boolean exist = false;
		if(this.current_index < this.length) {
			exist = true;
		}
		return exist;
	}
	
	public HashNode next() {
		HashNode next_node = null;
		if(this.current_index < this.length) {
			int key = this.map.keys.get(current_index);
			int value = GetValueByKey.getValueByKey(map, key);
			next_node = new HashNode(key, value);
			this.current_index++;
		}
		
		return next_node;
	}
	
}
