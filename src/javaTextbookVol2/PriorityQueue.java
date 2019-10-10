//package javaTextbookVol2;
//
//import java.util.*;
//
//public class PriorityQueue {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Queue pq = new PriorityQueue();	//왜 오류가 날까.
//		pq.offer(3);	//pq.offer(new Integer(3)); 오토박싱
//		pq.offer(1);
//		pq.offer(5);
//		pq.offer(2);
//		pq.offer(4);
//		
//		System.out.println(pq);	//pq의 내부배열 출력
//		
//		Object obj = null;
//		
//		//PriorityQueue에 저장된 요소를 하나씩 꺼낸다
//		while((obj = pq.poll()) != null) {
//			System.out.println(obj);
//		}
//		
//		
//	}
//
//}
