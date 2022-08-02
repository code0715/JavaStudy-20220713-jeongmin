package j16_제네릭;

import lombok.Data;

@Data
public class GenericTest<K, V> {//T=타입 E=엘리먼트(객체)
	private K key;
	private V value;
}
