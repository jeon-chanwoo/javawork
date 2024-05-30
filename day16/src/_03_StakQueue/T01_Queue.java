package _03_StakQueue;

import java.util.LinkedList;
import java.util.Queue;

class Message{
	String command;
	String to;
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
	@Override
	public String toString() {
		return "Message [command=" + command + ", to=" + to + "]";
	}
	
}

public class T01_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> msgQueue = new LinkedList<Message>();
		msgQueue.offer(new Message("내용1","수신자1"));
		msgQueue.offer(new Message("내용2","수신자2"));
		msgQueue.offer(new Message("내용3","수신자3"));
	
		System.out.println(msgQueue);
	}
	

}
