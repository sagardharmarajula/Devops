public class day1 {
public static void main(String[] args) {
	int arr[] = new int[5]; 
	arr[0]=20;
	arr[1]=11;
	arr[2]=89;
	arr[3]=12;
	arr[4]=17;
	int arr2[] = new int[5];
	
	for (int i=0; i<=4;i++) {
		arr2[i]=arr[i];
	}
	//testing
	
	for (int i=0; i<=4; i++) {
		System.out.println(arr2[i]);
	}
	
}
}
