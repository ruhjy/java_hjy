package ch13.exercise.example04;

public class Util {
//	// 제네릭 제한 제네릭 타입 메서드명
//	public static <K extends Comparable<? super K>, V> Comparator<Map.Entry<K, V>> comparingByKey() {
//		return (Comparator<Map.Entry<K, V>> & Serializable) (c1, c2) -> c1.getKey().compareTo(c2.getKey());
//	}

//	public static <T extends Pair<K, V>, K, V> V getValue(T type, K key) {
//
//		System.out.println("(" + type.getClass().getSimpleName() + ", " + key.getClass().getSimpleName() + ")");
//
//		if (type.getKey().equals(key)) {
//			return type.getValue();
//		}
//		return null;
//
//	}

	public static <P extends Pair<K, V>, K, V> V getValue(P pair, K key) {
		K k = pair.getKey();

		if (k.equals(key)) {
			return pair.getValue();
		}
		return null;
	}
}
