package package4;

public class MapTest {

private int size = 0;
private String[] keys = new String[size];
private String[] values = new String[size];

String put(String key, String value) {
	size ++;
	String[] tmp = keys;
	keys = new String[size];
	for(int i=0;i<tmp.length;i++) {
		keys[i] = tmp[i];
	}
	keys[size-1] = key;
	
	tmp = values;
	values = new String[size];
	for(int i=0;i<tmp.length;i++) {
		values[i] = tmp[i];
	}
	values[size-1] = value;
	return key;
}
int size() {
	return size;
}
int indexOf(String key) {
	for(int i=0;i<keys.length;i++) {
		if(keys[i].equals(key)) {
			return i;
		}
	}
	return -1;}}