import java.util.PriorityQueue;
class ProrityQueueExample{
	public static void main(String args[]){
	PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
	pQueue.add(20);
	pQueue.add(10);
	pQueue.add(15);
	
	System.out.println(pQueue);
	int size=pQueue.size();
	System.out.println(size);
	for(int i = 0;i<size;i++){
		System.out.println(pQueue.poll());
		
		}
	}
	
}